package typings.jasmineFixture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Affixes the given jquery selectors into the body and will be removed after each spec
    * @param selector The JQuery selector to be added to the dom
    */
  inline def affix(selector: String): JQuery = js.Dynamic.global.applyDynamic("affix")(selector.asInstanceOf[js.Any]).asInstanceOf[JQuery]
}
