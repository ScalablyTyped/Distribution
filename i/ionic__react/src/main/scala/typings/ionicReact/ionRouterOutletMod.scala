package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonRouterOutletElement
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.utilsMod.IonicReactExternalProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonRouterOutlet", JSImport.Namespace)
@js.native
object ionRouterOutletMod extends js.Object {
  val IonRouterOutlet: ForwardRefExoticComponent[
    (Pick[
      IonicReactExternalProps[
        typings.ionicCore.componentsMod.LocalJSX.IonRouterOutlet with AnonRef with IonicReactProps, 
        HTMLIonRouterOutletElement
      ], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 258 */ js.Any
    ]) with RefAttributes[HTMLIonRouterOutletElement]
  ] = js.native
}

