package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of replacing shapes with an image.
  */
@js.native
trait SchemaReplaceAllShapesWithImageResponse extends StObject {
  
  /**
    * The number of shapes replaced with images.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}
object SchemaReplaceAllShapesWithImageResponse {
  
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageResponse]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllShapesWithImageResponseMutableBuilder[Self <: SchemaReplaceAllShapesWithImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
