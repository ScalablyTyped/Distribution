package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing the details of the specified Android application APK.
  */
@js.native
trait SchemaGetApkDetailsResponse extends js.Object {
  
  /**
    * Details of the Android APK.
    */
  var apkDetail: js.UndefOr[SchemaApkDetail] = js.native
}
object SchemaGetApkDetailsResponse {
  
  @scala.inline
  def apply(): SchemaGetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetApkDetailsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetApkDetailsResponseOps[Self <: SchemaGetApkDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setApkDetail(value: SchemaApkDetail): Self = this.set("apkDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApkDetail: Self = this.set("apkDetail", js.undefined)
  }
}
