package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangEdit extends IELangBase {
  @JSName("defaults")
  var defaults_IELangEdit: IELangEditDefaults = js.native
  @JSName("delegates")
  var delegates_IELangEdit: IELangEditDelegates = js.native
  @JSName("events")
  var events_IELangEdit: IELangEditEvents = js.native
  def _insert(): scala.Unit = js.native
  def _modify(): scala.Unit = js.native
  def _onAddClick(key: stdLib.HTMLInputElement, value: stdLib.HTMLInputElement): scala.Unit = js.native
  def _onInsert(): scala.Unit = js.native
  def _onInsertCallback(): scala.Unit = js.native
  def _onModify(): scala.Unit = js.native
  def _onModifyCallback(): scala.Unit = js.native
  def _onRemove(): scala.Unit = js.native
  def _onRemoveCallback(): scala.Unit = js.native
  def _onSelect(): scala.Unit = js.native
  def _onSelectCallback(): scala.Unit = js.native
  def _remove(): scala.Unit = js.native
  def _select(): scala.Unit = js.native
}

