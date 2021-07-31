package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of transformation that will scan unstructured text and apply various
  * `PrimitiveTransformation`s to each finding, where the transformation is
  * applied to only values that were identified as a specific info_type.
  */
trait SchemaGooglePrivacyDlpV2InfoTypeTransformations extends StObject {
  
  /**
    * Transformation for each infoType. Cannot specify more than one for a
    * given infoType. [required]
    */
  var transformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoTypeTransformations {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformations]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeTransformationsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformations(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    @scala.inline
    def setTransformationsVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
  }
}
