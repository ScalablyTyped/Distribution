package typings.leafletLoading

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Control_.Zoom
import typings.leafletLoading.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control {
    
    @JSImport("leaflet", "Control")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "Control.Loading")
    @js.native
    open class Loading_ () extends Control_ {
      def this(options: LoadingOptions) = this()
      
      @JSName("options")
      var options_Loading_ : LoadingOptions = js.native
    }
    
    inline def loading(): Loading_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")().asInstanceOf[Loading_]
    inline def loading(options: LoadingOptions): Loading_ = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(options.asInstanceOf[js.Any]).asInstanceOf[Loading_]
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
    
    inline def apply(): LoadingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadingOptions] (val x: Self) extends AnyVal {
      
      inline def setDelayIndicator(value: Double): Self = StObject.set(x, "delayIndicator", value.asInstanceOf[js.Any])
      
      inline def setDelayIndicatorUndefined: Self = StObject.set(x, "delayIndicator", js.undefined)
      
      inline def setSeparate(value: Boolean): Self = StObject.set(x, "separate", value.asInstanceOf[js.Any])
      
      inline def setSeparateUndefined: Self = StObject.set(x, "separate", js.undefined)
      
      inline def setSpin(value: Length): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      inline def setSpinjs(value: Boolean): Self = StObject.set(x, "spinjs", value.asInstanceOf[js.Any])
      
      inline def setSpinjsUndefined: Self = StObject.set(x, "spinjs", js.undefined)
      
      inline def setZoomControl(value: Zoom): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
      
      inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    }
  }
  
  trait MapOptions extends StObject {
    
    var loadingControl: js.UndefOr[Boolean] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setLoadingControl(value: Boolean): Self = StObject.set(x, "loadingControl", value.asInstanceOf[js.Any])
      
      inline def setLoadingControlUndefined: Self = StObject.set(x, "loadingControl", js.undefined)
    }
  }
}
