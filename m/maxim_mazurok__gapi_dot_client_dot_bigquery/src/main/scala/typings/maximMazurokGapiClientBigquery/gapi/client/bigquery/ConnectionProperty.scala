package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProperty extends StObject {
  
  /** [Required] Name of the connection property to set. */
  var key: js.UndefOr[String] = js.undefined
  
  /** [Required] Value of the connection property. */
  var value: js.UndefOr[String] = js.undefined
}
object ConnectionProperty {
  
  @scala.inline
  def apply(): ConnectionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionProperty]
  }
  
  @scala.inline
  implicit class ConnectionPropertyMutableBuilder[Self <: ConnectionProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
