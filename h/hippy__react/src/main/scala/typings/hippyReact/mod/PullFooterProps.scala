package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullFooterProps
  extends StObject
     with LayoutableProps {
  
  /**
    * Trigger when pulling
    *
    * @param {Object} evt - Event data
    * @param {number} evt.contentOffset - Dragging distance
    */
  var onFooterPulling: js.UndefOr[js.Function1[/* evt */ PullingEvent, Unit]] = js.undefined
  
  /**
    * Trigger when release the finger after pulling distance larger than the content height
    */
  var onFooterReleased: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Keep content displaying after onFooterReleased trigged.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object PullFooterProps {
  
  inline def apply(): PullFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullFooterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PullFooterProps] (val x: Self) extends AnyVal {
    
    inline def setOnFooterPulling(value: /* evt */ PullingEvent => Unit): Self = StObject.set(x, "onFooterPulling", js.Any.fromFunction1(value))
    
    inline def setOnFooterPullingUndefined: Self = StObject.set(x, "onFooterPulling", js.undefined)
    
    inline def setOnFooterReleased(value: () => Unit): Self = StObject.set(x, "onFooterReleased", js.Any.fromFunction0(value))
    
    inline def setOnFooterReleasedUndefined: Self = StObject.set(x, "onFooterReleased", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
