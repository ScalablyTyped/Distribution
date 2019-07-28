package typings.materializeDashCss

import typings.materializeDashCss.MNs.AutocompleteData
import typings.materializeDashCss.MNs.AutocompleteOptions
import typings.materializeDashCss.MNs.CarouselOptions
import typings.materializeDashCss.MNs.ChipData
import typings.materializeDashCss.MNs.ChipsOptions
import typings.materializeDashCss.MNs.CollapsibleOptions
import typings.materializeDashCss.MNs.DatepickerOptions
import typings.materializeDashCss.MNs.DropdownOptions
import typings.materializeDashCss.MNs.FloatingActionButtonOptions
import typings.materializeDashCss.MNs.FormSelectOptions
import typings.materializeDashCss.MNs.MaterialboxOptions
import typings.materializeDashCss.MNs.ModalOptions
import typings.materializeDashCss.MNs.ParallaxOptions
import typings.materializeDashCss.MNs.PushpinOptions
import typings.materializeDashCss.MNs.ScrollSpyOptions
import typings.materializeDashCss.MNs.SidenavOptions
import typings.materializeDashCss.MNs.SliderOptions
import typings.materializeDashCss.MNs.TabsOptions
import typings.materializeDashCss.MNs.TapTargetOptions
import typings.materializeDashCss.MNs.TimepickerOptions
import typings.materializeDashCss.MNs.TooltipOptions
import typings.materializeDashCss.materializeDashCssStrings.hours
import typings.materializeDashCss.materializeDashCssStrings.minutes
import typings.std.Date
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def autocomplete(): JQuery = js.native
  def autocomplete(options: Partial[AutocompleteOptions]): JQuery = js.native
  // Pick<T,K> to check methods exist.
  @JSName("autocomplete")
  def autocomplete_destroy(method: String): JQuery = js.native
  @JSName("autocomplete")
  def autocomplete_selectOption(method: String, el: Element): JQuery = js.native
  @JSName("autocomplete")
  def autocomplete_updateData(method: String, data: AutocompleteData): JQuery = js.native
  def carousel(): JQuery = js.native
  def carousel(options: Partial[CarouselOptions]): JQuery = js.native
  @JSName("carousel")
  def carousel_destroy(method: String): JQuery = js.native
  @JSName("carousel")
  def carousel_next(method: String): JQuery = js.native
  @JSName("carousel")
  def carousel_next(method: String, n: Double): JQuery = js.native
  @JSName("carousel")
  def carousel_prev(method: String): JQuery = js.native
  @JSName("carousel")
  def carousel_prev(method: String, n: Double): JQuery = js.native
  @JSName("carousel")
  def carousel_set(method: String): JQuery = js.native
  @JSName("carousel")
  def carousel_set(method: String, n: Double): JQuery = js.native
  def characterCounter(): JQuery = js.native
  @JSName("characterCounter")
  def characterCounter_destroy(method: String): JQuery = js.native
  def chips(): JQuery = js.native
  def chips(options: Partial[ChipsOptions]): JQuery = js.native
  @JSName("chips")
  def chips_addChip(method: String, chip: ChipData): JQuery = js.native
  @JSName("chips")
  def chips_deleteChip(method: String): JQuery = js.native
  @JSName("chips")
  def chips_deleteChip(method: String, n: Double): JQuery = js.native
  @JSName("chips")
  def chips_destroy(method: String): JQuery = js.native
  @JSName("chips")
  def chips_selectChip(method: String, n: Double): JQuery = js.native
  def collapsible(): JQuery = js.native
  def collapsible(options: Partial[CollapsibleOptions]): JQuery = js.native
  @JSName("collapsible")
  def collapsible_close(method: String, n: Double): JQuery = js.native
  @JSName("collapsible")
  def collapsible_destroy(method: String): JQuery = js.native
  @JSName("collapsible")
  def collapsible_open(method: String, n: Double): JQuery = js.native
  def datepicker(): JQuery = js.native
  def datepicker(method: String): JQuery = js.native
  def datepicker(options: Partial[DatepickerOptions]): JQuery = js.native
  @JSName("datepicker")
  def datepicker_gotoDate(method: String, date: Date): JQuery = js.native
  @JSName("datepicker")
  def datepicker_setDate(method: String): JQuery = js.native
  @JSName("datepicker")
  def datepicker_setDate(method: String, date: Date): JQuery = js.native
  def dropdown(): JQuery = js.native
  def dropdown(method: String): JQuery = js.native
  def dropdown(options: Partial[DropdownOptions]): JQuery = js.native
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: String): JQuery = js.native
  def floatingActionButton(options: Partial[FloatingActionButtonOptions]): JQuery = js.native
  def formSelect(): JQuery = js.native
  def formSelect(method: String): JQuery = js.native
  def formSelect(options: Partial[FormSelectOptions]): JQuery = js.native
  def materialbox(): JQuery = js.native
  def materialbox(method: String): JQuery = js.native
  def materialbox(options: Partial[MaterialboxOptions]): JQuery = js.native
  def modal(): JQuery = js.native
  def modal(method: String): JQuery = js.native
  def modal(options: Partial[ModalOptions]): JQuery = js.native
  def parallax(): JQuery = js.native
  def parallax(options: Partial[ParallaxOptions]): JQuery = js.native
  @JSName("parallax")
  def parallax_destroy(method: String): JQuery = js.native
  def pushpin(): JQuery = js.native
  def pushpin(options: Partial[PushpinOptions]): JQuery = js.native
  @JSName("pushpin")
  def pushpin_destroy(method: String): JQuery = js.native
  def range(): JQuery = js.native
  @JSName("range")
  def range_destroy(method: String): JQuery = js.native
  def scrollSpy(): JQuery = js.native
  def scrollSpy(options: Partial[ScrollSpyOptions]): JQuery = js.native
  @JSName("scrollSpy")
  def scrollSpy_destroy(method: String): JQuery = js.native
  def sidenav(): JQuery = js.native
  def sidenav(method: String): JQuery = js.native
  def sidenav(options: Partial[SidenavOptions]): JQuery = js.native
  def slider(): JQuery = js.native
  def slider(method: String): JQuery = js.native
  def slider(options: Partial[SliderOptions]): JQuery = js.native
  def tabs(): JQuery = js.native
  def tabs(options: Partial[TabsOptions]): JQuery = js.native
  @JSName("tabs")
  def tabs_destroy(method: String): JQuery = js.native
  @JSName("tabs")
  def tabs_select(method: String, tabId: String): JQuery = js.native
  def tapTarget(): JQuery = js.native
  def tapTarget(method: String): JQuery = js.native
  def tapTarget(options: Partial[TapTargetOptions]): JQuery = js.native
  def timepicker(): JQuery = js.native
  def timepicker(method: String): JQuery = js.native
  def timepicker(method: String, view: hours): JQuery = js.native
  def timepicker(method: String, view: minutes): JQuery = js.native
  def timepicker(options: Partial[TimepickerOptions]): JQuery = js.native
  def tooltip(): JQuery = js.native
  def tooltip(method: String): JQuery = js.native
  def tooltip(options: Partial[TooltipOptions]): JQuery = js.native
}

