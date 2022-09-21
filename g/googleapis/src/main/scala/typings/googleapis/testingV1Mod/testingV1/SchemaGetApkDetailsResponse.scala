package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetApkDetailsResponse extends StObject {
  
  /**
    * Details of the Android APK.
    */
  var apkDetail: js.UndefOr[SchemaApkDetail] = js.undefined
}
object SchemaGetApkDetailsResponse {
  
  inline def apply(): SchemaGetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetApkDetailsResponse]
  }
  
  extension [Self <: SchemaGetApkDetailsResponse](x: Self) {
    
    inline def setApkDetail(value: SchemaApkDetail): Self = StObject.set(x, "apkDetail", value.asInstanceOf[js.Any])
    
    inline def setApkDetailUndefined: Self = StObject.set(x, "apkDetail", js.undefined)
  }
}
