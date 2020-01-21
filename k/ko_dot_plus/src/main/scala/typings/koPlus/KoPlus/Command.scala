package typings.koPlus.KoPlus

import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  @JSName("canExecute")
  var canExecute_Original: KnockoutComputed[Boolean] = js.native
  @JSName("completed")
  var completed_Original: KnockoutObservable[Boolean] = js.native
  @JSName("failed")
  var failed_Original: KnockoutObservable[Boolean] = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  @JSName("isRunning")
  var isRunning_Original: KnockoutObservable[Boolean] = js.native
  // execute the command
  def apply(): Unit = js.native
  def always(callback: js.Function): Command = js.native
  def canExecute(): Boolean = js.native
  def canExecute(value: Boolean): Unit = js.native
  def completed(): Boolean = js.native
  def completed(value: Boolean): Unit = js.native
  //
  // functions
  // see https://github.com/stevegreatrex/ko.plus#functions
  //
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Command = js.native
  def fail(
    callback: js.Function3[
      /* response */ js.Any, 
      /* status */ js.UndefOr[String], 
      /* statusText */ js.UndefOr[String], 
      Unit
    ]
  ): Command = js.native
  def failed(): Boolean = js.native
  def failed(value: Boolean): Unit = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  def isRunning(): Boolean = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  def isRunning(value: Boolean): Unit = js.native
  def `then`(resolve: js.Function, reject: js.Function): Command = js.native
}

