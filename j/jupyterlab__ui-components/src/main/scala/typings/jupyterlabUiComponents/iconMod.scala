package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.interfacesMod.Icon.IModel
import typings.jupyterlabUiComponents.interfacesMod.Icon.INodeOptions
import typings.jupyterlabUiComponents.styleIconMod.IconKindType
import typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.IOptions
import typings.phosphorCoreutils.mod.Token
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon", JSImport.Namespace)
@js.native
object iconMod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg {
    /**
      * Construct a new dock panel. Overrides the default renderer
      * and sets the (icon) kind
      *
      * @param options - The options for initializing the panel.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class IconRegistry ()
    extends typings.jupyterlabUiComponents.iconregistryMod.IconRegistry {
    def this(options: typings.jupyterlabUiComponents.iconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg[T] {
    /**
      * Construct a new tab bar. Sets the (icon) kind and overrides
      * the default renderer.
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  
  val IIconRegistry: Token[typings.jupyterlabUiComponents.interfacesMod.IIconRegistry] = js.native
  val defaultIconRegistry: typings.jupyterlabUiComponents.iconregistryMod.IconRegistry = js.native
  def DefaultIconReact(props: INodeOptions with AnonDivSpan): ReactElement = js.native
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer {
      def this(kind: IconKindType) = this()
    }
    
  }
  
  @js.native
  object IconImports extends js.Object {
    val defaultIcons: js.Array[IModel] = js.native
  }
  
  /* static members */
  @js.native
  object IconRegistry extends js.Object {
    def iconClassName(name: String): String = js.native
  }
  
  @js.native
  object TabBarSvg extends js.Object {
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
}

