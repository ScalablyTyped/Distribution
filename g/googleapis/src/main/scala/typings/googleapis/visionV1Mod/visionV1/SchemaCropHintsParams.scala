package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for crop hints annotation request.
  */
@js.native
trait SchemaCropHintsParams extends StObject {
  
  /**
    * Aspect ratios in floats, representing the ratio of the width to the
    * height of the image. For example, if the desired aspect ratio is 4/3, the
    * corresponding float value should be 1.33333.  If not specified, the best
    * possible crop is returned. The number of provided aspect ratios is
    * limited to a maximum of 16; any aspect ratios provided after the 16th are
    * ignored.
    */
  var aspectRatios: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaCropHintsParams {
  
  @scala.inline
  def apply(): SchemaCropHintsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHintsParams]
  }
  
  @scala.inline
  implicit class SchemaCropHintsParamsMutableBuilder[Self <: SchemaCropHintsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatios(value: js.Array[Double]): Self = StObject.set(x, "aspectRatios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatiosUndefined: Self = StObject.set(x, "aspectRatios", js.undefined)
    
    @scala.inline
    def setAspectRatiosVarargs(value: Double*): Self = StObject.set(x, "aspectRatios", js.Array(value :_*))
  }
}
