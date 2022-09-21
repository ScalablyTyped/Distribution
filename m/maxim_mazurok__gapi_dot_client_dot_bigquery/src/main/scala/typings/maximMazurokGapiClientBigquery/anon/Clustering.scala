package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.RangePartitioning
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TableReference
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TimePartitioning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clustering extends StObject {
  
  /** [Beta] Clustering specification for this table, if configured. */
  var clustering: js.UndefOr[typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.Clustering] = js.undefined
  
  /** The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their
    * storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** The user-friendly name for this table. */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /** An opaque ID of the table */
  var id: js.UndefOr[String] = js.undefined
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The labels associated with this table. You can use these to organize and group your tables. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Clustering & TopLevel[Any]
  ] = js.undefined
  
  /** The range partitioning specification for this table, if configured. */
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  
  /** A reference uniquely identifying the table. */
  var tableReference: js.UndefOr[TableReference] = js.undefined
  
  /** The time-based partitioning specification for this table, if configured. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  
  /** The type of table. Possible values are: TABLE, VIEW. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Additional details for a view. */
  var view: js.UndefOr[UseLegacySql] = js.undefined
}
object Clustering {
  
  inline def apply(): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clustering]
  }
  
  extension [Self <: Clustering](x: Self) {
    
    inline def setClustering(value: typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Clustering & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: UseLegacySql): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
