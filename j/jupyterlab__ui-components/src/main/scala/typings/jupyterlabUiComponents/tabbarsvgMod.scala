package typings.jupyterlabUiComponents

import typings.jupyterlabTranslation.tokensMod.ITranslator
import typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.IOptions
import typings.luminoWidgets.mod.DockPanel
import typings.luminoWidgets.mod.TabBar
import typings.luminoWidgets.mod.TabPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbarsvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class DockPanelSvg () extends DockPanel {
    def this(options: IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.mod.DockPanel.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    trait IOptions
      extends StObject
         with typings.luminoWidgets.dockpanelMod.DockPanel.IOptions {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  open class TabBarSvg[T] () extends TabBar[T] {
    def this(options: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.mod.TabBar.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    trait IOptions[T]
      extends StObject
         with typings.luminoWidgets.tabbarMod.TabBar.IOptions[T] {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T]]
      }
      
      extension [Self <: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[?], T](x: Self & typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T]) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabPanelSvg")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanelSvg () extends TabPanel {
    def this(options: typings.luminoWidgets.tabpanelMod.TabPanel.IOptions) = this()
  }
}
