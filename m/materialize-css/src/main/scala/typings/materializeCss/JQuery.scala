package typings.materializeCss

import typings.materializeCss.M.AutocompleteData
import typings.materializeCss.M.ChipData
import typings.materializeCss.materializeCssStrings.hours
import typings.materializeCss.materializeCssStrings.minutes
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(method: String): JQuery = js.native
  def autocomplete(method: String, data: AutocompleteData): JQuery = js.native
  def autocomplete(method: String, el: Element): JQuery = js.native
  def autocomplete(options: PartialAutocompleteOptionData): JQuery = js.native
  def carousel(): JQuery = js.native
  def carousel(method: String): JQuery = js.native
  def carousel(method: String, n: Double): JQuery = js.native
  def carousel(options: PartialCarouselOptionsDist): JQuery = js.native
  def characterCounter(): JQuery = js.native
  def characterCounter(method: String): JQuery = js.native
  def chips(): JQuery = js.native
  def chips(method: String): JQuery = js.native
  def chips(method: String, chip: ChipData): JQuery = js.native
  def chips(method: String, n: Double): JQuery = js.native
  def chips(options: PartialChipsOptionsAutocompleteOptions): JQuery = js.native
  def collapsible(): JQuery = js.native
  def collapsible(method: String): JQuery = js.native
  def collapsible(method: String, n: Double): JQuery = js.native
  def collapsible(options: PartialCollapsibleOptionsAccordion): JQuery = js.native
  def datepicker(): JQuery = js.native
  def datepicker(method: String): JQuery = js.native
  def datepicker(method: String, date: Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptionsAutoClose): JQuery = js.native
  def dropdown(): JQuery = js.native
  def dropdown(method: String): JQuery = js.native
  def dropdown(options: PartialDropdownOptionsAlignment): JQuery = js.native
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: String): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  def formSelect(): JQuery = js.native
  def formSelect(method: String): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  def materialbox(): JQuery = js.native
  def materialbox(method: String): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptionsInDuration): JQuery = js.native
  def modal(): JQuery = js.native
  def modal(method: String): JQuery = js.native
  def modal(options: PartialModalOptionsDismissible): JQuery = js.native
  def parallax(): JQuery = js.native
  def parallax(method: String): JQuery = js.native
  def parallax(options: PartialParallaxOptions): JQuery = js.native
  def pushpin(): JQuery = js.native
  def pushpin(method: String): JQuery = js.native
  def pushpin(options: PartialPushpinOptionsBottom): JQuery = js.native
  def range(): JQuery = js.native
  def range(method: String): JQuery = js.native
  def scrollSpy(): JQuery = js.native
  def scrollSpy(method: String): JQuery = js.native
  def scrollSpy(options: PartialScrollSpyOptions): JQuery = js.native
  def sidenav(): JQuery = js.native
  def sidenav(method: String): JQuery = js.native
  def sidenav(options: PartialSidenavOptionsDraggable): JQuery = js.native
  def slider(): JQuery = js.native
  def slider(method: String): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  def tabs(): JQuery = js.native
  def tabs(method: String): JQuery = js.native
  def tabs(method: String, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptionsDuration): JQuery = js.native
  def tapTarget(): JQuery = js.native
  def tapTarget(method: String): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptionsOnClose): JQuery = js.native
  def timepicker(): JQuery = js.native
  def timepicker(method: String): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_hours(method: String, view: hours): JQuery = js.native
  @JSName("timepicker")
  def timepicker_minutes(method: String, view: minutes): JQuery = js.native
  def tooltip(): JQuery = js.native
  def tooltip(method: String): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}

