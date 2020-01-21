package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typings.ionicCore.loadingInterfaceMod.LoadingOptions
import typings.ionicReact.createControllerComponentMod.ReactControllerProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonLoading", JSImport.Namespace)
@js.native
object ionLoadingMod extends js.Object {
  val IonLoading: ForwardRefExoticComponent[
    LoadingOptions with ReactControllerProps with AnonForwardedRefHTMLIonLoadingElement with RefAttributes[HTMLIonLoadingElement]
  ] = js.native
}

