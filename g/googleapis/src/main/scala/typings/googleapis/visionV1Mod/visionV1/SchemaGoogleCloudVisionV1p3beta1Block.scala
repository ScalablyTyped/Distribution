package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logical element on the page.
  */
trait SchemaGoogleCloudVisionV1p3beta1Block extends StObject {
  
  /**
    * Detected block type (text, image etc) for this block.
    */
  var blockType: js.UndefOr[String] = js.undefined
  
  /**
    * The bounding box for the block. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:  * when the text is horizontal it might look
    * like:          0----1         |    |         3----2  * when it&#39;s
    * rotated 180 degrees around the top-left corner it becomes: 2----3 |    |
    * 1----0    and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = js.undefined
  
  /**
    * Confidence of the OCR results on the block. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * List of paragraphs in this block (if this blocks is of type text).
    */
  var paragraphs: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1Paragraph]] = js.undefined
  
  /**
    * Additional information detected for the block.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1TextAnnotationTextProperty] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1Block {
  
  inline def apply(): SchemaGoogleCloudVisionV1p3beta1Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1Block]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p3beta1Block](x: Self) {
    
    inline def setBlockType(value: String): Self = StObject.set(x, "blockType", value.asInstanceOf[js.Any])
    
    inline def setBlockTypeUndefined: Self = StObject.set(x, "blockType", js.undefined)
    
    inline def setBoundingBox(value: SchemaGoogleCloudVisionV1p3beta1BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setParagraphs(value: js.Array[SchemaGoogleCloudVisionV1p3beta1Paragraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: SchemaGoogleCloudVisionV1p3beta1Paragraph*): Self = StObject.set(x, "paragraphs", js.Array(value :_*))
    
    inline def setProperty(value: SchemaGoogleCloudVisionV1p3beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
