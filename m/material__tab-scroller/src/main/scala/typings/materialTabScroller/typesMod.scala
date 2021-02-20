package typings.materialTabScroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCTabScrollerAnimation extends StObject {
    
    var finalScrollPosition: Double = js.native
    
    var scrollDelta: Double = js.native
  }
  object MDCTabScrollerAnimation {
    
    @scala.inline
    def apply(finalScrollPosition: Double, scrollDelta: Double): MDCTabScrollerAnimation = {
      val __obj = js.Dynamic.literal(finalScrollPosition = finalScrollPosition.asInstanceOf[js.Any], scrollDelta = scrollDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabScrollerAnimation]
    }
    
    @scala.inline
    implicit class MDCTabScrollerAnimationMutableBuilder[Self <: MDCTabScrollerAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalScrollPosition(value: Double): Self = StObject.set(x, "finalScrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCTabScrollerHorizontalEdges extends StObject {
    
    var left: Double = js.native
    
    var right: Double = js.native
  }
  object MDCTabScrollerHorizontalEdges {
    
    @scala.inline
    def apply(left: Double, right: Double): MDCTabScrollerHorizontalEdges = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabScrollerHorizontalEdges]
    }
    
    @scala.inline
    implicit class MDCTabScrollerHorizontalEdgesMutableBuilder[Self <: MDCTabScrollerHorizontalEdges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
