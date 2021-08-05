package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.small
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonFabButton extends StObject {
  
  /**
    * If `true`, the fab button will be show a close icon.
    */
  var activated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon name to use for the close icon. This will appear when the fab button is pressed. Only applies if it is the main button inside of a fab containing a fab list.
    */
  var closeIcon: js.UndefOr[String] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the fab button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted when the button loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the button has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  
  /**
    * When using a router, it specifies the transition animation when navigating to another page using `href`.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  
  /**
    * If `true`, the fab button will show when in a fab-list.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the button. Set this to `small` in order to have a mini fab button.
    */
  var size: js.UndefOr[small] = js.undefined
  
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the fab button will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the button.
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}
object IonFabButton {
  
  inline def apply(): IonFabButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFabButton]
  }
  
  extension [Self <: IonFabButton](x: Self) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1(value))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1(value))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    inline def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    inline def setRouterDirection(value: RouterDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
    
    inline def setRouterDirectionUndefined: Self = StObject.set(x, "routerDirection", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSize(value: small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
