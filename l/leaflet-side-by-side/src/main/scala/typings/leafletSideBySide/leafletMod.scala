package typings.leafletSideBySide

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Layer
import typings.leafletSideBySide.leafletMod.Control_.SideBySide
import typings.leafletSideBySide.leafletMod.Control_.SideBySideOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sideBySide(leftLayers: js.Array[Layer], rightLayers: js.Array[Layer]): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: js.Array[Layer], rightLayers: js.Array[Layer], options: SideBySideOptions): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: js.Array[Layer], rightLayers: Layer): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: js.Array[Layer], rightLayers: Layer, options: SideBySideOptions): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: Layer, rightLayers: js.Array[Layer]): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: Layer, rightLayers: js.Array[Layer], options: SideBySideOptions): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: Layer, rightLayers: Layer): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
    inline def sideBySide(leftLayers: Layer, rightLayers: Layer, options: SideBySideOptions): SideBySide = (^.asInstanceOf[js.Dynamic].applyDynamic("sideBySide")(leftLayers.asInstanceOf[js.Any], rightLayers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideBySide]
  }
  
  object Control_ {
    
    @js.native
    trait SideBySide
      extends typings.leaflet.mod.Control_ {
      
      @JSName("options")
      var options_SideBySide: SideBySideOptions = js.native
      
      def setLeftLayers(leftLayers: js.Array[Layer]): this.type = js.native
      def setLeftLayers(leftLayers: Layer): this.type = js.native
      
      def setPosition(): this.type = js.native
      
      def setRightLayers(rightLayers: js.Array[Layer]): this.type = js.native
      def setRightLayers(rightLayers: Layer): this.type = js.native
    }
    
    trait SideBySideOptions
      extends StObject
         with ControlOptions {
      
      var padding: js.UndefOr[Double] = js.undefined
      
      var thumbSize: js.UndefOr[Double] = js.undefined
    }
    object SideBySideOptions {
      
      inline def apply(): SideBySideOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SideBySideOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SideBySideOptions] (val x: Self) extends AnyVal {
        
        inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
        
        inline def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
      }
    }
  }
}
