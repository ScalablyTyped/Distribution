package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternObject extends _ColorType {
  
  /**
    * Animation options for the image pattern loading.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * Pattern options
    */
  var pattern: PatternOptionsObject = js.native
  
  /**
    * Optionally an index referencing which pattern to use. Highcharts adds 10
    * default patterns to the `Highcharts.patterns` array. Additional pattern
    * definitions can be pushed to this array if desired. This option is an
    * index into this array.
    */
  var patternIndex: js.UndefOr[Double] = js.native
}
object PatternObject {
  
  @scala.inline
  def apply(pattern: PatternOptionsObject): PatternObject = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternObject]
  }
  
  @scala.inline
  implicit class PatternObjectMutableBuilder[Self <: PatternObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setPattern(value: PatternOptionsObject): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternIndex(value: Double): Self = StObject.set(x, "patternIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternIndexUndefined: Self = StObject.set(x, "patternIndex", js.undefined)
  }
}
