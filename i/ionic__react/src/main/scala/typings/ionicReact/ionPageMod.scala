package typings.ionicReact

import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPage", JSImport.Namespace)
@js.native
object ionPageMod extends js.Object {
  val IonPage: ForwardRefExoticComponent[
    (Pick[
      HTMLAttributes[_], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
    ]) with IonicReactProps with RefAttributes[_]
  ] = js.native
}

