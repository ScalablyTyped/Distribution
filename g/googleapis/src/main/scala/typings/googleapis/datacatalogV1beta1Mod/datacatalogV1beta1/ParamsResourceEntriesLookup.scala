package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntriesLookup
  extends StObject
     with StandardParameters {
  
  /**
    * The full name of the Google Cloud Platform resource the Data Catalog entry represents. See: https://cloud.google.com/apis/design/resource_names#full_resource_name. Full names are case-sensitive. Examples: * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId * //pubsub.googleapis.com/projects/projectId/topics/topicId
    */
  var linkedResource: js.UndefOr[String] = js.undefined
  
  /**
    * The SQL name of the entry. SQL names are case-sensitive. Examples: * `pubsub.project_id.topic_id` * ``pubsub.project_id.`topic.id.with.dots` `` * `bigquery.table.project_id.dataset_id.table_id` * `bigquery.dataset.project_id.dataset_id` * `datacatalog.entry.project_id.location_id.entry_group_id.entry_id` `*_id`s should satisfy the standard SQL rules for identifiers. https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
    */
  var sqlResource: js.UndefOr[String] = js.undefined
}
object ParamsResourceEntriesLookup {
  
  inline def apply(): ParamsResourceEntriesLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntriesLookup]
  }
  
  extension [Self <: ParamsResourceEntriesLookup](x: Self) {
    
    inline def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    inline def setSqlResource(value: String): Self = StObject.set(x, "sqlResource", value.asInstanceOf[js.Any])
    
    inline def setSqlResourceUndefined: Self = StObject.set(x, "sqlResource", js.undefined)
  }
}
