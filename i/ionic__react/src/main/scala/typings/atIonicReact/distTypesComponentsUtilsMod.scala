package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.android
import typings.atIonicReact.atIonicReactStrings.capacitor
import typings.atIonicReact.atIonicReactStrings.cordova
import typings.atIonicReact.atIonicReactStrings.desktop
import typings.atIonicReact.atIonicReactStrings.electron
import typings.atIonicReact.atIonicReactStrings.hybrid
import typings.atIonicReact.atIonicReactStrings.ios
import typings.atIonicReact.atIonicReactStrings.ipad
import typings.atIonicReact.atIonicReactStrings.iphone
import typings.atIonicReact.atIonicReactStrings.mobile
import typings.atIonicReact.atIonicReactStrings.mobileweb
import typings.atIonicReact.atIonicReactStrings.phablet
import typings.atIonicReact.atIonicReactStrings.pwa
import typings.atIonicReact.atIonicReactStrings.style
import typings.atIonicReact.atIonicReactStrings.tablet
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.atIonicReact.distTypesComponentsUtilsMod.IonicReactExternalProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.RefAttributes
import typings.std.DOMTokenList
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
@js.native
object distTypesComponentsUtilsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def camelToDashCase(str: String): String = js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def dashToPascalCase(str: String): String = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document): Boolean = js.native
  def isPlatform(
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
  def syncEvent(node: Element with Anon_E, eventName: String): Unit = js.native
  def syncEvent(node: Element with Anon_E, eventName: String, newEventHandler: js.Function1[/* e */ Event, _]): Unit = js.native
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}

