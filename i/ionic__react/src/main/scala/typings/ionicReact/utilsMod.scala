package typings.ionicReact

import typings.ionicCore.mod.Config_
import typings.ionicCore.platformMod.Platforms
import typings.ionicReact.anon.ElementeventskeystringeEv
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.ionicReactStrings.android
import typings.ionicReact.ionicReactStrings.capacitor
import typings.ionicReact.ionicReactStrings.cordova
import typings.ionicReact.ionicReactStrings.desktop
import typings.ionicReact.ionicReactStrings.electron
import typings.ionicReact.ionicReactStrings.hybrid
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.ipad
import typings.ionicReact.ionicReactStrings.iphone
import typings.ionicReact.ionicReactStrings.mobile
import typings.ionicReact.ionicReactStrings.mobileweb
import typings.ionicReact.ionicReactStrings.phablet
import typings.ionicReact.ionicReactStrings.pwa
import typings.ionicReact.ionicReactStrings.style
import typings.ionicReact.ionicReactStrings.tablet
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.DOMTokenList
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def camelToDashCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToDashCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForwardRef")(ReactComponent.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  
  @scala.inline
  def dashToPascalCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dashToPascalCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassName")(classList.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getConfig(): Config_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Config_ | Null]
  
  @scala.inline
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  @scala.inline
  def isCoveredByReact(eventNameSuffix: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoveredByReact")(eventNameSuffix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPlatform(platform: Platforms): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlatform")(platform.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IonicReactExternalProps[PropType, ElementType] = PropType & (Omit[HTMLAttributes[ElementType], style]) & IonicReactProps
}
