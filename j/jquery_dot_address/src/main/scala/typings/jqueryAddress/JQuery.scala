package typings.jqueryAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Adds the plugin functionality to a DOM element and disables the default behavior. Designed primarily to support links and forms. 
    * Accepts an optional function parameter that allows custom processing of the deep link value.
    */
  def address(): JQuery
  /**
    * Adds the plugin functionality to a DOM element and disables the default behavior. Designed primarily to support links and forms. 
    * Accepts an optional function parameter that allows custom processing of the deep link value.
    */
  def address(fn: js.Function): JQuery
  @JSName("address")
  var address_Original: JQueryAddress
}
object JQuery {
  
  @scala.inline
  def apply(address: JQueryAddress): JQuery = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: JQueryAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
