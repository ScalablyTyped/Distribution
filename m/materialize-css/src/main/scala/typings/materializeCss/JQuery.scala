package typings.materializeCss

import typings.materializeCss.M.AutocompleteData
import typings.materializeCss.M.ChipData
import typings.materializeCss.anon.PartialAutocompleteOption
import typings.materializeCss.anon.PartialCarouselOptions
import typings.materializeCss.anon.PartialChipsOptions
import typings.materializeCss.anon.PartialCollapsibleOptions
import typings.materializeCss.anon.PartialDatepickerOptions
import typings.materializeCss.anon.PartialDropdownOptions
import typings.materializeCss.anon.PartialFloatingActionButt
import typings.materializeCss.anon.PartialFormSelectOptions
import typings.materializeCss.anon.PartialMaterialboxOptions
import typings.materializeCss.anon.PartialModalOptions
import typings.materializeCss.anon.PartialParallaxOptions
import typings.materializeCss.anon.PartialPushpinOptions
import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.materializeCss.anon.PartialSidenavOptions
import typings.materializeCss.anon.PartialSliderOptions
import typings.materializeCss.anon.PartialTabsOptions
import typings.materializeCss.anon.PartialTapTargetOptions
import typings.materializeCss.anon.PartialTimepickerOptions
import typings.materializeCss.anon.PartialTooltipOptions
import typings.materializeCss.materializeCssStrings.addChip
import typings.materializeCss.materializeCssStrings.close
import typings.materializeCss.materializeCssStrings.deleteChip
import typings.materializeCss.materializeCssStrings.destroy
import typings.materializeCss.materializeCssStrings.getSelectedValues
import typings.materializeCss.materializeCssStrings.gotoDate
import typings.materializeCss.materializeCssStrings.hours
import typings.materializeCss.materializeCssStrings.minutes
import typings.materializeCss.materializeCssStrings.next
import typings.materializeCss.materializeCssStrings.open
import typings.materializeCss.materializeCssStrings.pause
import typings.materializeCss.materializeCssStrings.prev
import typings.materializeCss.materializeCssStrings.recalculateDimensions
import typings.materializeCss.materializeCssStrings.select
import typings.materializeCss.materializeCssStrings.selectChip
import typings.materializeCss.materializeCssStrings.selectOption
import typings.materializeCss.materializeCssStrings.set
import typings.materializeCss.materializeCssStrings.setDate
import typings.materializeCss.materializeCssStrings.showView
import typings.materializeCss.materializeCssStrings.start
import typings.materializeCss.materializeCssStrings.updateData
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(method: /* keyof materialize-css.anon.PickAutocompleteopenclose */ open | close | destroy): JQuery = js.native
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
  def datepicker(method: /* keyof materialize-css.anon.PickDatepickeropenclosede */ open | close | destroy): JQuery = js.native
  def datepicker(method: gotoDate, date: js.Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: js.Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptions): JQuery = js.native
  
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof materialize-css.anon.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptions): JQuery = js.native
  
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: /* keyof materialize-css.anon.PickFloatingActionButtono */ open | close | destroy): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  
  def formSelect(): JQuery = js.native
  def formSelect(method: /* keyof materialize-css.anon.PickFormSelectgetSelected */ getSelectedValues | destroy): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  
  def materialbox(): JQuery = js.native
  def materialbox(method: /* keyof materialize-css.anon.PickMaterialboxdestroyope */ destroy | open | close): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptions): JQuery = js.native
  
  def modal(): JQuery = js.native
  def modal(method: /* keyof materialize-css.anon.PickModalopenclosedestroy */ open | close | destroy): JQuery = js.native
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
  def sidenav(method: /* keyof materialize-css.anon.PickSidenavopenclosedestr */ open | close | destroy): JQuery = js.native
  def sidenav(options: PartialSidenavOptions): JQuery = js.native
  
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof materialize-css.anon.PickSliderpausestartnextp */ next | pause | start | destroy | prev
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptions): JQuery = js.native
  
  def tapTarget(): JQuery = js.native
  def tapTarget(method: /* keyof materialize-css.anon.PickTapTargetopenclosedes */ open | close | destroy): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptions): JQuery = js.native
  
  def timepicker(): JQuery = js.native
  def timepicker(method: /* keyof materialize-css.anon.PickTimepickeropenclosede */ open | close | destroy): JQuery = js.native
  def timepicker(method: showView, view: hours | minutes): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(method: /* keyof materialize-css.anon.PickTooltipopenclosedestr */ open | close | destroy): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}
