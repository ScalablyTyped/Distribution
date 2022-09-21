package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.anon.Allowed
import typings.maplibreGl.anon.Capture
import typings.maplibreGl.anon.Center
import typings.std.Document
import typings.std.HTMLElement
import typings.std.TouchList
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "HandlerManager")
@js.native
open class HandlerManager protected () extends StObject {
  def this(map: Map, options: CompleteMapOptions) = this()
  
  def _add(handlerName: String, handler: Handler): scala.Unit = js.native
  def _add(handlerName: String, handler: Handler, allowed: js.Array[String]): scala.Unit = js.native
  
  def _addDefaultHandlers(options: CompleteMapOptions): scala.Unit = js.native
  
  def _applyChanges(): scala.Unit = js.native
  
  var _bearingSnap: Double = js.native
  
  def _blockedByActive(activeHandlers: StringDictionary[Handler], allowed: js.Array[String], myName: String): Boolean = js.native
  
  var _changes: js.Array[js.Tuple3[HandlerResult, Any, Any]] = js.native
  
  var _drag: Center = js.native
  
  var _el: HTMLElement = js.native
  
  var _eventsInProgress: Any = js.native
  
  def _fireEvent(`type`: String, e: Any): scala.Unit = js.native
  
  def _fireEvents(newEventsInProgress: StringDictionary[Any], deactivatedHandlers: Any, allowEndAnimation: Boolean): scala.Unit = js.native
  
  var _frameId: Double = js.native
  
  def _getMapTouches(touches: TouchList): TouchList = js.native
  
  var _handlers: js.Array[Allowed] = js.native
  
  var _handlersById: StringDictionary[Handler] = js.native
  
  var _inertia: HandlerInertia = js.native
  
  var _listeners: js.Array[js.Tuple3[Window | Document | HTMLElement, String, js.UndefOr[Capture]]] = js.native
  
  var _map: Map = js.native
  
  var _previousActiveHandlers: StringDictionary[Handler] = js.native
  
  def _requestFrame(): Double = js.native
  
  def _triggerRenderFrame(): scala.Unit = js.native
  
  def _updateMapTransform(combinedResult: Any, combinedEventsInProgress: Any, deactivatedHandlers: Any): scala.Unit = js.native
  
  var _updatingCamera: Boolean = js.native
  
  def destroy(): scala.Unit = js.native
  
  def handleEvent(e: InputEvent): scala.Unit = js.native
  def handleEvent(e: InputEvent, eventName: String): scala.Unit = js.native
  def handleEvent(e: RenderFrameEvent): scala.Unit = js.native
  def handleEvent(e: RenderFrameEvent, eventName: String): scala.Unit = js.native
  
  def handleWindowEvent(e: InputEvent): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isMoving(): Boolean = js.native
  
  def isRotating(): Boolean = js.native
  
  def isZooming(): Boolean = js.native
  
  def mergeHandlerResult(
    mergedHandlerResult: HandlerResult,
    eventsInProgress: Any,
    handlerResult: HandlerResult,
    name: String
  ): scala.Unit = js.native
  def mergeHandlerResult(
    mergedHandlerResult: HandlerResult,
    eventsInProgress: Any,
    handlerResult: HandlerResult,
    name: String,
    e: InputEvent
  ): scala.Unit = js.native
  
  def stop(allowEndAnimation: Boolean): scala.Unit = js.native
}
