package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTransport extends StObject {
  
  var discover: js.UndefOr[js.Any] = js.native
  
  var read: js.UndefOr[js.Any] = js.native
}
object PivotTransport {
  
  @scala.inline
  def apply(): PivotTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransport]
  }
  
  @scala.inline
  implicit class PivotTransportMutableBuilder[Self <: PivotTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscover(value: js.Any): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    @scala.inline
    def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
