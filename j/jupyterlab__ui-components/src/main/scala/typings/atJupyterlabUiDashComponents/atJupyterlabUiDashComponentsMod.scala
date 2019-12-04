package typings.atJupyterlabUiDashComponents

import typings.atJupyterlabUiDashComponents.libBlueprintMod.IButtonProps
import typings.atJupyterlabUiDashComponents.libBlueprintMod.IInputGroupProps
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.IModel
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg.IOptions
import typings.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object atJupyterlabUiDashComponentsMod extends js.Object {
  @js.native
  class DockPanelSvg protected ()
    extends typings.atJupyterlabUiDashComponents.libIconMod.DockPanelSvg {
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
    extends typings.atJupyterlabUiDashComponents.libIconMod.IconRegistry {
    def this(options: typings.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry.IOptions) = this()
  }
  
  @js.native
  class TabBarSvg[T] protected ()
    extends typings.atJupyterlabUiDashComponents.libIconMod.TabBarSvg[T] {
    /**
      * Construct a new tab bar. Sets the (icon) kind and overrides
      * the default renderer.
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  
  val IIconRegistry: Token[typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry] = js.native
  val defaultIconRegistry: typings.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry = js.native
  def Button(props: IButtonProps with DOMAttributes[_]): Element = js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def DefaultIconReact(props: INodeOptions with Anon_DivSpan): ReactElement = js.native
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
      extends typings.atJupyterlabUiDashComponents.libIconMod.DockPanelSvg.Renderer {
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
      extends typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.Renderer
    
    val defaultRenderer: typings.atJupyterlabUiDashComponents.libIconTabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
}

