package typings.interactjsTypes.anon

import typings.interactjsTypes.actionsDropPluginMod.DropSignalArg
import typings.interactjsTypes.autoStartBaseMod.CheckSignalArg
import typings.interactjsTypes.coreInteractionMod.DoAnyPhaseArg
import typings.interactjsTypes.coreInteractionMod.DoPhaseArg
import typings.interactjsTypes.coreScopeMod.DocSignalArg
import typings.interactjsTypes.coreTypesMod.ActionName
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
import typings.interactjsTypes.interactjsTypesStrings.pointerEventsColonfired
import typings.interactjsTypes.interactjsTypesStrings.pointerEventsColonnew
import typings.interactjsTypes.interactjsTypesStrings.resume
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(name: `auto-startColoncheck`, arg: CheckSignalArg): Unit | `false` = js.native
  def apply(
    name: `autoStartColonbefore-start`,
    arg: (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
      interaction
    ]) & Interaction
  ): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-end`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-inertiastart`, arg: OmitDoPhaseArgActionNamei): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-move`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-reflow`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-resume`, arg: OmitDoPhaseArgActionNamer): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-start`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonremove-pointer`, arg: PointerArgProps): Unit | `false` = js.native
  def apply(name: `interactionsColonupdate-pointer`, arg: PointerArgPropsdownboolea): Unit | `false` = js.native
  def apply(name: `pointerEventsColoncollect-targets`, arg: Node): Unit | `false` = js.native
  def apply(name: `scopeColonadd-document`, arg: DocSignalArg): Unit | `false` = js.native
  def apply(name: `scopeColonremove-document`, arg: DocSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonend, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonmove, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonstart, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: autoStartColonprepared, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactableColonnew, arg: Target): Unit | `false` = js.native
  def apply(name: interactableColonset, arg: Options): Unit | `false` = js.native
  def apply(name: interactableColonunset, arg: InteractableInteractableBackCompatOption): Unit | `false` = js.native
  def apply(name: interactionsColonblur, arg: EventInteraction): Unit | `false` = js.native
  def apply(
    name: interactionsColoncancel,
    arg: (/* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/Interaction.@interactjs/core/scope.SignalArgs['interactions:up'] */ js.Any) & CurEventTarget
  ): Unit | `false` = js.native
  def apply(name: interactionsColondestroy, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColondown, arg: PointerArgPropstypedown): Unit | `false` = js.native
  def apply(name: interactionsColonfind, arg: SearchDetails): Unit | `false` = js.native
  def apply(name: interactionsColonmove, arg: PointerArgPropstypemovedx): Unit | `false` = js.native
  def apply(name: interactionsColonnew, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColonstop, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColonup, arg: PointerArgPropstypeupcurE): Unit | `false` = js.native
  def apply(name: pointerEventsColonfired, arg: EventTarget): Unit | `false` = js.native
  def apply(name: pointerEventsColonnew, arg: PointerEvent): Unit | `false` = js.native
}
