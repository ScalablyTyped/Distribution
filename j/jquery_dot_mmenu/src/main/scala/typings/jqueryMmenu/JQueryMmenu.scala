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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryMmenu {
  
  @js.native
  trait API extends StObject {
    
    /**
      * Trigger non-specialized signature method
      * @param methodName
      * @param callback
      */
    def bind(methodName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
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
  
  @js.native
  trait ClassnamesConfigurations extends StObject {
    
    /**
      * The classname on a LI that should be displayed as a divider.
      * Default: "Divider"
      */
    var divider: js.UndefOr[String] = js.native
    
    /**
      * The classname on a submenu (a nested UL) that should be displayed as a default list.
      * Default: "Inset"
      */
    var inset: js.UndefOr[String] = js.native
    
    /**
      * The classname on an element (for example a DIV) that should be considered to be a panel.
      * Only applies if the "isMenu" option is set to false.
      * Default: "Panel"
      */
    var panel: js.UndefOr[String] = js.native
    
    /**
      * The classname on the LI that should be displayed as selected.
      * Default: "Selected"
      */
    var selected: js.UndefOr[String] = js.native
    
    /**
      * The classname on a submenu (a nested UL) that should expand below
      * their parent instead of slide in from the right.
      * Default: "vertical"
      */
    var vertical: js.UndefOr[String] = js.native
  }
  object ClassnamesConfigurations {
    
    @scala.inline
    def apply(): ClassnamesConfigurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassnamesConfigurations]
    }
    
    @scala.inline
    implicit class ClassnamesConfigurationsMutableBuilder[Self <: ClassnamesConfigurations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      @scala.inline
      def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait Configurations extends StObject {
    
    /**
      * the CSS class names object
      */
    var classNames: js.UndefOr[ClassnamesConfigurations] = js.native
    
    /**
      * Whether or not the menu should be cloned (and the original menu kept intact).
      * Default: false
      */
    @JSName("clone")
    var clone_FConfigurations: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of milliseconds between opening/closing the menu and panels,
      * needed to force CSS transitions.
      * Default: 25
      */
    var openingInterval: js.UndefOr[Double] = js.native
    
    /**
      * jQuery selector containing the node-type of panels.
      * Default: "div, ul, ol"
      */
    var panelNodetype: js.UndefOr[String] = js.native
    
    /**
      * The number of milliseconds used in the CSS transitions.
      * Default: 400 (The value should match the associated CSS value.)
      */
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object Configurations {
    
    @scala.inline
    def apply(): Configurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configurations]
    }
    
    @scala.inline
    implicit class ConfigurationsMutableBuilder[Self <: Configurations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: ClassnamesConfigurations): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setOpeningInterval(value: Double): Self = StObject.set(x, "openingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpeningIntervalUndefined: Self = StObject.set(x, "openingInterval", js.undefined)
      
      @scala.inline
      def setPanelNodetype(value: String): Self = StObject.set(x, "panelNodetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelNodetypeUndefined: Self = StObject.set(x, "panelNodetype", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  @js.native
  trait NavbarOptions extends StObject {
    
    /**
      * Whether or not to add a navbar above the panels.
      * Default: true
      */
    var add: js.UndefOr[Boolean] = js.native
    
    /**
      * The title above the main panel.
      * Default: "Menu"
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * The type of link to set for the title.
      * Possible values: "parent", "anchor" or "none".
      * Default: "parent"
      */
    var titleLink: js.UndefOr[String] = js.native
  }
  object NavbarOptions {
    
    @scala.inline
    def apply(): NavbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarOptions]
    }
    
    @scala.inline
    implicit class NavbarOptionsMutableBuilder[Self <: NavbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLink(value: String): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait OnclickOptions extends StObject {
    
    /**
      * Whether or not the menu should close after clicking a link inside it.
      * The default value varies per link: true if the default behavior for
      * the clicked link is prevented, false otherwise.
      * Default: null
      */
    var close: js.UndefOr[Boolean | js.Any] = js.native
    
    /**
      * Whether or not to prevent the default behavior for the clicked link.
      * The default value varies per link: true if its href is equal to
      * or starts with a hash (#), false otherwise.
      * Default: null
      */
    var preventDefault: js.UndefOr[Boolean | js.Any] = js.native
    
    /**
      * Whether or not the clicked link should be visibly "selected".
      * Default: true
      */
    var setSelected: js.UndefOr[Boolean | js.Any] = js.native
  }
  object OnclickOptions {
    
    @scala.inline
    def apply(): OnclickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnclickOptions]
    }
    
    @scala.inline
    implicit class OnclickOptionsMutableBuilder[Self <: OnclickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Boolean | js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean | js.Any): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setSetSelected(value: Boolean | js.Any): Self = StObject.set(x, "setSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSelectedUndefined: Self = StObject.set(x, "setSelected", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * A collection of extension names to enable for the menu.
      * You'll need this option when using the extensions.
      * Default: []
      */
    var extensions: js.UndefOr[js.Array[js.Object]] = js.native
    
    /**
      * navbar options
      */
    var navbar: js.UndefOr[NavbarOptions] = js.native
    
    /**
      * onClick options
      */
    var onClick: js.UndefOr[OnclickOptions] = js.native
    
    /**
      * Whether or not submenus should come sliding in from the right.
      * If false, submenus expand below their parent.
      * To expand a single submenu below its parent item, add the class "Vertical" to it.
      * Default: true
      */
    var slidingSubmenus: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[js.Object]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: js.Object*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setNavbar(value: NavbarOptions): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setOnClick(value: OnclickOptions): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSlidingSubmenus(value: Boolean): Self = StObject.set(x, "slidingSubmenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidingSubmenusUndefined: Self = StObject.set(x, "slidingSubmenus", js.undefined)
    }
  }
}
