package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options defining a data set within Google Cloud Datastore.
  */
trait SchemaGooglePrivacyDlpV2DatastoreOptions extends StObject {
  
  /**
    * The kind to process.
    */
  var kind: js.UndefOr[SchemaGooglePrivacyDlpV2KindExpression] = js.undefined
  
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[SchemaGooglePrivacyDlpV2PartitionId] = js.undefined
}
object SchemaGooglePrivacyDlpV2DatastoreOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DatastoreOptions](x: Self) {
    
    inline def setKind(value: SchemaGooglePrivacyDlpV2KindExpression): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPartitionId(value: SchemaGooglePrivacyDlpV2PartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
  }
}
