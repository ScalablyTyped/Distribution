package typings.jqueryBackstretch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryBackStretch {
  
  @js.native
  trait BackStretch extends StObject {
    
    /**
      * Destroy the Backstretch instance. Optionally, you can pass in a Boolean
      * parameter, preserveBackground, to determine whether or not you'd like
      * to keep the current image stretched as the background image.
      *
      * @param {boolean} preserveBackground
      */
    def destroy(): Unit = js.native
    def destroy(preserveBackground: Boolean): Unit = js.native
    
    /**
      * Advance to the next image in a slideshow.
      */
    def next(): BackStretch = js.native
    
    /**
      * Pause the slideshow.
      */
    def pause(): BackStretch = js.native
    
    /**
      * Display the previous image in a slideshow.
      */
    def prev(): BackStretch = js.native
    
    /**
      * This method is called automatically when the container (window or
      * block-level element) is resized, however you can always call this
      * manually if needed.
      */
    def resize(): BackStretch = js.native
    
    /**
      * Resume a paused slideshow.
      */
    def resume(): BackStretch = js.native
    
    /**
      * Jump to the slide at a given index, where n is the number of the
      * image that you'd like to display. Slide number starts at 0.
      *
      * @param {number} newIndex
      */
    def show(newIndex: Double): BackStretch = js.native
  }
  
  @js.native
  trait BackStretchOptions extends StObject {
    
    /**
      * The ratio of the width/height of the image doesn't always jive with the
      * width/height of the window. This parameter controls whether or not we
      * center the image on the X axis to account for the discrepancy.
      */
    var centeredX: js.UndefOr[Boolean] = js.native
    
    /**
      * This parameter controls whether or not we center the image on the Y axis
      * to account for the aforementioned discrepancy.
      */
    var centeredY: js.UndefOr[Boolean] = js.native
    
    /**
      * This is the speed at which the image will fade in. Integers in
      * milliseconds are accepted, as well as standard jQuery speed strings
      * (slow, normal, fast).
      */
    var duration: js.UndefOr[Double | String] = js.native
    
    /**
      * The amount of time in between slides, when using Backstretch as a
      * slideshow, expressed as the number of milliseconds.
      */
    var fade: js.UndefOr[Double] = js.native
  }
  object BackStretchOptions {
    
    @scala.inline
    def apply(): BackStretchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackStretchOptions]
    }
    
    @scala.inline
    implicit class BackStretchOptionsMutableBuilder[Self <: BackStretchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenteredX(value: Boolean): Self = StObject.set(x, "centeredX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredXUndefined: Self = StObject.set(x, "centeredX", js.undefined)
      
      @scala.inline
      def setCenteredY(value: Boolean): Self = StObject.set(x, "centeredY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredYUndefined: Self = StObject.set(x, "centeredY", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFade(value: Double): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
}
