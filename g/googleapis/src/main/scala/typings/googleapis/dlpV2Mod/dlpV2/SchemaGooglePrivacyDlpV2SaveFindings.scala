package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If set, the detailed findings will be persisted to the specified
  * OutputStorageConfig. Only a single instance of this action can be
  * specified. Compatible with: Inspect, Risk
  */
@js.native
trait SchemaGooglePrivacyDlpV2SaveFindings extends js.Object {
  
  var outputConfig: js.UndefOr[SchemaGooglePrivacyDlpV2OutputStorageConfig] = js.native
}
object SchemaGooglePrivacyDlpV2SaveFindings {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SaveFindings]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2SaveFindingsOps[Self <: SchemaGooglePrivacyDlpV2SaveFindings] (val x: Self) extends AnyVal {
    
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
    def setOutputConfig(value: SchemaGooglePrivacyDlpV2OutputStorageConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
}
