package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2Volume extends StObject {
  
  /**
    * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
    */
  var cloudSqlInstance: js.UndefOr[SchemaGoogleCloudRunV2CloudSqlInstance] = js.undefined
  
  /**
    * Required. Volume's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: js.UndefOr[SchemaGoogleCloudRunV2SecretVolumeSource] = js.undefined
}
object SchemaGoogleCloudRunV2Volume {
  
  inline def apply(): SchemaGoogleCloudRunV2Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2Volume]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2Volume](x: Self) {
    
    inline def setCloudSqlInstance(value: SchemaGoogleCloudRunV2CloudSqlInstance): Self = StObject.set(x, "cloudSqlInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlInstanceUndefined: Self = StObject.set(x, "cloudSqlInstance", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: SchemaGoogleCloudRunV2SecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
