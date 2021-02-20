package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.componentsMod.global.HTMLIonTabButtonElement
import typings.ionicCore.tabBarInterfaceMod.TabButtonLayout
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.routerOptionsMod.RouterOptions
import typings.react.mod.Component
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabButtonMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabButton", "IonTabButton")
  @js.native
  class IonTabButton protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    
    def handleIonTabButtonClick(): Unit = js.native
  }
  
  /* Inlined @ionic/core.@ionic/core.JSX.IonTabButton & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & {  routerOptions :@ionic/react.@ionic/react/dist/types/models.RouterOptions | undefined,   ref :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonTabButtonElement> | undefined,   onClick :(e : any): void | undefined} */
  @js.native
  trait Props extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the user cannot interact with the tab button.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
      */
    var download: js.UndefOr[String] = js.native
    
    /**
      * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
      */
    var href: js.UndefOr[String] = js.native
    
    /**
      * Set the layout of the text and icon in the tab bar. It defaults to `'icon-top'`.
      */
    var layout: js.UndefOr[TabButtonLayout] = js.native
    
    /**
      * The mode determines which platform styles to use.
      */
    var mode: js.UndefOr[ios | md] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
    
    var ref: js.UndefOr[RefObject[HTMLIonTabButtonElement]] = js.native
    
    /**
      * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
      */
    var rel: js.UndefOr[String] = js.native
    
    var routerOptions: js.UndefOr[RouterOptions] = js.native
    
    /**
      * The selected tab component
      */
    var selected: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
      */
    var tab: js.UndefOr[String] = js.native
    
    /**
      * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
      */
    var target: js.UndefOr[String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setLayout(value: TabButtonLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRef(value: RefObject[HTMLIonTabButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRouterOptions(value: RouterOptions): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
