package typings.jqueryFinger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryFinger {
  
  @js.native
  trait JQueryFingerOptions extends StObject {
    
    /**
      * The maximum time between two tap events to fire a doubletap event.
      * If this time is reached, two distinct tap events will be fired instead.
      *     Default: 300(ms).
      */
    var doubleTapInterval: Double = js.native
    
    /**
      * The maximum time the user will have to swipe in order to fire a flick
      * event. If this time is reached, only drag events will continue to be
      * fired.
      *     Default: 150(ms).
      */
    var flickDuration: Double = js.native
    
    /**
      * The number of pixels the user will have to move in order to fire motion
      * events (drag or flick). If this time is not reached, no motion will
      * be handled and tap, doubletap or press event will be fired.
      *     Default: 5(px).
      */
    var motionThreshhold: Double = js.native
    
    /**
      * The time the user must hold in order to fire a press event. If this
      * time is not reached, a tap event will be fired instead.
      *     Default: 300(ms).
      */
    var pressDuration: Double = js.native
    
    /**
      * Globally prevents every native default behavior.
      *     Default: undefined.
      */
    var preventDefault: Boolean = js.native
  }
  object JQueryFingerOptions {
    
    @scala.inline
    def apply(
      doubleTapInterval: Double,
      flickDuration: Double,
      motionThreshhold: Double,
      pressDuration: Double,
      preventDefault: Boolean
    ): JQueryFingerOptions = {
      val __obj = js.Dynamic.literal(doubleTapInterval = doubleTapInterval.asInstanceOf[js.Any], flickDuration = flickDuration.asInstanceOf[js.Any], motionThreshhold = motionThreshhold.asInstanceOf[js.Any], pressDuration = pressDuration.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[JQueryFingerOptions]
    }
    
    @scala.inline
    implicit class JQueryFingerOptionsMutableBuilder[Self <: JQueryFingerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoubleTapInterval(value: Double): Self = StObject.set(x, "doubleTapInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickDuration(value: Double): Self = StObject.set(x, "flickDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionThreshhold(value: Double): Self = StObject.set(x, "motionThreshhold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressDuration(value: Double): Self = StObject.set(x, "pressDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    }
  }
}
