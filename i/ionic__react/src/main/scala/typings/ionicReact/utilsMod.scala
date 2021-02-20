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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "camelToDashCase")
  @js.native
  def camelToDashCase(str: String): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "createForwardRef")
  @js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "dashToPascalCase")
  @js.native
  def dashToPascalCase(str: String): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getClassName")
  @js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getConfig")
  @js.native
  def getConfig(): Config_ | Null = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "getPlatforms")
  @js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "isCoveredByReact")
  @js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "isPlatform")
  @js.native
  def isPlatform(platform: Platforms): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils", "syncEvent")
  @js.native
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils", "syncEvent")
  @js.native
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, _]
  ): Unit = js.native
  
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}
