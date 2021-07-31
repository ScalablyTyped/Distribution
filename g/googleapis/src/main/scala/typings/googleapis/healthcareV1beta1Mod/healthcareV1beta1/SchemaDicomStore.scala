package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a DICOM store.
  */
trait SchemaDicomStore extends StObject {
  
  /**
    * User-supplied key-value pairs used to organize DICOM stores.  Label keys
    * must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Output only. Resource name of the DICOM store, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Notification destination for new DICOM instances. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.undefined
}
object SchemaDicomStore {
  
  @scala.inline
  def apply(): SchemaDicomStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomStore]
  }
  
  @scala.inline
  implicit class SchemaDicomStoreMutableBuilder[Self <: SchemaDicomStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
  }
}
