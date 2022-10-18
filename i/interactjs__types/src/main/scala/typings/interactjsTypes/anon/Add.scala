package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.coreEventsMod.FakeEvent
import typings.interactjsTypes.interactjsTypesStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  def add(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def add(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def add(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Boolean
  ): Unit = js.native
  
  def addDelegate(
    selector: String,
    context: typings.std.Node,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def addDelegate(
    selector: String,
    context: typings.std.Node,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  
  def delegateListener(event: FakeEvent): Unit = js.native
  def delegateListener(event: FakeEvent, optionalArg: Any): Unit = js.native
  def delegateListener(event: typings.std.Event): Unit = js.native
  def delegateListener(event: typings.std.Event, optionalArg: Any): Unit = js.native
  
  def delegateUseCapture(event: FakeEvent): Any = js.native
  def delegateUseCapture(event: typings.std.Event): Any = js.native
  
  var delegatedEvents: StringDictionary[js.Array[Context]] = js.native
  
  var documents: js.Array[typings.std.Document] = js.native
  
  def remove(eventTarget: typings.std.EventTarget, `type`: String): Unit = js.native
  def remove(eventTarget: typings.std.EventTarget, `type`: String, listener: Unit, optionalArg: Any): Unit = js.native
  def remove(eventTarget: typings.std.EventTarget, `type`: String, listener: Unit, optionalArg: Boolean): Unit = js.native
  def remove(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def remove(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def remove(
    eventTarget: typings.std.EventTarget,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Boolean
  ): Unit = js.native
  
  def removeDelegate(selector: String, context: typings.interactjsTypes.coreTypesMod.Element, `type`: String): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typings.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: Unit,
    optionalArg: Any
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typings.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typings.interactjsTypes.coreTypesMod.Element,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  def removeDelegate(selector: String, context: typings.std.Document, `type`: String): Unit = js.native
  def removeDelegate(selector: String, context: typings.std.Document, `type`: String, listener: Unit, optionalArg: Any): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typings.std.Document,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener
  ): Unit = js.native
  def removeDelegate(
    selector: String,
    context: typings.std.Document,
    `type`: String,
    listener: typings.interactjsTypes.coreEventsMod.Listener,
    optionalArg: Any
  ): Unit = js.native
  
  @JSName("remove")
  def remove_all(eventTarget: typings.std.EventTarget, `type`: String, listener: all): Unit = js.native
  @JSName("remove")
  def remove_all(eventTarget: typings.std.EventTarget, `type`: String, listener: all, optionalArg: Any): Unit = js.native
  @JSName("remove")
  def remove_all(eventTarget: typings.std.EventTarget, `type`: String, listener: all, optionalArg: Boolean): Unit = js.native
  
  var supportsOptions: Boolean = js.native
  
  var supportsPassive: Boolean = js.native
  
  var targets: js.Array[Events] = js.native
}
