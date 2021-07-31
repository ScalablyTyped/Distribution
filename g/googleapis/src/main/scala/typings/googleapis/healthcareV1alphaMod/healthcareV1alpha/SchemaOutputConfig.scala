package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the location(s) to which data should be exported.
  */
trait SchemaOutputConfig extends StObject {
  
  /**
    * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor`
    * and `roles/bigquery.jobUser`.
    */
  var bigQueryDestination: js.UndefOr[SchemaBigQueryDestination] = js.undefined
  
  /**
    * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note
    * that writing a file to the same destination multiple times will result in
    * the previous version of the file being overwritten.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.undefined
}
object SchemaOutputConfig {
  
  @scala.inline
  def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  
  @scala.inline
  implicit class SchemaOutputConfigMutableBuilder[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQueryDestination(value: SchemaBigQueryDestination): Self = StObject.set(x, "bigQueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryDestinationUndefined: Self = StObject.set(x, "bigQueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
