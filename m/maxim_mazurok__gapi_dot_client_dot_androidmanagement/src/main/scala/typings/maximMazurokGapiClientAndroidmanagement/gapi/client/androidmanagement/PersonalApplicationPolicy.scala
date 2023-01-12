package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonalApplicationPolicy extends StObject {
  
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.undefined
  
  /** The package name of the application. */
  var packageName: js.UndefOr[String] = js.undefined
}
object PersonalApplicationPolicy {
  
  inline def apply(): PersonalApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonalApplicationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonalApplicationPolicy] (val x: Self) extends AnyVal {
    
    inline def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    inline def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
