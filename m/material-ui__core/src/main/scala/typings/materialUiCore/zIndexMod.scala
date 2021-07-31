package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zIndexMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/zIndex", JSImport.Default)
  @js.native
  val default: ZIndex = js.native
  
  trait ZIndex extends StObject {
    
    var appBar: Double
    
    var drawer: Double
    
    var mobileStepper: Double
    
    var modal: Double
    
    var snackbar: Double
    
    var tooltip: Double
  }
  object ZIndex {
    
    @scala.inline
    def apply(
      appBar: Double,
      drawer: Double,
      mobileStepper: Double,
      modal: Double,
      snackbar: Double,
      tooltip: Double
    ): ZIndex = {
      val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], mobileStepper = mobileStepper.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZIndex]
    }
    
    @scala.inline
    implicit class ZIndexMutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBar(value: Double): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawer(value: Double): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileStepper(value: Double): Self = StObject.set(x, "mobileStepper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnackbar(value: Double): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/zIndex.ZIndex> */
  trait ZIndexOptions extends StObject {
    
    var appBar: js.UndefOr[Double] = js.undefined
    
    var drawer: js.UndefOr[Double] = js.undefined
    
    var mobileStepper: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Double] = js.undefined
    
    var snackbar: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[Double] = js.undefined
  }
  object ZIndexOptions {
    
    @scala.inline
    def apply(): ZIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZIndexOptions]
    }
    
    @scala.inline
    implicit class ZIndexOptionsMutableBuilder[Self <: ZIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBar(value: Double): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBarUndefined: Self = StObject.set(x, "appBar", js.undefined)
      
      @scala.inline
      def setDrawer(value: Double): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
      
      @scala.inline
      def setMobileStepper(value: Double): Self = StObject.set(x, "mobileStepper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileStepperUndefined: Self = StObject.set(x, "mobileStepper", js.undefined)
      
      @scala.inline
      def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setSnackbar(value: Double): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnackbarUndefined: Self = StObject.set(x, "snackbar", js.undefined)
      
      @scala.inline
      def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ZIndex
  
  /* This means you don't have to write `default`, but can instead just say `zIndexMod.foo` */
  override def _to: ZIndex = default
}
