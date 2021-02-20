package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing the details of the specified Android application APK.
  */
@js.native
trait SchemaGetApkDetailsResponse extends StObject {
  
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
  implicit class SchemaGetApkDetailsResponseMutableBuilder[Self <: SchemaGetApkDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApkDetail(value: SchemaApkDetail): Self = StObject.set(x, "apkDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApkDetailUndefined: Self = StObject.set(x, "apkDetail", js.undefined)
  }
}
