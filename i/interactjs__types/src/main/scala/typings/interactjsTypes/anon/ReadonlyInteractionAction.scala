package typings.interactjsTypes.anon

import typings.interactjsTypes.dropPluginMod.DropState
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactionMod.InteractionProxy
import typings.interactjsTypes.interactjsInertiaPluginMod.InertiaState
import typings.interactjsTypes.interactjsTypesBooleans.`false`
import typings.interactjsTypes.interactjsTypesStrings._createPreparedEvent
import typings.interactjsTypes.interactjsTypesStrings._fireEvent
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.interactjsTypes.modificationMod.default
import typings.interactjsTypes.pointerInfoMod.PointerInfo
import typings.interactjsTypes.scopeMod.ListenerName
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.ActionProps
import typings.interactjsTypes.typesMod.CoordsSet
import typings.interactjsTypes.typesMod.EdgeOptions
import typings.interactjsTypes.typesMod.FullRect
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@interactjs/types.@interactjs/core/Interaction.Interaction<@interactjs/types.@interactjs/core/types.ActionName>> */
@js.native
trait ReadonlyInteractionAction extends StObject {
  
  @JSName("_createPreparedEvent")
  def _createPreparedEvent_createPreparedEvent[P /* <: EventPhase */](event: PointerEventType, phase: _createPreparedEvent): InteractEvent[ActionName, _createPreparedEvent] = js.native
  @JSName("_createPreparedEvent")
  def _createPreparedEvent_createPreparedEvent[P /* <: EventPhase */](event: PointerEventType, phase: _createPreparedEvent, preEnd: Boolean): InteractEvent[ActionName, _createPreparedEvent] = js.native
  @JSName("_createPreparedEvent")
  def _createPreparedEvent_createPreparedEvent[P /* <: EventPhase */](event: PointerEventType, phase: _createPreparedEvent, preEnd: Boolean, `type`: String): InteractEvent[ActionName, _createPreparedEvent] = js.native
  @JSName("_createPreparedEvent")
  def _createPreparedEvent_createPreparedEvent[P /* <: EventPhase */](event: PointerEventType, phase: _createPreparedEvent, preEnd: Unit, `type`: String): InteractEvent[ActionName, _createPreparedEvent] = js.native
  
  def _doPhase[P /* <: EventPhase */](signalArg: OmitDoPhaseArgActionNamed): Boolean = js.native
  
  val _ending: Boolean = js.native
  
  @JSName("_fireEvent")
  def _fireEvent_fireEvent[P /* <: EventPhase */](iEvent: InteractEvent[ActionName, _fireEvent]): Unit = js.native
  
  val _id: Double = js.native
  
  val _interacting: Boolean = js.native
  
  val _latestPointer: Pointer = js.native
  
  def _now(): Double = js.native
  
  val _proxy: js.UndefOr[InteractionProxy[ActionName] | Null] = js.native
  
  val _rects: js.UndefOr[Corrected] = js.native
  
  val _reflowPromise: js.Promise[Unit] = js.native
  
  def _reflowResolve(args: Any*): Unit = js.native
  
  def _scopeFire[T /* <: ListenerName */](
    name: T,
    arg: /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/scope.SignalArgs[T] */ js.Any
  ): Unit | `false` = js.native
  
  val _stopped: Boolean = js.native
  
  def _updateLatestPointer(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node
  ): Unit = js.native
  
  val autoScroll: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof autoScroll */ Any
  ] = js.native
  
  val autoStartHoldTimer: js.UndefOr[Any] = js.native
  
  val coords: CoordsSet = js.native
  
  def currentAction(): ActionName = js.native
  
  def destroy(): Unit = js.native
  
  def doMove(): Any = js.native
  
  def documentBlur(event: typings.std.Event): Unit = js.native
  
  val downEvent: js.UndefOr[PointerEventType | Null] = js.native
  
  val downPointer: typings.interactjsTypes.typesMod.PointerType = js.native
  
  val dropState: js.UndefOr[DropState] = js.native
  
  val edges: js.UndefOr[EdgeOptions | Null] = js.native
  
  val element: js.UndefOr[typings.interactjsTypes.typesMod.Element | Null] = js.native
  
  def end(): Unit = js.native
  def end(event: PointerEventType): Unit = js.native
  
  val gesture: js.UndefOr[Distance] = js.native
  
  def getPointerIndex(pointer: Any): Double = js.native
  
  def getPointerInfo(pointer: Any): PointerInfo = js.native
  
  val holdIntervalHandle: js.UndefOr[Any] = js.native
  
  val inertia: js.UndefOr[InertiaState] = js.native
  
  val interactable: js.UndefOr[InteractableAllowFrom | Null] = js.native
  
  def interacting(): Boolean = js.native
  
  val modification: js.UndefOr[default] = js.native
  
  def move(): Unit = js.native
  def move(signalArg: Any): Unit = js.native
  
  val offset: Pending = js.native
  
  val offsetBy: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof offsetBy */ Any
  ] = js.native
  
  def pointerDown(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node
  ): Unit = js.native
  
  val pointerIsDown: Boolean = js.native
  
  def pointerMove(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node
  ): Unit = js.native
  
  val pointerType: String = js.native
  
  def pointerUp(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node,
    curEventTarget: typings.std.EventTarget
  ): Unit = js.native
  
  val pointerWasMoved: Boolean = js.native
  
  val pointers: js.Array[PointerInfo] = js.native
  
  val prepared: ActionProps[ActionName] = js.native
  
  val prevEvent: InteractEvent[ActionName, EventPhase] = js.native
  
  val prevTap: js.UndefOr[typings.std.PointerEvent] = js.native
  
  val rect: js.UndefOr[FullRect | Null] = js.native
  
  def removePointer(pointer: typings.interactjsTypes.typesMod.PointerType, event: PointerEventType): Unit = js.native
  
  val resizeAxes: x | y | xy = js.native
  
  val resizeStartAspectRatio: Double = js.native
  
  val simulation: Any = js.native
  
  def start[A /* <: ActionName */](
    action: ActionProps[A],
    interactable: InteractableAllowFrom,
    element: typings.interactjsTypes.typesMod.Element
  ): Boolean = js.native
  
  def stop(): Unit = js.native
  
  val tapTime: js.UndefOr[Double] = js.native
  
  def updatePointer(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node
  ): Double = js.native
  def updatePointer(
    pointer: typings.interactjsTypes.typesMod.PointerType,
    event: PointerEventType,
    eventTarget: typings.std.Node,
    down: Boolean
  ): Double = js.native
}
