package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangDB extends js.Object {
  var cache: js.UndefOr[js.Any] = js.native
  var delegates: js.UndefOr[IELangDBDelegates] = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var events: js.UndefOr[IELangDBEvents] = js.native
  var isInitialized: js.UndefOr[scala.Boolean] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var options: js.UndefOr[IELangDBOptions] = js.native
  def _onInsert(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def _onInsert(id: java.lang.String, value: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _onModify(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def _onModify(id: java.lang.String, value: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _onRemove(id: java.lang.String): scala.Unit = js.native
  def _onRemove(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _onSelect(id: java.lang.String): scala.Unit = js.native
  def _onSelect(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def getIndexHash(id: java.lang.String): java.lang.String = js.native
  def getOptions(): IELangDBOptions = js.native
  def initialize(): scala.Unit = js.native
  def initialize(options: IELangDBOptions): scala.Unit = js.native
  def insert(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def insert(id: java.lang.String, value: java.lang.String, callback: js.Function): scala.Unit = js.native
  def modify(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def modify(id: java.lang.String, value: java.lang.String, callback: js.Function): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def select(id: java.lang.String): scala.Unit = js.native
  def select(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def setOptions(options: IELangDBOptions): scala.Unit = js.native
  def sort(): scala.Unit = js.native
}

