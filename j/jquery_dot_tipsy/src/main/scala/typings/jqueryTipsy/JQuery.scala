package typings.jqueryTipsy

import typings.jqueryTipsy.JQueryTipsy.Options
import typings.jqueryTipsy.JQueryTipsy.Tipsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * initialize tipsy plugin
    */
  /**
    * initialize tipsy plugin
    */
  def tipsy(): JQuery
  def tipsy(options: Options): JQuery
  /**
    * initialize tipsy plugin
    */
  @JSName("tipsy")
  var tipsy_Original: Tipsy
}
object JQuery {
  
  inline def apply(tipsy: Tipsy): JQuery = {
    val __obj = js.Dynamic.literal(tipsy = tipsy.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTipsy(value: Tipsy): Self = StObject.set(x, "tipsy", value.asInstanceOf[js.Any])
  }
}
