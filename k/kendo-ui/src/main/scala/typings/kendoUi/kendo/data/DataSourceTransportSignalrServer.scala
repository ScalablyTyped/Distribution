package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportSignalrServer extends StObject {
  
  var create: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[String] = js.native
  
  var read: js.UndefOr[String] = js.native
  
  var update: js.UndefOr[String] = js.native
}
object DataSourceTransportSignalrServer {
  
  @scala.inline
  def apply(): DataSourceTransportSignalrServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportSignalrServer]
  }
  
  @scala.inline
  implicit class DataSourceTransportSignalrServerMutableBuilder[Self <: DataSourceTransportSignalrServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
