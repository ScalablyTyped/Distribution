package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingCoating extends StObject {
  
  var `coating-sides`: js.UndefOr[FinishingSides] = js.undefined
  
  var `coating-type`: js.UndefOr[CoatingType] = js.undefined
}
object FinishingCoating {
  
  @scala.inline
  def apply(): FinishingCoating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingCoating]
  }
  
  @scala.inline
  implicit class FinishingCoatingMutableBuilder[Self <: FinishingCoating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCoating-sides`(value: FinishingSides): Self = StObject.set(x, "coating-sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCoating-sidesUndefined`: Self = StObject.set(x, "coating-sides", js.undefined)
    
    @scala.inline
    def `setCoating-type`(value: CoatingType): Self = StObject.set(x, "coating-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCoating-typeUndefined`: Self = StObject.set(x, "coating-type", js.undefined)
  }
}
