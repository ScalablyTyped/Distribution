package typings.jqueryMmenu

import typings.jqueryMmenu.jqueryMmenuStrings.closeAllPanels
import typings.jqueryMmenu.jqueryMmenuStrings.closePanel
import typings.jqueryMmenu.jqueryMmenuStrings.getInstance
import typings.jqueryMmenu.jqueryMmenuStrings.init
import typings.jqueryMmenu.jqueryMmenuStrings.openPanel
import typings.jqueryMmenu.jqueryMmenuStrings.setSelected
import typings.jqueryMmenu.jqueryMmenuStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryMmenu {
  
  @js.native
  trait API extends StObject {
    
    /**
      * Trigger non-specialized signature method
      * @param methodName
      * @param callback
      */
    def bind(methodName: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    /** @see closeAllPanels() */
    @JSName("bind")
    def bind_closeAllPanels(methodName: closeAllPanels, callback: js.Function0[Unit]): JQuery = js.native
    /** @see closePanel() */
    @JSName("bind")
    def bind_closePanel(methodName: closePanel, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
    /** @see getInstance() */
    @JSName("bind")
    def bind_getInstance(methodName: getInstance, callback: js.Function0[Unit]): Unit = js.native
    /** @see init() */
    @JSName("bind")
    def bind_init(methodName: init, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
    /** @see openPanel() */
    @JSName("bind")
    def bind_openPanel(methodName: openPanel, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
    /** @see setSelected() */
    @JSName("bind")
    def bind_setSelected(
      methodName: setSelected,
      callback: js.Function2[/* li */ JQuery, /* selected */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
    /** @see update() */
    @JSName("bind")
    def bind_update(methodName: update, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Trigger this method to close all opened panels and go back to the first panel.
      */
    def closeAllPanels(): JQuery = js.native
    
    /**
      * Trigger this method to close a panel
      * (only available if the "slidingSubmenus" option is set to false).
      * @param panel
      */
    def closePanel(panel: JQuery): Unit = js.native
    
    /**
      * Trigger this method to get the class instance for the menu.
      */
    def getInstance(): Unit = js.native
    
    /**
      * Trigger this method to (re)initialize a newly added panel.
      * @param panel The panel to (re)initialize.
      */
    def init(panel: JQuery): Unit = js.native
    
    /**
      * Trigger this method to open a panel.
      * @param panel The panel to open.
      */
    def openPanel(panel: JQuery): Unit = js.native
    
    /**
      * Trigger this method to set or unset a list item as "selected".
      * @param li The list item to set or unset as "selected".
      * @param selected Whether to set or unset the list item as "selected". Default: true
      */
    def setSelected(li: JQuery): Unit = js.native
    def setSelected(li: JQuery, selected: Boolean): Unit = js.native
    
    /**
      * Trigger this method to update the appearance for the menu.
      */
    def update(): Unit = js.native
  }
  
  trait ClassnamesConfigurations extends StObject {
    
    /**
      * The classname on a LI that should be displayed as a divider.
      * Default: "Divider"
      */
    var divider: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on a submenu (a nested UL) that should be displayed as a default list.
      * Default: "Inset"
      */
    var inset: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on an element (for example a DIV) that should be considered to be a panel.
      * Only applies if the "isMenu" option is set to false.
      * Default: "Panel"
      */
    var panel: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on the LI that should be displayed as selected.
      * Default: "Selected"
      */
    var selected: js.UndefOr[String] = js.undefined
    
    /**
      * The classname on a submenu (a nested UL) that should expand below
      * their parent instead of slide in from the right.
      * Default: "vertical"
      */
    var vertical: js.UndefOr[String] = js.undefined
  }
  object ClassnamesConfigurations {
    
    inline def apply(): ClassnamesConfigurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassnamesConfigurations]
    }
    
    extension [Self <: ClassnamesConfigurations](x: Self) {
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait Configurations extends StObject {
    
    /**
      * the CSS class names object
      */
    var classNames: js.UndefOr[ClassnamesConfigurations] = js.undefined
    
    /**
      * Whether or not the menu should be cloned (and the original menu kept intact).
      * Default: false
      */
    @JSName("clone")
    var clone_FConfigurations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds between opening/closing the menu and panels,
      * needed to force CSS transitions.
      * Default: 25
      */
    var openingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * jQuery selector containing the node-type of panels.
      * Default: "div, ul, ol"
      */
    var panelNodetype: js.UndefOr[String] = js.undefined
    
    /**
      * The number of milliseconds used in the CSS transitions.
      * Default: 400 (The value should match the associated CSS value.)
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object Configurations {
    
    inline def apply(): Configurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configurations]
    }
    
    extension [Self <: Configurations](x: Self) {
      
      inline def setClassNames(value: ClassnamesConfigurations): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setOpeningInterval(value: Double): Self = StObject.set(x, "openingInterval", value.asInstanceOf[js.Any])
      
      inline def setOpeningIntervalUndefined: Self = StObject.set(x, "openingInterval", js.undefined)
      
      inline def setPanelNodetype(value: String): Self = StObject.set(x, "panelNodetype", value.asInstanceOf[js.Any])
      
      inline def setPanelNodetypeUndefined: Self = StObject.set(x, "panelNodetype", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  trait NavbarOptions extends StObject {
    
    /**
      * Whether or not to add a navbar above the panels.
      * Default: true
      */
    var add: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The title above the main panel.
      * Default: "Menu"
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The type of link to set for the title.
      * Possible values: "parent", "anchor" or "none".
      * Default: "parent"
      */
    var titleLink: js.UndefOr[String] = js.undefined
  }
  object NavbarOptions {
    
    inline def apply(): NavbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarOptions]
    }
    
    extension [Self <: NavbarOptions](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLink(value: String): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
      
      inline def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait OnclickOptions extends StObject {
    
    /**
      * Whether or not the menu should close after clicking a link inside it.
      * The default value varies per link: true if the default behavior for
      * the clicked link is prevented, false otherwise.
      * Default: null
      */
    var close: js.UndefOr[Boolean | Any] = js.undefined
    
    /**
      * Whether or not to prevent the default behavior for the clicked link.
      * The default value varies per link: true if its href is equal to
      * or starts with a hash (#), false otherwise.
      * Default: null
      */
    var preventDefault: js.UndefOr[Boolean | Any] = js.undefined
    
    /**
      * Whether or not the clicked link should be visibly "selected".
      * Default: true
      */
    var setSelected: js.UndefOr[Boolean | Any] = js.undefined
  }
  object OnclickOptions {
    
    inline def apply(): OnclickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnclickOptions]
    }
    
    extension [Self <: OnclickOptions](x: Self) {
      
      inline def setClose(value: Boolean | Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setPreventDefault(value: Boolean | Any): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setSetSelected(value: Boolean | Any): Self = StObject.set(x, "setSelected", value.asInstanceOf[js.Any])
      
      inline def setSetSelectedUndefined: Self = StObject.set(x, "setSelected", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A collection of extension names to enable for the menu.
      * You'll need this option when using the extensions.
      * Default: []
      */
    var extensions: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * navbar options
      */
    var navbar: js.UndefOr[NavbarOptions] = js.undefined
    
    /**
      * onClick options
      */
    var onClick: js.UndefOr[OnclickOptions] = js.undefined
    
    /**
      * Whether or not submenus should come sliding in from the right.
      * If false, submenus expand below their parent.
      * To expand a single submenu below its parent item, add the class "Vertical" to it.
      * Default: true
      */
    var slidingSubmenus: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtensions(value: js.Array[js.Object]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: js.Object*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setNavbar(value: NavbarOptions): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      inline def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      inline def setOnClick(value: OnclickOptions): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSlidingSubmenus(value: Boolean): Self = StObject.set(x, "slidingSubmenus", value.asInstanceOf[js.Any])
      
      inline def setSlidingSubmenusUndefined: Self = StObject.set(x, "slidingSubmenus", js.undefined)
    }
  }
}
