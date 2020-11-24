package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
  /** Represents a list of available feature names for a given version. */
  var availableFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether this is currently the default version for Cloud Data Fusion */
  var defaultVersion: js.UndefOr[Boolean] = js.native
  
  /** The version number of the Data Fusion instance, such as '6.0.1.0'. */
  var versionNumber: js.UndefOr[String] = js.native
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableFeaturesVarargs(value: String*): Self = this.set("availableFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAvailableFeatures(value: js.Array[String]): Self = this.set("availableFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableFeatures: Self = this.set("availableFeatures", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Boolean): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: String): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
}
