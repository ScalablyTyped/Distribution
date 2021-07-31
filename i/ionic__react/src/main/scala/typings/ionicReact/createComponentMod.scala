package typings.ionicReact

import typings.ionicReact.utilsMod.IonicReactExternalProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createReactComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  @scala.inline
  def createReactComponent[PropType, ElementType](tagName: String, routerLinkComponent: Boolean): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], routerLinkComponent.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
}
