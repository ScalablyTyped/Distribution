package typings.leafletLoading

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Control_.Zoom
import typings.leafletLoading.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control {
    
    @JSImport("leaflet", "Control")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "Control.Loading")
    @js.native
    class Loading_ () extends Control_ {
      def this(options: LoadingOptions) = this()
      
      @JSName("options")
      var options_Loading_ : LoadingOptions = js.native
    }
    
    @scala.inline
    def loading(): Loading_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")().asInstanceOf[Loading_]
    @scala.inline
    def loading(options: LoadingOptions): Loading_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(options.asInstanceOf[js.Any]).asInstanceOf[Loading_]
  }
  
  trait LoadingOptions
    extends StObject
       with ControlOptions {
    
    var delayIndicator: js.UndefOr[Double] = js.undefined
    
    var separate: js.UndefOr[Boolean] = js.undefined
    
    var spin: js.UndefOr[Length] = js.undefined
    
    var spinjs: js.UndefOr[Boolean] = js.undefined
    
    var zoomControl: js.UndefOr[Zoom] = js.undefined
  }
  object LoadingOptions {
    
    @scala.inline
    def apply(): LoadingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingOptions]
    }
    
    @scala.inline
    implicit class LoadingOptionsMutableBuilder[Self <: LoadingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayIndicator(value: Double): Self = StObject.set(x, "delayIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayIndicatorUndefined: Self = StObject.set(x, "delayIndicator", js.undefined)
      
      @scala.inline
      def setSeparate(value: Boolean): Self = StObject.set(x, "separate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparateUndefined: Self = StObject.set(x, "separate", js.undefined)
      
      @scala.inline
      def setSpin(value: Length): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setSpinjs(value: Boolean): Self = StObject.set(x, "spinjs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinjsUndefined: Self = StObject.set(x, "spinjs", js.undefined)
      
      @scala.inline
      def setZoomControl(value: Zoom): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    }
  }
  
  trait MapOptions extends StObject {
    
    var loadingControl: js.UndefOr[Boolean] = js.undefined
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
      def setLoadingControl(value: Boolean): Self = StObject.set(x, "loadingControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingControlUndefined: Self = StObject.set(x, "loadingControl", js.undefined)
    }
  }
}
