package typings.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabUiComponents.blueprintMod.CommonProps
import typings.jupyterlabUiComponents.blueprintMod.IButtonProps
import typings.jupyterlabUiComponents.blueprintMod.IInputGroupProps
import typings.jupyterlabUiComponents.jupyterlabUiComponentsBooleans.`false`
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.`jp-DefaultStyle`
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.`jp-HTMLSelect`
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IIcon
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.Menu
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ContextMenuSvg protected ()
    extends typings.jupyterlabUiComponents.iconMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg ()
    extends typings.jupyterlabUiComponents.iconMod.DockPanelSvg {
    def this(options: typings.luminoWidgets.dockpanelMod.DockPanel.IOptions) = this()
  }
  
  @js.native
  class HTMLSelect ()
    extends typings.jupyterlabUiComponents.htmlselectMod.HTMLSelect
  
  @js.native
  class LabIcon protected ()
    extends typings.jupyterlabUiComponents.iconMod.LabIcon {
    /***********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingboolean) = this()
  }
  
  @js.native
  class MenuSvg protected ()
    extends typings.jupyterlabUiComponents.iconMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] ()
    extends typings.jupyterlabUiComponents.iconMod.TabBarSvg[T] {
    def this(options: typings.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  
  val DEFAULT_STYLE_CLASS: `jp-DefaultStyle` = js.native
  val HTML_SELECT_CLASS: `jp-HTMLSelect` = js.native
  val ILabIconManager: Token[typings.jupyterlabUiComponents.tokensMod.ILabIconManager] = js.native
  val addIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val badIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val blankIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val bugIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val buildIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretDownEmptyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretDownEmptyThinIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretDownIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretLeftIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretRightIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretUpEmptyThinIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caretUpIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val caseSensitiveIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val checkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val circleEmptyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val circleIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val clearIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val closeIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val consoleIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val copyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val cutIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val downloadIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val editIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val ellipsesIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val extensionIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val fastForwardIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val fileIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val fileUploadIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val filterListIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val folderIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val html5Icon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val imageIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val inspectorIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val jsonIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val jupyterFaviconIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val jupyterIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val jupyterlabWordmarkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val kernelIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val keyboardIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val launcherIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val lineFormIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val linkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val listIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val listingsInfoIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val markdownIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val newFolderIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val notTrustedIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val notebookIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val paletteIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val pasteIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val pythonIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val rKernelIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val reactIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val refreshIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val regexIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val runIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val runningIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val saveIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val searchIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val settingsIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val spreadsheetIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val stopIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val tabIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val terminalIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val textEditorIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val trustedIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val undoIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val vegaIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  val yamlIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  def Button(props: IButtonProps with CommonProps[_]): Element = js.native
  def Checkbox(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps */ js.Any) with CommonProps[_]
  ): Element = js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with CommonProps[_]
  ): Element = js.native
  def InputGroup(props: IInputGroupProps with CommonProps[_]): Element = js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with CommonProps[_]
  ): Element = js.native
  @JSName("classesDedupe")
  def classesDedupe_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  @JSName("classes")
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  def getReactAttrs(elem: typings.std.Element): js.Any = js.native
  def getReactAttrs(elem: typings.std.Element, hasIgnore: AnonIgnore): js.Any = js.native
  @js.native
  object CommandPaletteSvg extends js.Object {
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  /* static members */
  @js.native
  object LabIcon extends js.Object {
    var _debug: js.Any = js.native
    var _instances: js.Any = js.native
    /***********
      * statics *
      ***********/
    /**
      * Remove any rendered icon from the element that contains it
      *
      * @param container - a DOM node into which an icon was
      * previously rendered
      *
      * @returns the cleaned container
      */
    def remove(container: HTMLElement): HTMLElement = js.native
    /**
      * Resolve an icon name or a {name, svgstr} pair into an
      * actual LabIcon.
      *
      * @param icon - either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields.
      *
      * @returns a LabIcon instance
      */
    def resolve(hasIcon: AnonIcon): typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
    /**
      * Resolve an icon name or a {name, svgstr} pair into a DOM element.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, this function will return
      * an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the element method
      * of the resolved icon on render
      *
      * @returns a DOM node with the resolved icon rendered into it
      */
    def resolveElement(hasIconIconClassFallbackProps: PartialIResolverPropsIPro): HTMLElement = js.native
    /**
      * Resolve an icon name or a {name, svgstr} pair into a React component.
      * If icon arg is undefined, the function will fall back to trying to render
      * the icon as a CSS background image, via the iconClass arg.
      * If both icon and iconClass are undefined, the returned component
      * will simply render an empty div.
      *
      * @param icon - optional, either a string with the name of an existing icon
      * or an object with {name: string, svgstr: string} fields
      *
      * @param iconClass - optional, if the icon arg is not set, the iconClass arg
      * should be a CSS class associated with an existing CSS background-image
      *
      * @deprecated fallback - don't use, optional, a LabIcon instance that will
      * be used if neither icon nor iconClass are defined
      *
      * @param props - any additional args are passed though to the React component
      * of the resolved icon on render
      *
      * @returns a React component that will render the resolved icon
      */
    def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): Element = js.native
    /**
      * Resolve a {name, svgstr} pair into an actual svg node.
      */
    def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = js.native
    /**
      * Toggle icon debug from off-to-on, or vice-versa.
      *
      * @param debug - optional boolean to force debug on or off
      */
    def toggleDebug(): Unit = js.native
    def toggleDebug(debug: Boolean): Unit = js.native
  }
  
  @js.native
  object MenuSvg extends js.Object {
    /**
      * a modified implementation of the Menu Renderer
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
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

