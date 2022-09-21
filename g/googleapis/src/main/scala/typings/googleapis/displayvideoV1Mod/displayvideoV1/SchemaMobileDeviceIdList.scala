package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileDeviceIdList extends StObject {
  
  /**
    * A list of mobile device IDs defining Customer Match audience members. The size of mobile_device_ids mustn't be greater than 500,000.
    */
  var mobileDeviceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMobileDeviceIdList {
  
  inline def apply(): SchemaMobileDeviceIdList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDeviceIdList]
  }
  
  extension [Self <: SchemaMobileDeviceIdList](x: Self) {
    
    inline def setMobileDeviceIds(value: js.Array[String]): Self = StObject.set(x, "mobileDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdsNull: Self = StObject.set(x, "mobileDeviceIds", null)
    
    inline def setMobileDeviceIdsUndefined: Self = StObject.set(x, "mobileDeviceIds", js.undefined)
    
    inline def setMobileDeviceIdsVarargs(value: String*): Self = StObject.set(x, "mobileDeviceIds", js.Array(value*))
  }
}
