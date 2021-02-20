package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathEvents extends StObject {
  
  /*This value is the time (in milliseconds) that a user must hold the mouse still over a math element before it
    * is considered to be hovering over the math.
    */
  var hover: js.UndefOr[Double] = js.native
  
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathEvents.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.native
}
object MathEvents {
  
  @scala.inline
  def apply(): MathEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathEvents]
  }
  
  @scala.inline
  implicit class MathEventsMutableBuilder[Self <: MathEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: Double): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
