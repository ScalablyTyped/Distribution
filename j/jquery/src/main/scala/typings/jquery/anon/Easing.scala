package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing
  extends StObject
     with _SpeedSettings[js.Any] {
  
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String
}
object Easing {
  
  @scala.inline
  def apply(easing: String): Easing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  @scala.inline
  implicit class EasingMutableBuilder[Self <: Easing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
  }
}
