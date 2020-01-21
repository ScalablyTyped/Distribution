package typings.ionicReact

import typings.ionicCore.componentsMod.LocalJSX.IonBackButton
import typings.ionicCore.componentsMod.LocalJSX.IonRouterOutlet
import typings.ionicCore.componentsMod.LocalJSX.IonTabBar
import typings.ionicCore.componentsMod._Global_.HTMLIonBackButtonElement
import typings.ionicCore.componentsMod._Global_.HTMLIonRouterOutletElement
import typings.ionicCore.componentsMod._Global_.HTMLIonTabBarElement
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.ionicReactStrings.`type`
import typings.ionicReact.ionicReactStrings.color
import typings.ionicReact.ionicReactStrings.defaultHref
import typings.ionicReact.ionicReactStrings.disabled
import typings.ionicReact.ionicReactStrings.mode
import typings.ionicReact.ionicReactStrings.text
import typings.ionicReact.utilsMod.IonicReactExternalProps
import typings.ionicons.componentsMod.LocalJSX.IonIcon
import typings.ionicons.componentsMod._Global_.HTMLIonIconElement
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/inner-proxies", JSImport.Namespace)
@js.native
object innerProxiesMod extends js.Object {
  val IonBackButtonInner: ForwardRefExoticComponent[
    (Pick[IonBackButton, disabled | text | color | mode | `type` | defaultHref]) with (Pick[
      HTMLAttributes[HTMLIonBackButtonElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
    ]) with IonicReactProps with RefAttributes[HTMLIonBackButtonElement]
  ] = js.native
  val IonIconInner: ForwardRefExoticComponent[
    (Pick[
      IonicReactExternalProps[IonIcon, HTMLIonIconElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 284 */ js.Any
    ]) with RefAttributes[HTMLIonIconElement]
  ] = js.native
  val IonRouterOutletInner: ForwardRefExoticComponent[
    IonRouterOutlet with (Pick[
      HTMLAttributes[HTMLIonRouterOutletElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
    ]) with IonicReactProps with RefAttributes[HTMLIonRouterOutletElement]
  ] = js.native
  val IonTabBarInner: ForwardRefExoticComponent[
    IonTabBar with (Pick[
      HTMLAttributes[HTMLIonTabBarElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
    ]) with IonicReactProps with RefAttributes[HTMLIonTabBarElement]
  ] = js.native
}

