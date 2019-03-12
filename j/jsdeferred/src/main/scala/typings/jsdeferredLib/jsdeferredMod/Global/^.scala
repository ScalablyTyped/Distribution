package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def call(): Deferred = js.native
  def call(fun: js.Function, args: js.Any*): Deferred = js.native
  def chain(args: js.Any*): Deferred = js.native
  def earlier(dl: js.Any): Deferred = js.native
  def loop(n: Loop, fun: FunctionWithNumber): Deferred = js.native
  def loop(n: scala.Double, fun: FunctionWithNumber): Deferred = js.native
  def next(fun: js.Function): Deferred = js.native
  def parallel(dl: js.Any): Deferred = js.native
  def repeat(n: scala.Double, fun: FunctionWithNumber): Deferred = js.native
  def wait(n: scala.Double): Deferred = js.native
}

