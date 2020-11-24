package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGooglePrivacyDlpV2FindingLimits extends js.Object {
  
  /**
    * Configuration of findings limit given for specified infoTypes.
    */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]] = js.native
  
  /**
    * Max number of findings that will be returned for each item scanned. When
    * set within `InspectDataSourceRequest`, the maximum returned is 2000
    * regardless if this is set higher. When set within
    * `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double] = js.native
  
  /**
    * Max number of findings that will be returned per request/job. When set
    * within `InspectContentRequest`, the maximum returned is 2000 regardless
    * if this is set higher.
    */
  var maxFindingsPerRequest: js.UndefOr[Double] = js.native
}
object SchemaGooglePrivacyDlpV2FindingLimits {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FindingLimits]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FindingLimitsOps[Self <: SchemaGooglePrivacyDlpV2FindingLimits] (val x: Self) extends AnyVal {
    
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
    def setMaxFindingsPerInfoTypeVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeLimit*): Self = this.set("maxFindingsPerInfoType", js.Array(value :_*))
    
    @scala.inline
    def setMaxFindingsPerInfoType(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]): Self = this.set("maxFindingsPerInfoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFindingsPerInfoType: Self = this.set("maxFindingsPerInfoType", js.undefined)
    
    @scala.inline
    def setMaxFindingsPerItem(value: Double): Self = this.set("maxFindingsPerItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFindingsPerItem: Self = this.set("maxFindingsPerItem", js.undefined)
    
    @scala.inline
    def setMaxFindingsPerRequest(value: Double): Self = this.set("maxFindingsPerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFindingsPerRequest: Self = this.set("maxFindingsPerRequest", js.undefined)
  }
}
