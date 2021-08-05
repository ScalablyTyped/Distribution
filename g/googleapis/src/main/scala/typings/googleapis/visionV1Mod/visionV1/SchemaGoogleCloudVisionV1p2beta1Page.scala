package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected page from OCR.
  */
trait SchemaGoogleCloudVisionV1p2beta1Page extends StObject {
  
  /**
    * List of blocks of text, images etc on this page.
    */
  var blocks: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Block]] = js.undefined
  
  /**
    * Confidence of the OCR results on the page. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Page height. For PDFs the unit is points. For images (including TIFFs)
    * the unit is pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional information detected on the page.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty] = js.undefined
  
  /**
    * Page width. For PDFs the unit is points. For images (including TIFFs) the
    * unit is pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1Page {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Page]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1Page](x: Self) {
    
    inline def setBlocks(value: js.Array[SchemaGoogleCloudVisionV1p2beta1Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setBlocksVarargs(value: SchemaGoogleCloudVisionV1p2beta1Block*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setProperty(value: SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
