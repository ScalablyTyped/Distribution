package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of replacing shapes with an image.
  */
trait SchemaReplaceAllShapesWithImageResponse extends StObject {
  
  /**
    * The number of shapes replaced with images.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}
object SchemaReplaceAllShapesWithImageResponse {
  
  inline def apply(): SchemaReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageResponse]
  }
  
  extension [Self <: SchemaReplaceAllShapesWithImageResponse](x: Self) {
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
