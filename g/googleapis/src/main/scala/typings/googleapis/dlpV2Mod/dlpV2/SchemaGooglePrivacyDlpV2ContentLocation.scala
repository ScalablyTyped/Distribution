package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Findings container location data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentLocation extends StObject {
  
  /**
    * Name of the container where the finding is located. The top level name is
    * the source file name or table name. Names of some common storage
    * containers are formatted as follows:  * BigQuery tables:
    * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` * Cloud Storage
    * files: `gs://&lt;bucket&gt;/&lt;path&gt;` * Datastore namespace:
    * &lt;namespace&gt;  Nested names could be absent if the embedded object
    * has no string identifier (for an example an image contained within a
    * document).
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * Findings container modification timestamp, if applicable. For Google
    * Cloud Storage contains last file modification timestamp. For BigQuery
    * table contains last_modified_time property. For Datastore - not
    * populated.
    */
  var containerTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Findings container version, if available (&quot;generation&quot; for
    * Google Cloud Storage).
    */
  var containerVersion: js.UndefOr[String] = js.native
  
  /**
    * Location data for document files.
    */
  var documentLocation: js.UndefOr[SchemaGooglePrivacyDlpV2DocumentLocation] = js.native
  
  /**
    * Location within an image&#39;s pixels.
    */
  var imageLocation: js.UndefOr[SchemaGooglePrivacyDlpV2ImageLocation] = js.native
  
  /**
    * Location within a row or record of a database table.
    */
  var recordLocation: js.UndefOr[SchemaGooglePrivacyDlpV2RecordLocation] = js.native
}
object SchemaGooglePrivacyDlpV2ContentLocation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentLocation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ContentLocationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ContentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContainerTimestamp(value: String): Self = StObject.set(x, "containerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTimestampUndefined: Self = StObject.set(x, "containerTimestamp", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: String): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setDocumentLocation(value: SchemaGooglePrivacyDlpV2DocumentLocation): Self = StObject.set(x, "documentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLocationUndefined: Self = StObject.set(x, "documentLocation", js.undefined)
    
    @scala.inline
    def setImageLocation(value: SchemaGooglePrivacyDlpV2ImageLocation): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
    
    @scala.inline
    def setRecordLocation(value: SchemaGooglePrivacyDlpV2RecordLocation): Self = StObject.set(x, "recordLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordLocationUndefined: Self = StObject.set(x, "recordLocation", js.undefined)
  }
}
