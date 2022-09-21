package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionProfile extends StObject {
  
  /**
    * A CloudSQL database connection profile.
    */
  var cloudsql: js.UndefOr[SchemaCloudSqlConnectionProfile] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The connection profile display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The error details in case of state FAILED.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" \}`.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A MySQL database connection profile.
    */
  var mysql: js.UndefOr[SchemaMySqlConnectionProfile] = js.undefined
  
  /**
    * The name of this connection profile resource in the form of projects/{project\}/locations/{location\}/connectionProfiles/{connectionProfile\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A PostgreSQL database connection profile.
    */
  var postgresql: js.UndefOr[SchemaPostgreSqlConnectionProfile] = js.undefined
  
  /**
    * The database provider.
    */
  var provider: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current connection profile state (e.g. DRAFT, READY, or FAILED).
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectionProfile {
  
  inline def apply(): SchemaConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionProfile]
  }
  
  extension [Self <: SchemaConnectionProfile](x: Self) {
    
    inline def setCloudsql(value: SchemaCloudSqlConnectionProfile): Self = StObject.set(x, "cloudsql", value.asInstanceOf[js.Any])
    
    inline def setCloudsqlUndefined: Self = StObject.set(x, "cloudsql", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMysql(value: SchemaMySqlConnectionProfile): Self = StObject.set(x, "mysql", value.asInstanceOf[js.Any])
    
    inline def setMysqlUndefined: Self = StObject.set(x, "mysql", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostgresql(value: SchemaPostgreSqlConnectionProfile): Self = StObject.set(x, "postgresql", value.asInstanceOf[js.Any])
    
    inline def setPostgresqlUndefined: Self = StObject.set(x, "postgresql", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
