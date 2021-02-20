package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the location of the finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Location extends StObject {
  
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the
    * finding&#39;s containing element. Note that when the content is not
    * textual, this references the UTF-8 encoded textual representation of the
    * content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  
  /**
    * Unicode character offsets delimiting the finding. These are relative to
    * the finding&#39;s containing element. Provided when the content is text.
    */
  var codepointRange: js.UndefOr[SchemaGooglePrivacyDlpV2Range] = js.native
  
  /**
    * List of nested objects pointing to the precise location of the finding
    * within the file or record.
    */
  var contentLocations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ContentLocation]] = js.native
}
object SchemaGooglePrivacyDlpV2Location {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Location]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LocationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteRange(value: SchemaGooglePrivacyDlpV2Range): Self = StObject.set(x, "byteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteRangeUndefined: Self = StObject.set(x, "byteRange", js.undefined)
    
    @scala.inline
    def setCodepointRange(value: SchemaGooglePrivacyDlpV2Range): Self = StObject.set(x, "codepointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepointRangeUndefined: Self = StObject.set(x, "codepointRange", js.undefined)
    
    @scala.inline
    def setContentLocations(value: js.Array[SchemaGooglePrivacyDlpV2ContentLocation]): Self = StObject.set(x, "contentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocationsUndefined: Self = StObject.set(x, "contentLocations", js.undefined)
    
    @scala.inline
    def setContentLocationsVarargs(value: SchemaGooglePrivacyDlpV2ContentLocation*): Self = StObject.set(x, "contentLocations", js.Array(value :_*))
  }
}
