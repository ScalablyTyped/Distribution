package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the minimum and maximum values, the color, opacity, icon and
  * weight of a bucket within a StyleSetting.
  */
trait SchemaBucket extends StObject {
  
  /**
    * Color of line or the interior of a polygon in #RRGGBB format.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Icon name used for a point.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of a line (in pixels).
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object SchemaBucket {
  
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  @scala.inline
  implicit class SchemaBucketMutableBuilder[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
