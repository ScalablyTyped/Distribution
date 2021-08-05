package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /**
    * Output only. Map from cluster ID to per-cluster table state. If it could not be determined whether or not the table has data in a particular cluster (for example, if its zone is
    * unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`. Views: `REPLICATION_VIEW`, `FULL`
    */
  var clusterStates: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ClusterState}
    */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table & TopLevel[js.Any]
  ] = js.undefined
  
  /** The column families configured for this table, mapped by column family ID. Views: `SCHEMA_VIEW`, `FULL` */
  var columnFamilies: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ColumnFamily}
    */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time,
    * the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
    */
  var granularity: js.UndefOr[String] = js.undefined
  
  /** The unique name of the table. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. If this table was restored from another data source (e.g. a backup), this field will be populated with information about the restore. */
  var restoreInfo: js.UndefOr[RestoreInfo] = js.undefined
}
object Table {
  
  inline def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setClusterStates(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ClusterState}
      */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table & TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterStates", value.asInstanceOf[js.Any])
    
    inline def setClusterStatesUndefined: Self = StObject.set(x, "clusterStates", js.undefined)
    
    inline def setColumnFamilies(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigtableadmin.gapi.client.bigtableadmin.ColumnFamily}
      */ typings.maximMazurokGapiClientBigtableadmin.maximMazurokGapiClientBigtableadminStrings.Table & TopLevel[js.Any]
    ): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    inline def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoreInfo(value: RestoreInfo): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
  }
}
