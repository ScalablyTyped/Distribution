package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  var border: js.UndefOr[`11`] = js.undefined
  
  var pad: js.UndefOr[HorizontalVertical] = js.undefined
}
object Pad {
  
  @scala.inline
  def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  @scala.inline
  implicit class PadMutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: `11`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setPad(value: HorizontalVertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
