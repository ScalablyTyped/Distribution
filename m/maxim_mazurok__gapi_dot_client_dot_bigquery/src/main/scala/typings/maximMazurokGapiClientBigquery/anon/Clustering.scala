package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.RangePartitioning
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TableReference
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.TimePartitioning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clustering extends js.Object {
  
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
  implicit class ClusteringOps[Self <: Clustering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClustering(value: typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Clustering with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = this.set("rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePartitioning: Self = this.set("rangePartitioning", js.undefined)
    
    @scala.inline
    def setTableReference(value: TableReference): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setView(value: UseLegacySql): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
