package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Presenter extends StObject {
  
  /** The device resource name of the device which requested the current presenter to be set. This field can not be modified by clients. */
  var byDeviceId: js.UndefOr[String] = js.undefined
  
  /** The device resource names of other devices which can control the current presentation. */
  var copresenterDeviceIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The device resource name of the currently presenting device. */
  var presenterDeviceId: js.UndefOr[String] = js.undefined
}
object Presenter {
  
  inline def apply(): Presenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presenter]
  }
  
  extension [Self <: Presenter](x: Self) {
    
    inline def setByDeviceId(value: String): Self = StObject.set(x, "byDeviceId", value.asInstanceOf[js.Any])
    
    inline def setByDeviceIdUndefined: Self = StObject.set(x, "byDeviceId", js.undefined)
    
    inline def setCopresenterDeviceIds(value: js.Array[String]): Self = StObject.set(x, "copresenterDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setCopresenterDeviceIdsUndefined: Self = StObject.set(x, "copresenterDeviceIds", js.undefined)
    
    inline def setCopresenterDeviceIdsVarargs(value: String*): Self = StObject.set(x, "copresenterDeviceIds", js.Array(value*))
    
    inline def setPresenterDeviceId(value: String): Self = StObject.set(x, "presenterDeviceId", value.asInstanceOf[js.Any])
    
    inline def setPresenterDeviceIdUndefined: Self = StObject.set(x, "presenterDeviceId", js.undefined)
  }
}
