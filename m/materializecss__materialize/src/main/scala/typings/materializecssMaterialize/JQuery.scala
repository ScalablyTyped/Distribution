package typings.materializecssMaterialize

import typings.materializecssMaterialize.M.AutocompleteData
import typings.materializecssMaterialize.M.ChipData
import typings.materializecssMaterialize.anon.PartialAutocompleteOption
import typings.materializecssMaterialize.anon.PartialCarouselOptions
import typings.materializecssMaterialize.anon.PartialChipsOptions
import typings.materializecssMaterialize.anon.PartialCollapsibleOptions
import typings.materializecssMaterialize.anon.PartialDatepickerOptions
import typings.materializecssMaterialize.anon.PartialDropdownOptions
import typings.materializecssMaterialize.anon.PartialFloatingActionButt
import typings.materializecssMaterialize.anon.PartialFormSelectOptions
import typings.materializecssMaterialize.anon.PartialMaterialboxOptions
import typings.materializecssMaterialize.anon.PartialModalOptions
import typings.materializecssMaterialize.anon.PartialParallaxOptions
import typings.materializecssMaterialize.anon.PartialPushpinOptions
import typings.materializecssMaterialize.anon.PartialScrollSpyOptions
import typings.materializecssMaterialize.anon.PartialSidenavOptions
import typings.materializecssMaterialize.anon.PartialSliderOptions
import typings.materializecssMaterialize.anon.PartialTabsOptions
import typings.materializecssMaterialize.anon.PartialTapTargetOptions
import typings.materializecssMaterialize.anon.PartialTimepickerOptions
import typings.materializecssMaterialize.anon.PartialTooltipOptions
import typings.materializecssMaterialize.materializecssMaterializeStrings.addChip
import typings.materializecssMaterialize.materializecssMaterializeStrings.close
import typings.materializecssMaterialize.materializecssMaterializeStrings.deleteChip
import typings.materializecssMaterialize.materializecssMaterializeStrings.destroy
import typings.materializecssMaterialize.materializecssMaterializeStrings.getSelectedValues
import typings.materializecssMaterialize.materializecssMaterializeStrings.gotoDate
import typings.materializecssMaterialize.materializecssMaterializeStrings.hours
import typings.materializecssMaterialize.materializecssMaterializeStrings.minutes
import typings.materializecssMaterialize.materializecssMaterializeStrings.next
import typings.materializecssMaterialize.materializecssMaterializeStrings.open
import typings.materializecssMaterialize.materializecssMaterializeStrings.pause
import typings.materializecssMaterialize.materializecssMaterializeStrings.prev
import typings.materializecssMaterialize.materializecssMaterializeStrings.recalculateDimensions
import typings.materializecssMaterialize.materializecssMaterializeStrings.select
import typings.materializecssMaterialize.materializecssMaterializeStrings.selectChip
import typings.materializecssMaterialize.materializecssMaterializeStrings.selectOption
import typings.materializecssMaterialize.materializecssMaterializeStrings.set
import typings.materializecssMaterialize.materializecssMaterializeStrings.setDate
import typings.materializecssMaterialize.materializecssMaterializeStrings.showView
import typings.materializecssMaterialize.materializecssMaterializeStrings.start
import typings.materializecssMaterialize.materializecssMaterializeStrings.updateData
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(
    method: /* keyof @materializecss/materialize.anon.PickAutocompleteopenclose */ open | close | destroy
  ): JQuery = js.native
  def autocomplete(method: selectOption, el: Element): JQuery = js.native
  def autocomplete(method: updateData, data: AutocompleteData): JQuery = js.native
  def autocomplete(options: PartialAutocompleteOption): JQuery = js.native
  
  def carousel(): JQuery = js.native
  def carousel(method: destroy): JQuery = js.native
  def carousel(method: next): JQuery = js.native
  def carousel(method: next, n: Double): JQuery = js.native
  def carousel(method: prev): JQuery = js.native
  def carousel(method: prev, n: Double): JQuery = js.native
  def carousel(method: set): JQuery = js.native
  def carousel(method: set, n: Double): JQuery = js.native
  def carousel(options: PartialCarouselOptions): JQuery = js.native
  
  def characterCounter(): JQuery = js.native
  def characterCounter(method: destroy): JQuery = js.native
  
  def chips(): JQuery = js.native
  def chips(method: addChip, chip: ChipData): JQuery = js.native
  def chips(method: deleteChip): JQuery = js.native
  def chips(method: deleteChip, n: Double): JQuery = js.native
  def chips(method: destroy): JQuery = js.native
  def chips(method: selectChip, n: Double): JQuery = js.native
  def chips(options: PartialChipsOptions): JQuery = js.native
  
  def collapsible(): JQuery = js.native
  def collapsible(method: close, n: Double): JQuery = js.native
  def collapsible(method: destroy): JQuery = js.native
  def collapsible(method: open, n: Double): JQuery = js.native
  def collapsible(options: PartialCollapsibleOptions): JQuery = js.native
  
  def datepicker(): JQuery = js.native
  def datepicker(
    method: /* keyof @materializecss/materialize.anon.PickDatepickeropenclosede */ open | close | destroy
  ): JQuery = js.native
  def datepicker(method: gotoDate, date: js.Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: js.Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptions): JQuery = js.native
  
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof @materializecss/materialize.anon.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptions): JQuery = js.native
  
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(
    method: /* keyof @materializecss/materialize.anon.PickFloatingActionButtono */ open | close | destroy
  ): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  
  def formSelect(): JQuery = js.native
  def formSelect(
    method: /* keyof @materializecss/materialize.anon.PickFormSelectgetSelected */ getSelectedValues | destroy
  ): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  
  def materialbox(): JQuery = js.native
  def materialbox(
    method: /* keyof @materializecss/materialize.anon.PickMaterialboxdestroyope */ destroy | open | close
  ): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptions): JQuery = js.native
  
  def modal(): JQuery = js.native
  def modal(
    method: /* keyof @materializecss/materialize.anon.PickModalopenclosedestroy */ open | close | destroy
  ): JQuery = js.native
  def modal(options: PartialModalOptions): JQuery = js.native
  
  def parallax(): JQuery = js.native
  def parallax(method: destroy): JQuery = js.native
  def parallax(options: PartialParallaxOptions): JQuery = js.native
  
  def pushpin(): JQuery = js.native
  def pushpin(method: destroy): JQuery = js.native
  def pushpin(options: PartialPushpinOptions): JQuery = js.native
  
  def range(): JQuery = js.native
  def range(method: destroy): JQuery = js.native
  
  def scrollSpy(): JQuery = js.native
  def scrollSpy(method: destroy): JQuery = js.native
  def scrollSpy(options: PartialScrollSpyOptions): JQuery = js.native
  
  def sidenav(): JQuery = js.native
  def sidenav(
    method: /* keyof @materializecss/materialize.anon.PickSidenavopenclosedestr */ open | close | destroy
  ): JQuery = js.native
  def sidenav(options: PartialSidenavOptions): JQuery = js.native
  
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof @materializecss/materialize.anon.PickSliderpausestartnextp */ next | pause | start | destroy | prev
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptions): JQuery = js.native
  
  def tapTarget(): JQuery = js.native
  def tapTarget(
    method: /* keyof @materializecss/materialize.anon.PickTapTargetopenclosedes */ open | close | destroy
  ): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptions): JQuery = js.native
  
  def timepicker(): JQuery = js.native
  def timepicker(
    method: /* keyof @materializecss/materialize.anon.PickTimepickeropenclosede */ open | close | destroy
  ): JQuery = js.native
  def timepicker(method: showView, view: hours | minutes): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(
    method: /* keyof @materializecss/materialize.anon.PickTooltipopenclosedestr */ open | close | destroy
  ): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}
