package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEntriesLookup
  extends StObject
     with StandardParameters {
  
  /**
    * Fully qualified name (FQN) of the resource. FQNs take two forms: * For non-regionalized resources: `{SYSTEM\}:{PROJECT\}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS\}` * For regionalized resources: `{SYSTEM\}:{PROJECT\}.{LOCATION_ID\}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS\}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID\}.{LOCATION_ID\}.{INSTANCE_ID\}.{DATABASE_ID\}.{TABLE_ID\}`
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the Google Cloud Platform resource the Data Catalog entry represents. For more information, see [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). Full names are case-sensitive. For example: * `//bigquery.googleapis.com/projects/{PROJECT_ID\}/datasets/{DATASET_ID\}/tables/{TABLE_ID\}` * `//pubsub.googleapis.com/projects/{PROJECT_ID\}/topics/{TOPIC_ID\}`
    */
  var linkedResource: js.UndefOr[String] = js.undefined
  
  /**
    * The SQL name of the entry. SQL names are case-sensitive. Examples: * `pubsub.topic.{PROJECT_ID\}.{TOPIC_ID\}` * `pubsub.topic.{PROJECT_ID\}.`\``{TOPIC.ID.SEPARATED.WITH.DOTS\}`\` * `bigquery.table.{PROJECT_ID\}.{DATASET_ID\}.{TABLE_ID\}` * `bigquery.dataset.{PROJECT_ID\}.{DATASET_ID\}` * `datacatalog.entry.{PROJECT_ID\}.{LOCATION_ID\}.{ENTRY_GROUP_ID\}.{ENTRY_ID\}` Identifiers (`*_ID`) should comply with the [Lexical structure in Standard SQL] (https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical).
    */
  var sqlResource: js.UndefOr[String] = js.undefined
}
object ParamsResourceEntriesLookup {
  
  inline def apply(): ParamsResourceEntriesLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntriesLookup]
  }
  
  extension [Self <: ParamsResourceEntriesLookup](x: Self) {
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setLinkedResource(value: String): Self = StObject.set(x, "linkedResource", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourceUndefined: Self = StObject.set(x, "linkedResource", js.undefined)
    
    inline def setSqlResource(value: String): Self = StObject.set(x, "sqlResource", value.asInstanceOf[js.Any])
    
    inline def setSqlResourceUndefined: Self = StObject.set(x, "sqlResource", js.undefined)
  }
}
