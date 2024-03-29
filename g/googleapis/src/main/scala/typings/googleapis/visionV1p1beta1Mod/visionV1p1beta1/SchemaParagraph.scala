package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParagraph extends StObject {
  
  /**
    * The bounding box for the paragraph. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | | 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaBoundingPoly] = js.undefined
  
  /**
    * Confidence of the OCR results for the paragraph. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Additional information detected for the paragraph.
    */
  var property: js.UndefOr[SchemaTextProperty] = js.undefined
  
  /**
    * List of all words in this paragraph.
    */
  var words: js.UndefOr[js.Array[SchemaWord]] = js.undefined
}
object SchemaParagraph {
  
  inline def apply(): SchemaParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraph]
  }
  
  extension [Self <: SchemaParagraph](x: Self) {
    
    inline def setBoundingBox(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setProperty(value: SchemaTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setWords(value: js.Array[SchemaWord]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: SchemaWord*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
