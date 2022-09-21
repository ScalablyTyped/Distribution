package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1SdkVersion extends StObject {
  
  /**
    * The support status for this SDK version.
    */
  var sdkSupportStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the SDK used to run the job.
    */
  var version: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A readable string describing the version of the SDK.
    */
  var versionDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1SdkVersion {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1SdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1SdkVersion]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1SdkVersion](x: Self) {
    
    inline def setSdkSupportStatus(value: String): Self = StObject.set(x, "sdkSupportStatus", value.asInstanceOf[js.Any])
    
    inline def setSdkSupportStatusNull: Self = StObject.set(x, "sdkSupportStatus", null)
    
    inline def setSdkSupportStatusUndefined: Self = StObject.set(x, "sdkSupportStatus", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionDisplayName(value: String): Self = StObject.set(x, "versionDisplayName", value.asInstanceOf[js.Any])
    
    inline def setVersionDisplayNameNull: Self = StObject.set(x, "versionDisplayName", null)
    
    inline def setVersionDisplayNameUndefined: Self = StObject.set(x, "versionDisplayName", js.undefined)
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
