package typings.jqueryDotElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangDB extends js.Object {
  var cache: js.UndefOr[js.Any] = js.native
  var delegates: js.UndefOr[IELangDBDelegates] = js.native
  var description: js.UndefOr[String] = js.native
  var events: js.UndefOr[IELangDBEvents] = js.native
  var isInitialized: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[IELangDBOptions] = js.native
  def _onInsert(id: String, value: String): Unit = js.native
  def _onInsert(id: String, value: String, callback: js.Function): Unit = js.native
  def _onModify(id: String, value: String): Unit = js.native
  def _onModify(id: String, value: String, callback: js.Function): Unit = js.native
  def _onRemove(id: String): Unit = js.native
  def _onRemove(id: String, callback: js.Function): Unit = js.native
  def _onSelect(id: String): Unit = js.native
  def _onSelect(id: String, callback: js.Function): Unit = js.native
  def getIndexHash(id: String): String = js.native
  def getOptions(): IELangDBOptions = js.native
  def initialize(): Unit = js.native
  def initialize(options: IELangDBOptions): Unit = js.native
  def insert(id: String, value: String): Unit = js.native
  def insert(id: String, value: String, callback: js.Function): Unit = js.native
  def modify(id: String, value: String): Unit = js.native
  def modify(id: String, value: String, callback: js.Function): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  def select(id: String): Unit = js.native
  def select(id: String, callback: js.Function): Unit = js.native
  def setOptions(options: IELangDBOptions): Unit = js.native
  def sort(): Unit = js.native
}

