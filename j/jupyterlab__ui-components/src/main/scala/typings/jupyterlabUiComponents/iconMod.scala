package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.anon.IOptionsloadingbooleanund
import typings.jupyterlabUiComponents.anon.Icon
import typings.jupyterlabUiComponents.anon.PartialIResolverPropsIPro
import typings.jupyterlabUiComponents.anon.PartialIResolverPropsIRea
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IIcon
import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.Menu
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "CommandPaletteSvg.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.widgetsMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "ContextMenuSvg")
  @js.native
  class ContextMenuSvg protected ()
    extends typings.jupyterlabUiComponents.widgetsMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg ()
    extends typings.jupyterlabUiComponents.widgetsMod.DockPanelSvg {
    def this(options: typings.luminoWidgets.dockpanelMod.DockPanel.IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.widgetsMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon")
  @js.native
  class LabIcon protected ()
    extends typings.jupyterlabUiComponents.labiconMod.LabIcon {
    /** *********
      * members *
      ***********/
    def this(hasNameSvgstrRenderUnrender_loading: IOptionsloadingbooleanund) = this()
  }
  /* static members */
  object LabIcon {
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon._debug")
    @js.native
    def _debug: js.Any = js.native
    @scala.inline
    def _debug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon._instances")
    @js.native
    def _instances: js.Any = js.native
    @scala.inline
    def _instances_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instances")(x.asInstanceOf[js.Any])
    
    /** *********
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
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.remove")
    @js.native
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
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.resolve")
    @js.native
    def resolve(hasIcon: Icon): typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
    
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
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.resolveElement")
    @js.native
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
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.resolveReact")
    @js.native
    def resolveReact(hasIconIconClassFallbackProps: PartialIResolverPropsIRea): Element = js.native
    
    /**
      * Resolve a {name, svgstr} pair into an actual svg node.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.resolveSvg")
    @js.native
    def resolveSvg(hasNameSvgstr: IIcon): HTMLElement | Null = js.native
    
    /**
      * Toggle icon debug from off-to-on, or vice-versa.
      *
      * @param debug - optional boolean to force debug on or off
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.toggleDebug")
    @js.native
    def toggleDebug(): Unit = js.native
    @JSImport("@jupyterlab/ui-components/lib/icon", "LabIcon.toggleDebug")
    @js.native
    def toggleDebug(debug: Boolean): Unit = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg")
  @js.native
  class MenuSvg protected ()
    extends typings.jupyterlabUiComponents.widgetsMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.jupyterlabUiComponents.widgetsMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "MenuSvg.overrideDefaultRenderer")
    @js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] ()
    extends typings.jupyterlabUiComponents.widgetsMod.TabBarSvg[T] {
    def this(options: typings.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.jupyterlabUiComponents.widgetsMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "addIcon")
  @js.native
  val addIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "badIcon")
  @js.native
  val badIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "blankIcon")
  @js.native
  val blankIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "bugIcon")
  @js.native
  val bugIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "buildIcon")
  @js.native
  val buildIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownEmptyIcon")
  @js.native
  val caretDownEmptyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownEmptyThinIcon")
  @js.native
  val caretDownEmptyThinIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretDownIcon")
  @js.native
  val caretDownIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretLeftIcon")
  @js.native
  val caretLeftIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretRightIcon")
  @js.native
  val caretRightIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretUpEmptyThinIcon")
  @js.native
  val caretUpEmptyThinIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caretUpIcon")
  @js.native
  val caretUpIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "caseSensitiveIcon")
  @js.native
  val caseSensitiveIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "checkIcon")
  @js.native
  val checkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "circleEmptyIcon")
  @js.native
  val circleEmptyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "circleIcon")
  @js.native
  val circleIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "clearIcon")
  @js.native
  val clearIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "closeIcon")
  @js.native
  val closeIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "consoleIcon")
  @js.native
  val consoleIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "copyIcon")
  @js.native
  val copyIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "cutIcon")
  @js.native
  val cutIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "downloadIcon")
  @js.native
  val downloadIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "editIcon")
  @js.native
  val editIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "ellipsesIcon")
  @js.native
  val ellipsesIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "extensionIcon")
  @js.native
  val extensionIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fastForwardIcon")
  @js.native
  val fastForwardIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fileIcon")
  @js.native
  val fileIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "fileUploadIcon")
  @js.native
  val fileUploadIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "filterListIcon")
  @js.native
  val filterListIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "folderIcon")
  @js.native
  val folderIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "html5Icon")
  @js.native
  val html5Icon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "imageIcon")
  @js.native
  val imageIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "inspectorIcon")
  @js.native
  val inspectorIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jsonIcon")
  @js.native
  val jsonIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterFaviconIcon")
  @js.native
  val jupyterFaviconIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterIcon")
  @js.native
  val jupyterIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "jupyterlabWordmarkIcon")
  @js.native
  val jupyterlabWordmarkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "kernelIcon")
  @js.native
  val kernelIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "keyboardIcon")
  @js.native
  val keyboardIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "launcherIcon")
  @js.native
  val launcherIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "lineFormIcon")
  @js.native
  val lineFormIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "linkIcon")
  @js.native
  val linkIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "listIcon")
  @js.native
  val listIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "listingsInfoIcon")
  @js.native
  val listingsInfoIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "markdownIcon")
  @js.native
  val markdownIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "newFolderIcon")
  @js.native
  val newFolderIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "notTrustedIcon")
  @js.native
  val notTrustedIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "notebookIcon")
  @js.native
  val notebookIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "paletteIcon")
  @js.native
  val paletteIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "pasteIcon")
  @js.native
  val pasteIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "pythonIcon")
  @js.native
  val pythonIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "rKernelIcon")
  @js.native
  val rKernelIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "reactIcon")
  @js.native
  val reactIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "redoIcon")
  @js.native
  val redoIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "refreshIcon")
  @js.native
  val refreshIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "regexIcon")
  @js.native
  val regexIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "runIcon")
  @js.native
  val runIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "runningIcon")
  @js.native
  val runningIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "saveIcon")
  @js.native
  val saveIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "searchIcon")
  @js.native
  val searchIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "settingsIcon")
  @js.native
  val settingsIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "spreadsheetIcon")
  @js.native
  val spreadsheetIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "stopIcon")
  @js.native
  val stopIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "tabIcon")
  @js.native
  val tabIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "terminalIcon")
  @js.native
  val terminalIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "textEditorIcon")
  @js.native
  val textEditorIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "trustedIcon")
  @js.native
  val trustedIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "undoIcon")
  @js.native
  val undoIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "vegaIcon")
  @js.native
  val vegaIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/icon", "yamlIcon")
  @js.native
  val yamlIcon: typings.jupyterlabUiComponents.labiconMod.LabIcon = js.native
}
