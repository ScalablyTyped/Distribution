package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TransformationLocation extends StObject {
  
  /**
    * Information about the functionality of the container where this finding occurred, if available.
    */
  var containerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For infotype transformations, link to the corresponding findings ID so that location information does not need to be duplicated. Each findings ID correlates to an entry in the findings output table, this table only gets created when users specify to save findings (add the save findings action to the request).
    */
  var findingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For record transformations, provide a field and container information.
    */
  var recordTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2RecordTransformation] = js.undefined
}
object SchemaGooglePrivacyDlpV2TransformationLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TransformationLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TransformationLocation](x: Self) {
    
    inline def setContainerType(value: String): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    inline def setContainerTypeNull: Self = StObject.set(x, "containerType", null)
    
    inline def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    inline def setFindingId(value: String): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdNull: Self = StObject.set(x, "findingId", null)
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    inline def setRecordTransformation(value: SchemaGooglePrivacyDlpV2RecordTransformation): Self = StObject.set(x, "recordTransformation", value.asInstanceOf[js.Any])
    
    inline def setRecordTransformationUndefined: Self = StObject.set(x, "recordTransformation", js.undefined)
  }
}
