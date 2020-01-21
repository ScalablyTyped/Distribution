package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.blueprintMod.IButtonProps
import typings.jupyterlabUiComponents.blueprintMod.IInputGroupProps
import typings.jupyterlabUiComponents.interfacesMod.Icon.IModel
import typings.jupyterlabUiComponents.interfacesMod.Icon.INodeOptions
import typings.jupyterlabUiComponents.styleIconMod.IconKindType
import typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.IOptions
import typings.phosphorCoreutils.mod.Token
import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typings.jupyterlabUiComponents.iconMod.DockPanelSvg {
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
    extends typings.jupyterlabUiComponents.iconMod.IconRegistry {
    def this(options: typings.jupyterlabUiComponents.iconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typings.jupyterlabUiComponents.iconMod.TabBarSvg[T] {
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
  def Button(props: IButtonProps with DOMAttributes[_]): Element = js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def DefaultIconReact(props: INodeOptions with AnonDivSpan): ReactElement = js.native
  def HTMLSelect(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IHTMLSelectProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def InputGroup(props: IInputGroupProps with DOMAttributes[_]): Element = js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def combineClasses(classNames: js.UndefOr[String]*): String = js.native
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.iconMod.DockPanelSvg.Renderer {
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

