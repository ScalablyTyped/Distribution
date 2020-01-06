package typings.kendoDashUi.kendo.spreadsheet

import typings.kendoDashUi.kendo.Observable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.spreadsheet.Range")
@js.native
class Range () extends Observable {
  var options: RangeOptions = js.native
  def background(): String = js.native
  def background(value: String): Unit = js.native
  @JSName("background")
  def background_Unit(): Unit = js.native
  def bold(): Boolean = js.native
  def bold(value: Boolean): Unit = js.native
  @JSName("bold")
  def bold_Unit(): Unit = js.native
  def borderBottom(): js.Any = js.native
  def borderBottom(value: js.Any): Unit = js.native
  @JSName("borderBottom")
  def borderBottom_Unit(): Unit = js.native
  def borderLeft(): js.Any = js.native
  def borderLeft(value: js.Any): Unit = js.native
  @JSName("borderLeft")
  def borderLeft_Unit(): Unit = js.native
  def borderRight(): js.Any = js.native
  def borderRight(value: js.Any): Unit = js.native
  @JSName("borderRight")
  def borderRight_Unit(): Unit = js.native
  def borderTop(): js.Any = js.native
  def borderTop(value: js.Any): Unit = js.native
  @JSName("borderTop")
  def borderTop_Unit(): Unit = js.native
  def clear(): Unit = js.native
  def clear(options: js.Any): Unit = js.native
  def clearFilter(indices: js.Any): Unit = js.native
  def clearFilter(indices: Double): Unit = js.native
  def color(): String = js.native
  def color(value: String): Unit = js.native
  @JSName("color")
  def color_Unit(): Unit = js.native
  def comment(): String = js.native
  def comment(value: String): Unit = js.native
  @JSName("comment")
  def comment_Unit(): Unit = js.native
  def editor(): String = js.native
  def editor(value: String): Unit = js.native
  @JSName("editor")
  def editor_Unit(): Unit = js.native
  def enable(): Boolean = js.native
  def enable(value: Boolean): Unit = js.native
  @JSName("enable")
  def enable_Unit(): Unit = js.native
  def fillFrom(srcRange: String): Unit = js.native
  def fillFrom(srcRange: String, direction: Double): Unit = js.native
  def fillFrom(srcRange: Range): Unit = js.native
  def fillFrom(srcRange: Range, direction: Double): Unit = js.native
  def filter(filter: js.Any): Unit = js.native
  def filter(filter: Boolean): Unit = js.native
  def fontFamily(): String = js.native
  def fontFamily(value: String): Unit = js.native
  @JSName("fontFamily")
  def fontFamily_Unit(): Unit = js.native
  def fontSize(): Unit = js.native
  def fontSize(value: Double): Unit = js.native
  @JSName("fontSize")
  def fontSize_Double(): Double = js.native
  def forEachCell(callback: js.Function): Unit = js.native
  def format(): String = js.native
  def format(format: String): Unit = js.native
  @JSName("format")
  def format_Unit(): Unit = js.native
  def formula(): String = js.native
  def formula(formula: String): Unit = js.native
  @JSName("formula")
  def formula_Unit(): Unit = js.native
  def hasFilter(): Boolean = js.native
  def input(): js.Any = js.native
  def input(value: String): Unit = js.native
  def input(value: Double): Unit = js.native
  def input(value: Date): Unit = js.native
  @JSName("input")
  def input_Unit(): Unit = js.native
  def isFilterable(): Boolean = js.native
  def isSortable(): Boolean = js.native
  def italic(): Boolean = js.native
  def italic(value: Boolean): Unit = js.native
  @JSName("italic")
  def italic_Unit(): Unit = js.native
  def link(): String = js.native
  def link(url: String): Unit = js.native
  @JSName("link")
  def link_Unit(): Unit = js.native
  def merge(): Unit = js.native
  def select(): Unit = js.native
  def sort(sort: js.Any): Unit = js.native
  def sort(sort: Double): Unit = js.native
  def textAlign(): String = js.native
  def textAlign(value: String): Unit = js.native
  @JSName("textAlign")
  def textAlign_Unit(): Unit = js.native
  def unmerge(): Unit = js.native
  def validation(): js.Any = js.native
  def validation(value: js.Any): Unit = js.native
  @JSName("validation")
  def validation_Unit(): Unit = js.native
  def value(): js.Any = js.native
  def value(value: String): Unit = js.native
  def value(value: Double): Unit = js.native
  def value(value: Date): Unit = js.native
  @JSName("value")
  def value_Unit(): Unit = js.native
  def values(): js.Any = js.native
  def values(values: js.Any): Unit = js.native
  def verticalAlign(): String = js.native
  def verticalAlign(value: String): Unit = js.native
  @JSName("verticalAlign")
  def verticalAlign_Unit(): Unit = js.native
  def wrap(): Boolean = js.native
  def wrap(value: Boolean): Unit = js.native
  @JSName("wrap")
  def wrap_Unit(): Unit = js.native
}

