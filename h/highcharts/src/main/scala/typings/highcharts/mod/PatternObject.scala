package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternObject
  extends StObject
     with _ColorType {
  
  /**
    * Animation options for the image pattern loading.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
  
  /**
    * Pattern options
    */
  var pattern: PatternOptionsObject
  
  /**
    * Optionally an index referencing which pattern to use. Highcharts adds 10
    * default patterns to the `Highcharts.patterns` array. Additional pattern
    * definitions can be pushed to this array if desired. This option is an
    * index into this array.
    */
  var patternIndex: js.UndefOr[Double] = js.undefined
}
object PatternObject {
  
  inline def apply(pattern: PatternOptionsObject): PatternObject = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatternObject] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setPattern(value: PatternOptionsObject): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternIndex(value: Double): Self = StObject.set(x, "patternIndex", value.asInstanceOf[js.Any])
    
    inline def setPatternIndexUndefined: Self = StObject.set(x, "patternIndex", js.undefined)
  }
}
