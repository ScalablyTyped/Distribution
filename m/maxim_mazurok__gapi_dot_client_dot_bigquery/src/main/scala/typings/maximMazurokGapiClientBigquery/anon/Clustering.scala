package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.RangePartitioning
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TableReference
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TimePartitioning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clustering extends StObject {
  
  /** [Beta] Clustering specification for this table, if configured. */
  var clustering: js.UndefOr[typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.Clustering] = js.native
  
  /** The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their
    * storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /** The user-friendly name for this table. */
  var friendlyName: js.UndefOr[String] = js.native
  
  /** An opaque ID of the table */
  var id: js.UndefOr[String] = js.native
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The labels associated with this table. You can use these to organize and group your tables. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Clustering with TopLevel[js.Any]
  ] = js.native
  
  /** The range partitioning specification for this table, if configured. */
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  
  /** A reference uniquely identifying the table. */
  var tableReference: js.UndefOr[TableReference] = js.native
  
  /** The time-based partitioning specification for this table, if configured. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  
  /** The type of table. Possible values are: TABLE, VIEW. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Additional details for a view. */
  var view: js.UndefOr[UseLegacySql] = js.native
}
object Clustering {
  
  @scala.inline
  def apply(): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clustering]
  }
  
  @scala.inline
  implicit class ClusteringMutableBuilder[Self <: Clustering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClustering(value: typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Clustering with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    @scala.inline
    def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: UseLegacySql): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
