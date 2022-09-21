package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDicomConfig extends StObject {
  
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[SchemaTagFilterList] = js.undefined
  
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[SchemaTagFilterList] = js.undefined
  
  /**
    * If true, skip replacing StudyInstanceUID, SeriesInstanceUID, SOPInstanceUID, and MediaStorageSOPInstanceUID and leave them untouched. The Cloud Healthcare API regenerates these UIDs by default based on the DICOM Standard's reasoning: "Whilst these UIDs cannot be mapped directly to an individual out of context, given access to the original images, or to a database of the original images containing the UIDs, it would be possible to recover the individual's identity." http://dicom.nema.org/medical/dicom/current/output/chtml/part15/sect_E.3.9.html
    */
  var skipIdRedaction: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDicomConfig {
  
  inline def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  
  extension [Self <: SchemaDicomConfig](x: Self) {
    
    inline def setFilterProfile(value: String): Self = StObject.set(x, "filterProfile", value.asInstanceOf[js.Any])
    
    inline def setFilterProfileNull: Self = StObject.set(x, "filterProfile", null)
    
    inline def setFilterProfileUndefined: Self = StObject.set(x, "filterProfile", js.undefined)
    
    inline def setKeepList(value: SchemaTagFilterList): Self = StObject.set(x, "keepList", value.asInstanceOf[js.Any])
    
    inline def setKeepListUndefined: Self = StObject.set(x, "keepList", js.undefined)
    
    inline def setRemoveList(value: SchemaTagFilterList): Self = StObject.set(x, "removeList", value.asInstanceOf[js.Any])
    
    inline def setRemoveListUndefined: Self = StObject.set(x, "removeList", js.undefined)
    
    inline def setSkipIdRedaction(value: Boolean): Self = StObject.set(x, "skipIdRedaction", value.asInstanceOf[js.Any])
    
    inline def setSkipIdRedactionNull: Self = StObject.set(x, "skipIdRedaction", null)
    
    inline def setSkipIdRedactionUndefined: Self = StObject.set(x, "skipIdRedaction", js.undefined)
  }
}
