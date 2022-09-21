package typings.interactjsTypes

import typings.interactjsTypes.anon.Corrected
import typings.interactjsTypes.anon.CurEventTarget
import typings.interactjsTypes.anon.Distance
import typings.interactjsTypes.anon.EventInteraction
import typings.interactjsTypes.anon.EventTarget
import typings.interactjsTypes.anon.FnCall
import typings.interactjsTypes.anon.IEvent
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.InteractableInteractableBackCompatOption
import typings.interactjsTypes.anon.Node
import typings.interactjsTypes.anon.OmitDoAnyPhaseArgiEvent
import typings.interactjsTypes.anon.OmitDoPhaseArgActionNamei
import typings.interactjsTypes.anon.OmitDoPhaseArgActionNamer
import typings.interactjsTypes.anon.Options
import typings.interactjsTypes.anon.Pending
import typings.interactjsTypes.anon.Pointer
import typings.interactjsTypes.anon.PointerArgPropsdownboolea
import typings.interactjsTypes.anon.PointerArgPropstypedown
import typings.interactjsTypes.anon.PointerArgPropstypemovedx
import typings.interactjsTypes.anon.PointerArgPropstypeupcurE
import typings.interactjsTypes.anon.PointerEvent
import typings.interactjsTypes.anon.ScopeFire
import typings.interactjsTypes.anon.SearchDetails
import typings.interactjsTypes.anon.Target
import typings.interactjsTypes.anon.`0`
import typings.interactjsTypes.anon.`1`
import typings.interactjsTypes.anon.`2`
import typings.interactjsTypes.anon.`3`
import typings.interactjsTypes.anon.`4`
import typings.interactjsTypes.baseMod.CheckSignalArg
import typings.interactjsTypes.dropPluginMod.DropSignalArg
import typings.interactjsTypes.dropPluginMod.DropState
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.interactjsInertiaPluginMod.InertiaState
import typings.interactjsTypes.interactjsTypesBooleans.`false`
import typings.interactjsTypes.interactjsTypesStrings.`auto-startColoncheck`
import typings.interactjsTypes.interactjsTypesStrings.`autoStartColonbefore-start`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-end`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-inertiastart`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-move`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-reflow`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-resume`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-start`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-end`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-inertiastart`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-move`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-reflow`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-resume`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-start`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-end`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-inertiastart`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-move`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-reflow`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-resume`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-start`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonremove-pointer`
import typings.interactjsTypes.interactjsTypesStrings.`interactionsColonupdate-pointer`
import typings.interactjsTypes.interactjsTypesStrings.`pointerEventsColoncollect-targets`
import typings.interactjsTypes.interactjsTypesStrings.`scopeColonadd-document`
import typings.interactjsTypes.interactjsTypesStrings.`scopeColonremove-document`
import typings.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonend
import typings.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonmove
import typings.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonstart
import typings.interactjsTypes.interactjsTypesStrings.autoStartColonprepared
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.end
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.iEvent
import typings.interactjsTypes.interactjsTypesStrings.inertiastart
import typings.interactjsTypes.interactjsTypesStrings.interactableColonnew
import typings.interactjsTypes.interactjsTypesStrings.interactableColonset
import typings.interactjsTypes.interactjsTypesStrings.interactableColonunset
import typings.interactjsTypes.interactjsTypesStrings.interaction
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonblur
import typings.interactjsTypes.interactjsTypesStrings.interactionsColoncancel
import typings.interactjsTypes.interactjsTypesStrings.interactionsColondestroy
import typings.interactjsTypes.interactjsTypesStrings.interactionsColondown
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonfind
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonmove
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonnew
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonstop
import typings.interactjsTypes.interactjsTypesStrings.interactionsColonup
import typings.interactjsTypes.interactjsTypesStrings.move
import typings.interactjsTypes.interactjsTypesStrings.pointerEventsColonfired
import typings.interactjsTypes.interactjsTypesStrings.pointerEventsColonnew
import typings.interactjsTypes.interactjsTypesStrings.reflow
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.interactjsTypesStrings.resume
import typings.interactjsTypes.interactjsTypesStrings.start
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.interactjsTypes.scopeMod.DocSignalArg
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.ActionProps
import typings.interactjsTypes.typesMod.CoordsSet
import typings.interactjsTypes.typesMod.EdgeOptions
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.FullRect
import typings.interactjsTypes.typesMod.PointerEventType
import typings.interactjsTypes.typesMod.PointerType
import typings.std.Event
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("@interactjs/core/Interaction", JSImport.Default)
  @js.native
  open class default[T /* <: ActionName | Null */] protected () extends Interaction[T] {
    /** */
    def this(hasPointerTypeScopeFire: ScopeFire) = this()
  }
  
  @JSImport("@interactjs/core/Interaction", "Interaction")
  @js.native
  open class Interaction[T /* <: ActionName | Null */] protected () extends StObject {
    /** */
    def this(hasPointerTypeScopeFire: ScopeFire) = this()
    
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_end(event: PointerEventType, phase: end): InteractEvent[T, end] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_end(event: PointerEventType, phase: end, preEnd: Boolean): InteractEvent[T, end] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_end(event: PointerEventType, phase: end, preEnd: Boolean, `type`: String): InteractEvent[T, end] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_end(event: PointerEventType, phase: end, preEnd: Unit, `type`: String): InteractEvent[T, end] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_inertiastart(event: PointerEventType, phase: inertiastart): InteractEvent[T, inertiastart] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_inertiastart(event: PointerEventType, phase: inertiastart, preEnd: Boolean): InteractEvent[T, inertiastart] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_inertiastart(event: PointerEventType, phase: inertiastart, preEnd: Boolean, `type`: String): InteractEvent[T, inertiastart] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_inertiastart(event: PointerEventType, phase: inertiastart, preEnd: Unit, `type`: String): InteractEvent[T, inertiastart] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_move(event: PointerEventType, phase: move): InteractEvent[T, move] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_move(event: PointerEventType, phase: move, preEnd: Boolean): InteractEvent[T, move] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_move(event: PointerEventType, phase: move, preEnd: Boolean, `type`: String): InteractEvent[T, move] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_move(event: PointerEventType, phase: move, preEnd: Unit, `type`: String): InteractEvent[T, move] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_reflow(event: PointerEventType, phase: reflow): InteractEvent[T, reflow] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_reflow(event: PointerEventType, phase: reflow, preEnd: Boolean): InteractEvent[T, reflow] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_reflow(event: PointerEventType, phase: reflow, preEnd: Boolean, `type`: String): InteractEvent[T, reflow] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_reflow(event: PointerEventType, phase: reflow, preEnd: Unit, `type`: String): InteractEvent[T, reflow] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_resume(event: PointerEventType, phase: resume): InteractEvent[T, resume] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_resume(event: PointerEventType, phase: resume, preEnd: Boolean): InteractEvent[T, resume] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_resume(event: PointerEventType, phase: resume, preEnd: Boolean, `type`: String): InteractEvent[T, resume] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_resume(event: PointerEventType, phase: resume, preEnd: Unit, `type`: String): InteractEvent[T, resume] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_start(event: PointerEventType, phase: start): InteractEvent[T, start] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_start(event: PointerEventType, phase: start, preEnd: Boolean): InteractEvent[T, start] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_start(event: PointerEventType, phase: start, preEnd: Boolean, `type`: String): InteractEvent[T, start] = js.native
    @JSName("_createPreparedEvent")
    def _createPreparedEvent_start(event: PointerEventType, phase: start, preEnd: Unit, `type`: String): InteractEvent[T, start] = js.native
    
    def _doPhase(
      signalArg: (Omit[DoPhaseArg[T, start], iEvent]) & IEvent[T] & (Omit[DoPhaseArg[T, move], iEvent]) & `0`[T] & (Omit[DoPhaseArg[T, end], iEvent]) & `1`[T] & (Omit[DoPhaseArg[T, resume], iEvent]) & `2`[T] & (Omit[DoPhaseArg[T, inertiastart], iEvent]) & `3`[T] & (Omit[DoPhaseArg[T, reflow], iEvent]) & `4`[T]
    ): Boolean = js.native
    
    var _ending: Boolean = js.native
    
    @JSName("_fireEvent")
    def _fireEvent_end(iEvent: InteractEvent[T, end]): Unit = js.native
    @JSName("_fireEvent")
    def _fireEvent_inertiastart(iEvent: InteractEvent[T, inertiastart]): Unit = js.native
    @JSName("_fireEvent")
    def _fireEvent_move(iEvent: InteractEvent[T, move]): Unit = js.native
    @JSName("_fireEvent")
    def _fireEvent_reflow(iEvent: InteractEvent[T, reflow]): Unit = js.native
    @JSName("_fireEvent")
    def _fireEvent_resume(iEvent: InteractEvent[T, resume]): Unit = js.native
    @JSName("_fireEvent")
    def _fireEvent_start(iEvent: InteractEvent[T, start]): Unit = js.native
    
    val _id: Double = js.native
    
    var _interacting: Boolean = js.native
    
    var _latestPointer: Pointer = js.native
    
    def _now(): Double = js.native
    
    var _proxy: InteractionProxy[T] | Null = js.native
    
    var _rects: js.UndefOr[Corrected] = js.native
    
    var _reflowPromise: js.Promise[Unit] = js.native
    
    def _reflowResolve(args: Any*): Unit = js.native
    
    def _scopeFire(
      name: `autoStartColonbefore-start`,
      arg: (Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
          interaction
        ]) & typings.interactjsTypes.anon.Interaction
    ): Unit | `false` = js.native
    def _scopeFire(name: `interactionsColonaction-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
    def _scopeFire(name: `interactionsColonaction-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
    def _scopeFire(name: `interactionsColonafter-action-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
    def _scopeFire(name: `interactionsColonafter-action-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
    def _scopeFire(
      name: interactionsColoncancel,
      arg: (/* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/Interaction.@interactjs/core/scope.SignalArgs['interactions:up'] */ js.Any) & CurEventTarget
    ): Unit | `false` = js.native
    @JSName("_scopeFire")
    var _scopeFire_Original: FnCall = js.native
    @JSName("_scopeFire")
    def _scopeFire_actionsdropend(name: actionsSlashdropColonend, arg: DropSignalArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_actionsdropmove(name: actionsSlashdropColonmove, arg: DropSignalArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_actionsdropstart(name: actionsSlashdropColonstart, arg: DropSignalArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_autoStartprepared(name: autoStartColonprepared, arg: typings.interactjsTypes.anon.Interaction): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_autostartcheck(name: `auto-startColoncheck`, arg: CheckSignalArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactablenew(name: interactableColonnew, arg: Target): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactableset(name: interactableColonset, arg: Options): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactableunset(name: interactableColonunset, arg: InteractableInteractableBackCompatOption): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsactionend(name: `interactionsColonaction-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsactionmove(name: `interactionsColonaction-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsactionreflow(name: `interactionsColonaction-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsactionstart(name: `interactionsColonaction-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsafteractionend(name: `interactionsColonafter-action-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsafteractionmove(name: `interactionsColonafter-action-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsafteractionreflow(name: `interactionsColonafter-action-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsafteractionstart(name: `interactionsColonafter-action-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactionend(name: `interactionsColonbefore-action-end`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactioninertiastart(name: `interactionsColonbefore-action-inertiastart`, arg: OmitDoPhaseArgActionNamei): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactionmove(name: `interactionsColonbefore-action-move`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactionreflow(name: `interactionsColonbefore-action-reflow`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactionresume(name: `interactionsColonbefore-action-resume`, arg: OmitDoPhaseArgActionNamer): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsbeforeactionstart(name: `interactionsColonbefore-action-start`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsblur(name: interactionsColonblur, arg: EventInteraction): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsdestroy(name: interactionsColondestroy, arg: typings.interactjsTypes.anon.Interaction): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsdown(name: interactionsColondown, arg: PointerArgPropstypedown): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsfind(name: interactionsColonfind, arg: SearchDetails): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsmove(name: interactionsColonmove, arg: PointerArgPropstypemovedx): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsnew(name: interactionsColonnew, arg: typings.interactjsTypes.anon.Interaction): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsremovepointer(name: `interactionsColonremove-pointer`, arg: typings.interactjsTypes.anon.PointerArgProps): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsstop(name: interactionsColonstop, arg: typings.interactjsTypes.anon.Interaction): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsup(name: interactionsColonup, arg: PointerArgPropstypeupcurE): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_interactionsupdatepointer(name: `interactionsColonupdate-pointer`, arg: PointerArgPropsdownboolea): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_pointerEventscollecttargets(name: `pointerEventsColoncollect-targets`, arg: Node): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_pointerEventsfired(name: pointerEventsColonfired, arg: EventTarget): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_pointerEventsnew(name: pointerEventsColonnew, arg: PointerEvent): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_scopeadddocument(name: `scopeColonadd-document`, arg: DocSignalArg): Unit | `false` = js.native
    @JSName("_scopeFire")
    def _scopeFire_scoperemovedocument(name: `scopeColonremove-document`, arg: DocSignalArg): Unit | `false` = js.native
    
    var _stopped: Boolean = js.native
    
    def _updateLatestPointer(pointer: PointerType, event: PointerEventType, eventTarget: typings.std.Node): Unit = js.native
    
    var autoScroll: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof autoScroll */ Any
      ] = js.native
    
    var autoStartHoldTimer: js.UndefOr[Any] = js.native
    
    var coords: CoordsSet = js.native
    
    def currentAction(): T = js.native
    
    def destroy(): Unit = js.native
    
    /**
      * @alias Interaction.prototype.move
      */
    def doMove(): Any = js.native
    
    def documentBlur(event: Event): Unit = js.native
    
    var downEvent: PointerEventType | Null = js.native
    
    var downPointer: PointerType = js.native
    
    var dropState: js.UndefOr[DropState] = js.native
    
    var edges: EdgeOptions | Null = js.native
    
    var element: Element | Null = js.native
    
    /**
      * ```js
      * interact(target)
      *   .draggable(true)
      *   .on('move', function (event) {
      *     if (event.pageX > 1000) {
      *       // end the current action
      *       event.interaction.end()
      *       // stop all further listeners from being called
      *       event.stopImmediatePropagation()
      *     }
      *   })
      * ```
      *
      * @param {PointerEvent} [event]
      */
    def end(): Unit = js.native
    def end(event: PointerEventType): Unit = js.native
    
    var gesture: js.UndefOr[Distance] = js.native
    
    def getPointerIndex(pointer: Any): Double = js.native
    
    def getPointerInfo(pointer: Any): typings.interactjsTypes.pointerInfoMod.PointerInfo = js.native
    
    var holdIntervalHandle: js.UndefOr[Any] = js.native
    
    var inertia: js.UndefOr[InertiaState] = js.native
    
    var interactable: InteractableActions | Null = js.native
    
    def interacting(): Boolean = js.native
    
    var modification: js.UndefOr[typings.interactjsTypes.modificationMod.default] = js.native
    
    /**
      * ```js
      * interact(target)
      *   .draggable(true)
      *   .on('dragmove', function (event) {
      *     if (someCondition) {
      *       // change the snap settings
      *       event.interactable.draggable({ snap: { targets: [] }})
      *       // fire another move event with re-calculated snap
      *       event.interaction.move()
      *     }
      *   })
      * ```
      *
      * Force a move of the current action at the same coordinates. Useful if
      * snap/restrict has been changed and you want a movement with the new
      * settings.
      */
    def move(): Unit = js.native
    def move(signalArg: Any): Unit = js.native
    
    var offset: Pending = js.native
    
    var offsetBy: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof offsetBy */ Any
      ] = js.native
    
    def pointerDown(pointer: PointerType, event: PointerEventType, eventTarget: typings.std.Node): Unit = js.native
    
    var pointerIsDown: Boolean = js.native
    
    def pointerMove(pointer: PointerType, event: PointerEventType, eventTarget: typings.std.Node): Unit = js.native
    
    var pointerType: String = js.native
    
    def pointerUp(
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: typings.std.Node,
      curEventTarget: typings.std.EventTarget
    ): Unit = js.native
    
    var pointerWasMoved: Boolean = js.native
    
    var pointers: js.Array[typings.interactjsTypes.pointerInfoMod.PointerInfo] = js.native
    
    var prepared: ActionProps[T] = js.native
    
    var prevEvent: InteractEvent[T, EventPhase] = js.native
    
    var prevTap: js.UndefOr[typings.std.PointerEvent] = js.native
    
    var rect: FullRect | Null = js.native
    
    def removePointer(pointer: PointerType, event: PointerEventType): Unit = js.native
    
    var resizeAxes: x | y | xy = js.native
    
    var resizeStartAspectRatio: Double = js.native
    
    var simulation: Any = js.native
    
    /**
      * ```js
      * interact(target)
      *   .draggable({
      *     // disable the default drag start by down->move
      *     manualStart: true
      *   })
      *   // start dragging after the user holds the pointer down
      *   .on('hold', function (event) {
      *     var interaction = event.interaction
      *
      *     if (!interaction.interacting()) {
      *       interaction.start({ name: 'drag' },
      *                         event.interactable,
      *                         event.currentTarget)
      *     }
      * })
      * ```
      *
      * Start an action with the given Interactable and Element as tartgets. The
      * action must be enabled for the target Interactable and an appropriate
      * number of pointers must be held down - 1 for drag/resize, 2 for gesture.
      *
      * Use it with `interactable.<action>able({ manualStart: false })` to always
      * [start actions manually](https://github.com/taye/interact.js/issues/114)
      *
      * @param {object} action   The action to be performed - drag, resize, etc.
      * @param {Interactable} target  The Interactable to target
      * @param {Element} element The DOM Element to target
      * @return {Boolean} Whether the interaction was successfully started
      */
    @JSName("start")
    def start_drag(action: ActionProps[drag], interactable: InteractableActions, element: Element): Boolean = js.native
    @JSName("start")
    def start_drop(action: ActionProps[drop], interactable: InteractableActions, element: Element): Boolean = js.native
    @JSName("start")
    def start_gesture(action: ActionProps[gesture], interactable: InteractableActions, element: Element): Boolean = js.native
    @JSName("start")
    def start_resize(action: ActionProps[resize], interactable: InteractableActions, element: Element): Boolean = js.native
    
    /** */
    def stop(): Unit = js.native
    
    var tapTime: js.UndefOr[Double] = js.native
    
    def updatePointer(pointer: PointerType, event: PointerEventType, eventTarget: typings.std.Node): Double = js.native
    def updatePointer(pointer: PointerType, event: PointerEventType, eventTarget: typings.std.Node, down: Boolean): Double = js.native
  }
  
  @JSImport("@interactjs/core/Interaction", "PointerInfo")
  @js.native
  open class PointerInfo protected ()
    extends typings.interactjsTypes.pointerInfoMod.PointerInfo {
    def this(
      id: Double,
      pointer: PointerType,
      event: PointerEventType,
      downTime: Double,
      downTarget: typings.std.Node
    ) = this()
  }
  
  @js.native
  sealed trait ProxyMethods extends StObject
  @JSImport("@interactjs/core/Interaction", "_ProxyMethods")
  @js.native
  object ProxyMethods extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProxyMethods & String] = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with ProxyMethods
    /* "" */ val end: typings.interactjsTypes.interactionMod.ProxyMethods.end & String = js.native
    
    @js.native
    sealed trait interacting
      extends StObject
         with ProxyMethods
    /* "" */ val interacting: typings.interactjsTypes.interactionMod.ProxyMethods.interacting & String = js.native
    
    @js.native
    sealed trait move
      extends StObject
         with ProxyMethods
    /* "" */ val move: typings.interactjsTypes.interactionMod.ProxyMethods.move & String = js.native
    
    @js.native
    sealed trait start
      extends StObject
         with ProxyMethods
    /* "" */ val start: typings.interactjsTypes.interactionMod.ProxyMethods.start & String = js.native
    
    @js.native
    sealed trait stop
      extends StObject
         with ProxyMethods
    /* "" */ val stop: typings.interactjsTypes.interactionMod.ProxyMethods.stop & String = js.native
  }
  
  @js.native
  sealed trait ProxyValues extends StObject
  @JSImport("@interactjs/core/Interaction", "_ProxyValues")
  @js.native
  object ProxyValues extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProxyValues & String] = js.native
    
    @js.native
    sealed trait _proxy
      extends StObject
         with ProxyValues
    /* "" */ val _proxy: typings.interactjsTypes.interactionMod.ProxyValues._proxy & String = js.native
    
    @js.native
    sealed trait element
      extends StObject
         with ProxyValues
    /* "" */ val element: typings.interactjsTypes.interactionMod.ProxyValues.element & String = js.native
    
    @js.native
    sealed trait interactable
      extends StObject
         with ProxyValues
    /* "" */ val interactable: typings.interactjsTypes.interactionMod.ProxyValues.interactable & String = js.native
    
    @js.native
    sealed trait pointerIsDown
      extends StObject
         with ProxyValues
    /* "" */ val pointerIsDown: typings.interactjsTypes.interactionMod.ProxyValues.pointerIsDown & String = js.native
    
    @js.native
    sealed trait pointerWasMoved
      extends StObject
         with ProxyValues
    /* "" */ val pointerWasMoved: typings.interactjsTypes.interactionMod.ProxyValues.pointerWasMoved & String = js.native
    
    @js.native
    sealed trait prepared
      extends StObject
         with ProxyValues
    /* "" */ val prepared: typings.interactjsTypes.interactionMod.ProxyValues.prepared & String = js.native
  }
  
  type DoAnyPhaseArg = DoPhaseArg[ActionName, EventPhase]
  
  trait DoPhaseArg[T /* <: ActionName */, P /* <: EventPhase */] extends StObject {
    
    var event: PointerEventType
    
    var iEvent: InteractEvent[T, P]
    
    var interaction: Interaction[T]
    
    var phase: EventPhase
    
    var preEnd: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoPhaseArg {
    
    inline def apply[T /* <: ActionName */, P /* <: EventPhase */](
      event: PointerEventType,
      iEvent: InteractEvent[T, P],
      interaction: Interaction[T],
      phase: EventPhase
    ): DoPhaseArg[T, P] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], iEvent = iEvent.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoPhaseArg[T, P]]
    }
    
    extension [Self <: DoPhaseArg[?, ?], T /* <: ActionName */, P /* <: EventPhase */](x: Self & (DoPhaseArg[T, P])) {
      
      inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIEvent(value: InteractEvent[T, P]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
      
      inline def setInteraction(value: Interaction[T]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
      
      inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type InteractionProxy[T /* <: ActionName | Null */] = Pick[
    Interaction[T], 
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _ProxyValues * / any */ String
  ]
  
  type PointerArgProps[T /* <: js.Object */] = typings.interactjsTypes.anon.Event & T
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait SignalArgs extends StObject {
      
      @JSName("interactions:action-end")
      var `interactionsColonaction-end`: DoAnyPhaseArg
      
      @JSName("interactions:action-move")
      var `interactionsColonaction-move`: DoAnyPhaseArg
      
      @JSName("interactions:action-start")
      var `interactionsColonaction-start`: DoAnyPhaseArg
      
      @JSName("interactions:after-action-end")
      var `interactionsColonafter-action-end`: DoAnyPhaseArg
      
      @JSName("interactions:after-action-move")
      var `interactionsColonafter-action-move`: DoAnyPhaseArg
      
      @JSName("interactions:after-action-start")
      var `interactionsColonafter-action-start`: DoAnyPhaseArg
      
      @JSName("interactions:before-action-end")
      var `interactionsColonbefore-action-end`: OmitDoAnyPhaseArgiEvent
      
      @JSName("interactions:before-action-move")
      var `interactionsColonbefore-action-move`: OmitDoAnyPhaseArgiEvent
      
      @JSName("interactions:before-action-start")
      var `interactionsColonbefore-action-start`: OmitDoAnyPhaseArgiEvent
      
      @JSName("interactions:blur")
      var interactionsColonblur: EventInteraction
      
      @JSName("interactions:cancel")
      var interactionsColoncancel: PointerArgPropstypeupcurE & CurEventTarget
      
      @JSName("interactions:down")
      var interactionsColondown: PointerArgPropstypedown
      
      @JSName("interactions:move")
      var interactionsColonmove: PointerArgPropstypemovedx
      
      @JSName("interactions:new")
      var interactionsColonnew: typings.interactjsTypes.anon.Interaction
      
      @JSName("interactions:remove-pointer")
      var `interactionsColonremove-pointer`: typings.interactjsTypes.anon.PointerArgProps
      
      @JSName("interactions:stop")
      var interactionsColonstop: typings.interactjsTypes.anon.Interaction
      
      @JSName("interactions:up")
      var interactionsColonup: PointerArgPropstypeupcurE
      
      @JSName("interactions:update-pointer")
      var `interactionsColonupdate-pointer`: PointerArgPropsdownboolea
    }
    object SignalArgs {
      
      inline def apply(
        `interactionsColonaction-end`: DoAnyPhaseArg,
        `interactionsColonaction-move`: DoAnyPhaseArg,
        `interactionsColonaction-start`: DoAnyPhaseArg,
        `interactionsColonafter-action-end`: DoAnyPhaseArg,
        `interactionsColonafter-action-move`: DoAnyPhaseArg,
        `interactionsColonafter-action-start`: DoAnyPhaseArg,
        `interactionsColonbefore-action-end`: OmitDoAnyPhaseArgiEvent,
        `interactionsColonbefore-action-move`: OmitDoAnyPhaseArgiEvent,
        `interactionsColonbefore-action-start`: OmitDoAnyPhaseArgiEvent,
        interactionsColonblur: EventInteraction,
        interactionsColoncancel: PointerArgPropstypeupcurE & CurEventTarget,
        interactionsColondown: PointerArgPropstypedown,
        interactionsColonmove: PointerArgPropstypemovedx,
        interactionsColonnew: typings.interactjsTypes.anon.Interaction,
        `interactionsColonremove-pointer`: typings.interactjsTypes.anon.PointerArgProps,
        interactionsColonstop: typings.interactjsTypes.anon.Interaction,
        interactionsColonup: PointerArgPropstypeupcurE,
        `interactionsColonupdate-pointer`: PointerArgPropsdownboolea
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactions:action-end")(`interactionsColonaction-end`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:action-move")(`interactionsColonaction-move`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:action-start")(`interactionsColonaction-start`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-end")(`interactionsColonafter-action-end`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-move")(`interactionsColonafter-action-move`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-start")(`interactionsColonafter-action-start`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-end")(`interactionsColonbefore-action-end`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-move")(`interactionsColonbefore-action-move`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-start")(`interactionsColonbefore-action-start`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:blur")(interactionsColonblur.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:cancel")(interactionsColoncancel.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:down")(interactionsColondown.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:move")(interactionsColonmove.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:new")(interactionsColonnew.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:remove-pointer")(`interactionsColonremove-pointer`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:stop")(interactionsColonstop.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:up")(interactionsColonup.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:update-pointer")(`interactionsColonupdate-pointer`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setInteractionsColonaction-end`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:action-end", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonaction-move`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:action-move", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonaction-start`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:action-start", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-end`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:after-action-end", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-move`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:after-action-move", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-start`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:after-action-start", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-end`(value: OmitDoAnyPhaseArgiEvent): Self = StObject.set(x, "interactions:before-action-end", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-move`(value: OmitDoAnyPhaseArgiEvent): Self = StObject.set(x, "interactions:before-action-move", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-start`(value: OmitDoAnyPhaseArgiEvent): Self = StObject.set(x, "interactions:before-action-start", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColonblur(value: EventInteraction): Self = StObject.set(x, "interactions:blur", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColoncancel(value: PointerArgPropstypeupcurE & CurEventTarget): Self = StObject.set(x, "interactions:cancel", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColondown(value: PointerArgPropstypedown): Self = StObject.set(x, "interactions:down", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColonmove(value: PointerArgPropstypemovedx): Self = StObject.set(x, "interactions:move", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColonnew(value: typings.interactjsTypes.anon.Interaction): Self = StObject.set(x, "interactions:new", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonremove-pointer`(value: typings.interactjsTypes.anon.PointerArgProps): Self = StObject.set(x, "interactions:remove-pointer", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColonstop(value: typings.interactjsTypes.anon.Interaction): Self = StObject.set(x, "interactions:stop", value.asInstanceOf[js.Any])
        
        inline def setInteractionsColonup(value: PointerArgPropstypeupcurE): Self = StObject.set(x, "interactions:up", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonupdate-pointer`(value: PointerArgPropsdownboolea): Self = StObject.set(x, "interactions:update-pointer", value.asInstanceOf[js.Any])
      }
    }
  }
}
