package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonBackButton
import typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonRouterOutlet
import typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonTabBar
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonBackButtonElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonRouterOutletElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonTabBarElement
import typings.atIonicReact.atIonicReactStrings.`type`
import typings.atIonicReact.atIonicReactStrings.color
import typings.atIonicReact.atIonicReactStrings.defaultHref
import typings.atIonicReact.atIonicReactStrings.disabled
import typings.atIonicReact.atIonicReactStrings.mode
import typings.atIonicReact.atIonicReactStrings.text
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/inner-proxies", JSImport.Namespace)
@js.native
object distTypesComponentsInnerDashProxiesMod extends js.Object {
  val IonBackButtonInner: ForwardRefExoticComponent[
    (Pick[IonBackButton, disabled | text | color | mode | `type` | defaultHref]) with (Pick[
      HTMLAttributes[HTMLIonBackButtonElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
    ]) with IonicReactProps with RefAttributes[HTMLIonBackButtonElement]
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

