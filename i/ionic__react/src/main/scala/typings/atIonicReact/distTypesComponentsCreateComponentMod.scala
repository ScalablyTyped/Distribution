package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsUtilsMod.IonicReactExternalProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createComponent", JSImport.Namespace)
@js.native
object distTypesComponentsCreateComponentMod extends js.Object {
  def createReactComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def createReactComponent[PropType, ElementType](tagName: String, routerLinkComponent: Boolean): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
}

