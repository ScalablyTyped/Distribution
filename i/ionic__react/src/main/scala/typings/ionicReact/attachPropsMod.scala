package typings.ionicReact

import typings.ionicReact.anon.ElementeventskeystringeEv
import typings.std.DOMTokenList
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachPropsMod {
  
  @JSImport("@ionic/react/dist/types/components/utils/attachProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassName")(classList.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isCoveredByReact(eventNameSuffix: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoveredByReact")(eventNameSuffix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
