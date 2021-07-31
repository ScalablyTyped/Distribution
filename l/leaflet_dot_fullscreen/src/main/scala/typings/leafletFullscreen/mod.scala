package typings.leafletFullscreen

import typings.leaflet.mod.ControlPosition
import typings.leafletFullscreen.leafletFullscreenBooleans.`false`
import typings.leafletFullscreen.mod.Control_.Fullscreen
import typings.leafletFullscreen.mod.Control_.FullscreenOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Fullscreen")
    @js.native
    class Fullscreen ()
      extends typings.leaflet.mod.Control_ {
      def this(options: FullscreenOptions) = this()
      
      @JSName("options")
      var options_Fullscreen: FullscreenOptions = js.native
    }
    
    trait FullscreenOptions extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined
      
      var forceSeparateButton: js.UndefOr[Boolean] = js.undefined
      
      var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.undefined
      
      var position: js.UndefOr[ControlPosition] = js.undefined
      
      var pseudoFullscreen: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var titleCancel: js.UndefOr[String] = js.undefined
    }
    object FullscreenOptions {
      
      @scala.inline
      def apply(): FullscreenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FullscreenOptions]
      }
      
      @scala.inline
      implicit class FullscreenOptionsMutableBuilder[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setForcePseudoFullscreen(value: Boolean): Self = StObject.set(x, "forcePseudoFullscreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForcePseudoFullscreenUndefined: Self = StObject.set(x, "forcePseudoFullscreen", js.undefined)
        
        @scala.inline
        def setForceSeparateButton(value: Boolean): Self = StObject.set(x, "forceSeparateButton", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceSeparateButtonUndefined: Self = StObject.set(x, "forceSeparateButton", js.undefined)
        
        @scala.inline
        def setFullscreenElement(value: `false` | HTMLElement): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
        
        @scala.inline
        def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setPseudoFullscreen(value: Boolean): Self = StObject.set(x, "pseudoFullscreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPseudoFullscreenUndefined: Self = StObject.set(x, "pseudoFullscreen", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleCancel(value: String): Self = StObject.set(x, "titleCancel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleCancelUndefined: Self = StObject.set(x, "titleCancel", js.undefined)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a fullscreen control.
      */
    @scala.inline
    def fullscreen(): Fullscreen = ^.asInstanceOf[js.Dynamic].applyDynamic("fullscreen")().asInstanceOf[Fullscreen]
    @scala.inline
    def fullscreen(options: FullscreenOptions): Fullscreen = ^.asInstanceOf[js.Dynamic].applyDynamic("fullscreen")(options.asInstanceOf[js.Any]).asInstanceOf[Fullscreen]
  }
  
  trait Map extends StObject {
    
    def toggleFullScreen(): Unit
  }
  object Map {
    
    @scala.inline
    def apply(toggleFullScreen: () => Unit): Map = {
      val __obj = js.Dynamic.literal(toggleFullScreen = js.Any.fromFunction0(toggleFullScreen))
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToggleFullScreen(value: () => Unit): Self = StObject.set(x, "toggleFullScreen", js.Any.fromFunction0(value))
    }
  }
  
  trait MapOptions extends StObject {
    
    var fullscreenControl: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenControlOptions: js.UndefOr[FullscreenOptions] = js.undefined
  }
  object MapOptions {
    
    @scala.inline
    def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenControlOptions(value: FullscreenOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
      
      @scala.inline
      def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    }
  }
}
