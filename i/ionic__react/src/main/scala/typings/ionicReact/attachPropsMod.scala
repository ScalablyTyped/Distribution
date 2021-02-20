package typings.ionicReact

import typings.ionicReact.anon.ElementeventskeystringeEv
import typings.std.DOMTokenList
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachPropsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "attachProps")
  @js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "getClassName")
  @js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "isCoveredByReact")
  @js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "syncEvent")
  @js.native
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = js.native
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", "syncEvent")
  @js.native
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, _]
  ): Unit = js.native
}
