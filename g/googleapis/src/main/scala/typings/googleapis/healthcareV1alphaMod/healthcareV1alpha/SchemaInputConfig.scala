package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the location(s) from which data should be imported.
  */
trait SchemaInputConfig extends StObject {
  
  /**
    * Files on Google Cloud Storage. To enable the Cloud Healthcare API to read
    * from resources in your project (e.g. Google Cloud Storage buckets), you
    * must give the consumer Cloud Healthcare API service account the proper
    * permissions. The service account is:
    * `service-{PROJECT_NUMBER}@gcp-sa-healthcare.iam.gserviceaccount.com`. The
    * PROJECT_NUMBER identifies the project that contains the source Google
    * Cloud Storage bucket. To get the project number, go to the GCP Console
    * Dashboard.  GcsSource requires the `roles/storage.objectViewer` Cloud IAM
    * role.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alphaGcsSource] = js.undefined
}
object SchemaInputConfig {
  
  @scala.inline
  def apply(): SchemaInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputConfig]
  }
  
  @scala.inline
  implicit class SchemaInputConfigMutableBuilder[Self <: SchemaInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1alphaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
