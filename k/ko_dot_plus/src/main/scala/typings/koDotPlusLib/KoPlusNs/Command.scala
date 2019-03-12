package typings
package koDotPlusLib.KoPlusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  @JSName("canExecute")
  var canExecute_Original: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  @JSName("completed")
  var completed_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  @JSName("failed")
  var failed_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  @JSName("isRunning")
  var isRunning_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  // execute the command
  def apply(): scala.Unit = js.native
  def always(callback: js.Function): Command = js.native
  def canExecute(): scala.Boolean = js.native
  def canExecute(value: scala.Boolean): scala.Unit = js.native
  def completed(): scala.Boolean = js.native
  def completed(value: scala.Boolean): scala.Unit = js.native
  //
  // functions
  // see https://github.com/stevegreatrex/ko.plus#functions
  //
  def done(callback: js.Function1[/* data */ js.Any, scala.Unit]): Command = js.native
  def fail(
    callback: js.Function3[
      /* response */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* statusText */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): Command = js.native
  def failed(): scala.Boolean = js.native
  def failed(value: scala.Boolean): scala.Unit = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  def isRunning(): scala.Boolean = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  def isRunning(value: scala.Boolean): scala.Unit = js.native
  def `then`(resolve: js.Function, reject: js.Function): Command = js.native
}

