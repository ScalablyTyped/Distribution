package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Baseline extends StObject {
  
  var baseline: js.UndefOr[Double] = js.native
  
  var minSpeed: js.UndefOr[Double] = js.native
}
object Baseline {
  
  @scala.inline
  def apply(): Baseline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Baseline]
  }
  
  @scala.inline
  implicit class BaselineMutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setMinSpeed(value: Double): Self = StObject.set(x, "minSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSpeedUndefined: Self = StObject.set(x, "minSpeed", js.undefined)
  }
}
