package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchAppAction extends StObject {
  
  /** Package name of app to be launched */
  var packageName: js.UndefOr[String] = js.undefined
}
object LaunchAppAction {
  
  inline def apply(): LaunchAppAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchAppAction]
  }
  
  extension [Self <: LaunchAppAction](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
