package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Deferred")
@js.native
class Deferred () extends js.Object {
  def call(): Deferred = js.native
  def call(`val`: js.Any): Deferred = js.native
  def cancel(): Deferred = js.native
  def error(fun: ErrorCallback): Deferred = js.native
  def fail(err: js.Any): Deferred = js.native
  def loop(n: Loop, fun: FunctionWithNumber): Deferred = js.native
  def loop(n: scala.Double, fun: FunctionWithNumber): Deferred = js.native
  def next(fun: js.Function): Deferred = js.native
  def parallel(dl: js.Any): Deferred = js.native
  def wait(n: scala.Double): Deferred = js.native
}

/* static members */
@JSGlobal("Deferred")
@js.native
object Deferred extends js.Object {
  var methods: js.Array[java.lang.String] = js.native
  def call(): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def call(fun: js.Function, args: js.Any*): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def chain(args: js.Any*): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def connect(funo: js.Any, options: java.lang.String): jsdeferredLib.jsdeferredMod.Global.DeferredizedFunction = js.native
  def connect(funo: js.Function): jsdeferredLib.jsdeferredMod.Global.DeferredizedFunction = js.native
  def connect(funo: js.Function, options: jsdeferredLib.jsdeferredMod.Global.ConnectOption): jsdeferredLib.jsdeferredMod.Global.DeferredizedFunction = js.native
  def define(): js.Any = js.native
  def define(obj: js.Any): js.Any = js.native
  def define(obj: js.Any, list: js.Array[java.lang.String]): js.Any = js.native
  def earlier(dl: js.Any): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def isDeferred(obj: js.Any): scala.Boolean = js.native
  def loop(
    n: jsdeferredLib.jsdeferredMod.Global.Loop,
    fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber
  ): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def loop(n: scala.Double, fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def next(fun: js.Function): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def parallel(dl: js.Any): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def register(name: java.lang.String, fun: jsdeferredLib.jsdeferredMod.Global.DeferredizedFunction): scala.Unit = js.native
  def repeat(n: scala.Double, fun: jsdeferredLib.jsdeferredMod.Global.FunctionWithNumber): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def retry(
    retryCount: scala.Double,
    funcDeferred: jsdeferredLib.jsdeferredMod.Global.DeferredizedFunctionWithNumber
  ): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def retry(
    retryCount: scala.Double,
    funcDeferred: jsdeferredLib.jsdeferredMod.Global.DeferredizedFunctionWithNumber,
    options: jsdeferredLib.jsdeferredMod.Global.RetryOption
  ): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
  def wait(n: scala.Double): jsdeferredLib.jsdeferredMod.Global.Deferred = js.native
}

