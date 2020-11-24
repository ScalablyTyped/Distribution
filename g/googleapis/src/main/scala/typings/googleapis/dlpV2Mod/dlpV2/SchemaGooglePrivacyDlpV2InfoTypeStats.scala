package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics regarding a specific InfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeStats extends js.Object {
  
  /**
    * Number of findings for this infoType.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * The type of finding this stat is for.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeStats {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeStats]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeStatsOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeStats] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
  }
}
