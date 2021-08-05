package typings.jasmineFixture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Affixes the given jquery selectors into the element and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  def affix(selector: String): JQuery
}
object JQuery {
  
  inline def apply(affix: String => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(affix = js.Any.fromFunction1(affix))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setAffix(value: String => JQuery): Self = StObject.set(x, "affix", js.Any.fromFunction1(value))
  }
}
