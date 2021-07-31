package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structural unit of text representing a number of words in certain order.
  */
trait SchemaGoogleCloudVisionV1p2beta1Paragraph extends StObject {
  
  /**
    * The bounding box for the paragraph. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:   * when the text is horizontal it might look
    * like:      0----1      |    |      3----2   * when it&#39;s rotated 180
    * degrees around the top-left corner it becomes:      2----3      |    |
    * 1----0   and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.undefined
  
  /**
    * Confidence of the OCR results for the paragraph. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional information detected for the paragraph.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty] = js.undefined
  
  /**
    * List of words in this paragraph.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Word]] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1Paragraph {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Paragraph]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1ParagraphMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1Paragraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setWords(value: js.Array[SchemaGoogleCloudVisionV1p2beta1Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: SchemaGoogleCloudVisionV1p2beta1Word*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
