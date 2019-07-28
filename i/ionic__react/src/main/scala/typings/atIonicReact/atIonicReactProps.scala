package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsNavigationIonBackButtonMod.BackButtonProps
import typings.atIonicReact.distTypesComponentsNavigationIonTabsMod.Props
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait atIonicReactProps {
  @scala.inline
  def IonAppProps: typings.atIonicReact.distTypesComponentsIonAppMod.IonAppProps.type = typings.atIonicReact.distTypesComponentsIonAppMod.IonAppProps
  type IonAppProps = typings.atIonicReact.distTypesComponentsIonAppMod.IonAppProps
  type IonBackButtonProps = BackButtonProps
  @scala.inline
  def IonReactRouterProps: BrowserRouterProps.type = typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
  type IonReactRouterProps = BrowserRouterProps
  @scala.inline
  def IonRouterOutletProps: typings.atIonicReact.distTypesComponentsNavigationRoutingIonRouterOutletMod.IonRouterOutletProps.type = typings.atIonicReact.distTypesComponentsNavigationRoutingIonRouterOutletMod.IonRouterOutletProps
  type IonRouterOutletProps = typings.atIonicReact.distTypesComponentsNavigationRoutingIonRouterOutletMod.IonRouterOutletProps
  type IonTabBarProps[T, K /* <: String */] = Pick[T, K]
  @scala.inline
  def IonTabsProps: Props.type = typings.atIonicReact.distTypesComponentsNavigationIonTabsMod.Props
  type IonTabsProps = Props
}

