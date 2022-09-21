package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Location extends StObject {
  
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the finding's containing element. Note that when the content is not textual, this references the UTF-8 encoded textual representation of the content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.undefined
  
  /**
    * Unicode character offsets delimiting the finding. These are relative to the finding's containing element. Provided when the content is text.
    */
  var codepointRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.undefined
  
  /**
    * Information about the container where this finding occurred, if available.
    */
  var container: js.UndefOr[SchemaGooglePrivacyDlpV2Container] = js.undefined
  
  /**
    * List of nested objects pointing to the precise location of the finding within the file or record.
    */
  var contentLocations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ContentLocation]] = js.undefined
}
object SchemaGooglePrivacyDlpV2Location {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Location]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Location](x: Self) {
    
    inline def setByteRange(value: SchemaGooglePrivacyDlpV2Range): Self = StObject.set(x, "byteRange", value.asInstanceOf[js.Any])
    
    inline def setByteRangeUndefined: Self = StObject.set(x, "byteRange", js.undefined)
    
    inline def setCodepointRange(value: SchemaGooglePrivacyDlpV2Range): Self = StObject.set(x, "codepointRange", value.asInstanceOf[js.Any])
    
    inline def setCodepointRangeUndefined: Self = StObject.set(x, "codepointRange", js.undefined)
    
    inline def setContainer(value: SchemaGooglePrivacyDlpV2Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContentLocations(value: js.Array[SchemaGooglePrivacyDlpV2ContentLocation]): Self = StObject.set(x, "contentLocations", value.asInstanceOf[js.Any])
    
    inline def setContentLocationsUndefined: Self = StObject.set(x, "contentLocations", js.undefined)
    
    inline def setContentLocationsVarargs(value: SchemaGooglePrivacyDlpV2ContentLocation*): Self = StObject.set(x, "contentLocations", js.Array(value*))
  }
}
