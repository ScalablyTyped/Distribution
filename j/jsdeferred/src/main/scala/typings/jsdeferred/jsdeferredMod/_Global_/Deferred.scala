package typings.jsdeferred.jsdeferredMod._Global_

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
  def loop(n: Double, fun: FunctionWithNumber): Deferred = js.native
  def loop(n: Loop, fun: FunctionWithNumber): Deferred = js.native
  def next(fun: js.Function): Deferred = js.native
  def parallel(dl: js.Any): Deferred = js.native
  def wait(n: Double): Deferred = js.native
}

/* static members */
@JSGlobal("Deferred")
@js.native
object Deferred extends js.Object {
  var methods: js.Array[String] = js.native
  def call(): Deferred = js.native
  def call(fun: js.Function, args: js.Any*): Deferred = js.native
  def chain(args: js.Any*): Deferred = js.native
  def connect(funo: js.Any, options: String): DeferredizedFunction = js.native
  def connect(funo: js.Function): DeferredizedFunction = js.native
  def connect(funo: js.Function, options: ConnectOption): DeferredizedFunction = js.native
  def define(): js.Any = js.native
  def define(obj: js.Any): js.Any = js.native
  def define(obj: js.Any, list: js.Array[String]): js.Any = js.native
  def earlier(dl: js.Any): Deferred = js.native
  def isDeferred(obj: js.Any): Boolean = js.native
  def loop(n: Double, fun: FunctionWithNumber): Deferred = js.native
  def loop(n: Loop, fun: FunctionWithNumber): Deferred = js.native
  def next(fun: js.Function): Deferred = js.native
  def parallel(dl: js.Any): Deferred = js.native
  def register(name: String, fun: DeferredizedFunction): Unit = js.native
  def repeat(n: Double, fun: FunctionWithNumber): Deferred = js.native
  def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber): Deferred = js.native
  def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber, options: RetryOption): Deferred = js.native
  def wait(n: Double): Deferred = js.native
}

