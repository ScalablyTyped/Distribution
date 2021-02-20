package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyFilter extends StObject {
  
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.native
  
  /** The property to filter by. */
  var property: js.UndefOr[PropertyReference] = js.native
  
  /** The value to compare the property to. */
  var value: js.UndefOr[Value] = js.native
}
object PropertyFilter {
  
  @scala.inline
  def apply(): PropertyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFilter]
  }
  
  @scala.inline
  implicit class PropertyFilterMutableBuilder[Self <: PropertyFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setProperty(value: PropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
