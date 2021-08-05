package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProfile extends StObject {
  
  /** A CloudSQL database connection profile. */
  var cloudsql: js.UndefOr[CloudSqlConnectionProfile] = js.undefined
  
  /** Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The connection profile display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The error details in case of state FAILED. */
  var error: js.UndefOr[Status] = js.undefined
  
  /**
    * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
    * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.ConnectionProfile & TopLevel[js.Any]
  ] = js.undefined
  
  /** A MySQL database connection profile. */
  var mysql: js.UndefOr[MySqlConnectionProfile] = js.undefined
  
  /** The name of this connection profile resource in the form of projects/{project}/locations/{location}/instances/{instance}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The database provider. */
  var provider: js.UndefOr[String] = js.undefined
  
  /** The current connection profile state (e.g. DRAFT, READY, or FAILED). */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The timestamp when the resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ConnectionProfile {
  
  inline def apply(): ConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionProfile]
  }
  
  extension [Self <: ConnectionProfile](x: Self) {
    
    inline def setCloudsql(value: CloudSqlConnectionProfile): Self = StObject.set(x, "cloudsql", value.asInstanceOf[js.Any])
    
    inline def setCloudsqlUndefined: Self = StObject.set(x, "cloudsql", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.ConnectionProfile & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMysql(value: MySqlConnectionProfile): Self = StObject.set(x, "mysql", value.asInstanceOf[js.Any])
    
    inline def setMysqlUndefined: Self = StObject.set(x, "mysql", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
