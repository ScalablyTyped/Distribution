package typings.ionicCore

import typings.ionicCore.gestureMod.GestureDetail
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentInterfaceMod {
  
  trait ScrollBaseDetail extends StObject {
    
    var isScrolling: Boolean
  }
  object ScrollBaseDetail {
    
    @scala.inline
    def apply(isScrolling: Boolean): ScrollBaseDetail = {
      val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollBaseDetail]
    }
    
    @scala.inline
    implicit class ScrollBaseDetailMutableBuilder[Self <: ScrollBaseDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollCallback = js.Function1[/* detail */ js.UndefOr[ScrollDetail], Boolean | Unit]
  
  trait ScrollDetail
    extends StObject
       with GestureDetail
       with ScrollBaseDetail {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollDetail {
    
    @scala.inline
    def apply(
      currentTime: Double,
      currentX: Double,
      currentY: Double,
      deltaX: Double,
      deltaY: Double,
      event: UIEvent,
      isScrolling: Boolean,
      scrollLeft: Double,
      scrollTop: Double,
      startTime: Double,
      startX: Double,
      startY: Double,
      `type`: String,
      velocityX: Double,
      velocityY: Double
    ): ScrollDetail = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollDetail]
    }
    
    @scala.inline
    implicit class ScrollDetailMutableBuilder[Self <: ScrollDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
}
