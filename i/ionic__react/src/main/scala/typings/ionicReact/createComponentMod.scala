package typings.ionicReact

import typings.ionicReact.utilsMod.IonicReactExternalProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createComponent", "createReactComponent")
  @js.native
  def createReactComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  @JSImport("@ionic/react/dist/types/components/createComponent", "createReactComponent")
  @js.native
  def createReactComponent[PropType, ElementType](tagName: String, routerLinkComponent: Boolean): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
}
