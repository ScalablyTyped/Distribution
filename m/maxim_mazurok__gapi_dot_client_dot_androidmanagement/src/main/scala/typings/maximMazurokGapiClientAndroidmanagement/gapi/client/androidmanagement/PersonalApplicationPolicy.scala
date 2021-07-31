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
  
  @scala.inline
  def apply(): PersonalApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonalApplicationPolicy]
  }
  
  @scala.inline
  implicit class PersonalApplicationPolicyMutableBuilder[Self <: PersonalApplicationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
