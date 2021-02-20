package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A word representation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1Word extends StObject {
  
  /**
    * The bounding box for the word. The vertices are in the order of top-left,
    * top-right, bottom-right, bottom-left. When a rotation of the bounding box
    * is detected the rotation is represented as around the top-left corner as
    * defined when the text is read in the &#39;natural&#39; orientation. For
    * example:   * when the text is horizontal it might look like:      0----1
    * |    |      3----2   * when it&#39;s rotated 180 degrees around the
    * top-left corner it becomes:      2----3      |    |      1----0   and the
    * vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /**
    * Confidence of the OCR results for the word. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Additional information detected for the word.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty] = js.native
  
  /**
    * List of symbols in the word. The order of the symbols follows the natural
    * reading order.
    */
  var symbols: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Symbol]] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1Word {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1Word = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1Word]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1WordMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1Word] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setSymbols(value: js.Array[SchemaGoogleCloudVisionV1p4beta1Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: SchemaGoogleCloudVisionV1p4beta1Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
  }
}
