package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PuffEffect extends StObject {
  
  var percent: js.UndefOr[Double] = js.native
}
object PuffEffect {
  
  @scala.inline
  def apply(): PuffEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PuffEffect]
  }
  
  @scala.inline
  implicit class PuffEffectMutableBuilder[Self <: PuffEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
