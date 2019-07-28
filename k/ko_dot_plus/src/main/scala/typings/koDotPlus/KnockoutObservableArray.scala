package typings.koDotPlus

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Sortable type extensions
//
// extends the KnockoutObservableArray to add sorting methods
// see https://github.com/stevegreatrex/ko.plus#properties-and-functions
//
@js.native
trait KnockoutObservableArray[T] extends js.Object {
  @JSName("sortDescending")
  var sortDescending_Original: KnockoutObservable[Boolean] = js.native
  @JSName("sortKey")
  var sortKey_Original: KnockoutObservable[String] = js.native
  def setSourceKey(key: String): Unit = js.native
  def sortDescending(): Boolean = js.native
  def sortDescending(value: Boolean): Unit = js.native
  def sortKey(): String = js.native
  def sortKey(value: String): Unit = js.native
}

