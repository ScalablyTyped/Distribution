package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def call(): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def call(fun: js.Function, args: js.Any*): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def chain(args: js.Any*): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def earlier(dl: js.Any): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def loop(
    n: jsdeferredLib.jsdeferredMod.Global.Loop,
    fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber
  ): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def loop(n: scala.Double, fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def next(fun: js.Function): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def parallel(dl: js.Any): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def repeat(n: scala.Double, fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def wait(n: scala.Double): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
}

