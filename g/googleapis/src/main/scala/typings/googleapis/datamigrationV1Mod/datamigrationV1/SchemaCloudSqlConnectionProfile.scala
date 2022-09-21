package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSqlConnectionProfile extends StObject {
  
  /**
    * Output only. The Cloud SQL instance ID that this connection profile is associated with.
    */
  var cloudSqlId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Cloud SQL database instance's private IP.
    */
  var privateIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Cloud SQL database instance's public IP.
    */
  var publicIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Metadata used to create the destination Cloud SQL database.
    */
  var settings: js.UndefOr[SchemaCloudSqlSettings] = js.undefined
}
object SchemaCloudSqlConnectionProfile {
  
  inline def apply(): SchemaCloudSqlConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSqlConnectionProfile]
  }
  
  extension [Self <: SchemaCloudSqlConnectionProfile](x: Self) {
    
    inline def setCloudSqlId(value: String): Self = StObject.set(x, "cloudSqlId", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlIdNull: Self = StObject.set(x, "cloudSqlId", null)
    
    inline def setCloudSqlIdUndefined: Self = StObject.set(x, "cloudSqlId", js.undefined)
    
    inline def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpNull: Self = StObject.set(x, "privateIp", null)
    
    inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpNull: Self = StObject.set(x, "publicIp", null)
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    
    inline def setSettings(value: SchemaCloudSqlSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
