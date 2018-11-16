package typings
package koDotPlusLib

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
  var sortDescending_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  @JSName("sortKey")
  var sortKey_Original: knockoutLib.KnockoutObservable[java.lang.String] = js.native
  def setSourceKey(key: java.lang.String): scala.Unit = js.native
  def sortDescending(): scala.Boolean = js.native
  def sortDescending(value: scala.Boolean): scala.Unit = js.native
  def sortKey(): java.lang.String = js.native
  def sortKey(value: java.lang.String): scala.Unit = js.native
}

