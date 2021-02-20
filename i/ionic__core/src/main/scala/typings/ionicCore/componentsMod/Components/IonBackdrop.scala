package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonBackdrop extends StObject {
  
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: Boolean = js.native
  
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: Boolean = js.native
  
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: Boolean = js.native
}
object IonBackdrop {
  
  @scala.inline
  def apply(stopPropagation: Boolean, tappable: Boolean, visible: Boolean): IonBackdrop = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any], tappable = tappable.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackdrop]
  }
  
  @scala.inline
  implicit class IonBackdropMutableBuilder[Self <: IonBackdrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
