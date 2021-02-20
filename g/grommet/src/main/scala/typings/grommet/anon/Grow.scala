package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grow extends StObject {
  
  var grow: js.UndefOr[Double] = js.native
  
  var shrink: js.UndefOr[Double] = js.native
}
object Grow {
  
  @scala.inline
  def apply(): Grow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grow]
  }
  
  @scala.inline
  implicit class GrowMutableBuilder[Self <: Grow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
    
    @scala.inline
    def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
