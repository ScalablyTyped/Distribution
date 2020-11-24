package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The version of the SDK used to run the job.
  */
@js.native
trait SchemaSdkVersion extends js.Object {
  
  /**
    * The support status for this SDK version.
    */
  var sdkSupportStatus: js.UndefOr[String] = js.native
  
  /**
    * The version of the SDK used to run the job.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * A readable string describing the version of the SDK.
    */
  var versionDisplayName: js.UndefOr[String] = js.native
}
object SchemaSdkVersion {
  
  @scala.inline
  def apply(): SchemaSdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdkVersion]
  }
  
  @scala.inline
  implicit class SchemaSdkVersionOps[Self <: SchemaSdkVersion] (val x: Self) extends AnyVal {
    
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
    def setSdkSupportStatus(value: String): Self = this.set("sdkSupportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkSupportStatus: Self = this.set("sdkSupportStatus", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionDisplayName(value: String): Self = this.set("versionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionDisplayName: Self = this.set("versionDisplayName", js.undefined)
  }
}
