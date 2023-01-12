package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportSignalrClient extends StObject {
  
  var create: js.UndefOr[String] = js.undefined
  
  var destroy: js.UndefOr[String] = js.undefined
  
  var read: js.UndefOr[String] = js.undefined
  
  var update: js.UndefOr[String] = js.undefined
}
object DataSourceTransportSignalrClient {
  
  inline def apply(): DataSourceTransportSignalrClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportSignalrClient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceTransportSignalrClient] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
