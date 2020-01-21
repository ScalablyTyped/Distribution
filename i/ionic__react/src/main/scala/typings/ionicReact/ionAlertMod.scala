package typings.ionicReact

import typings.ionicCore.alertInterfaceMod.AlertOptions
import typings.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typings.ionicReact.createControllerComponentMod.ReactControllerProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonAlert", JSImport.Namespace)
@js.native
object ionAlertMod extends js.Object {
  val IonAlert: ForwardRefExoticComponent[
    AlertOptions with ReactControllerProps with AnonForwardedRefHTMLIonAlertElement with RefAttributes[HTMLIonAlertElement]
  ] = js.native
}

