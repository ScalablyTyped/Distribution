package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteLockEvent extends StObject {
  
  /** Package name of the admin app requesting the change. */
  var adminPackageName: js.UndefOr[String] = js.undefined
  
  /** User ID of the admin app from the which the change was requested. */
  var adminUserId: js.UndefOr[Double] = js.undefined
  
  /** User ID in which the change was requested in. */
  var targetUserId: js.UndefOr[Double] = js.undefined
}
object RemoteLockEvent {
  
  inline def apply(): RemoteLockEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteLockEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteLockEvent] (val x: Self) extends AnyVal {
    
    inline def setAdminPackageName(value: String): Self = StObject.set(x, "adminPackageName", value.asInstanceOf[js.Any])
    
    inline def setAdminPackageNameUndefined: Self = StObject.set(x, "adminPackageName", js.undefined)
    
    inline def setAdminUserId(value: Double): Self = StObject.set(x, "adminUserId", value.asInstanceOf[js.Any])
    
    inline def setAdminUserIdUndefined: Self = StObject.set(x, "adminUserId", js.undefined)
    
    inline def setTargetUserId(value: Double): Self = StObject.set(x, "targetUserId", value.asInstanceOf[js.Any])
    
    inline def setTargetUserIdUndefined: Self = StObject.set(x, "targetUserId", js.undefined)
  }
}
