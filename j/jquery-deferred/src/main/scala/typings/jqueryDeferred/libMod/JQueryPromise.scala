package typings.jqueryDeferred.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryPromise extends js.Object {
  def always(alwaysCallbacks: js.Any*): JQueryDeferred = js.native
  def done(doneCallbacks: js.Any*): JQueryDeferred = js.native
  def fail(failCallbacks: js.Any*): JQueryDeferred = js.native
  def pipe(): JQueryPromise = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, _], failFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ js.Any, _],
    failFilter: js.Function1[/* x */ js.Any, _],
    progressFilter: js.Function1[/* x */ js.Any, _]
  ): JQueryPromise = js.native
  def promise(): JQueryPromise = js.native
  def state(): String = js.native
  def `then`(doneCallbacks: js.Any): JQueryDeferred = js.native
  def `then`(doneCallbacks: js.Any, failCallbacks: js.Any): JQueryDeferred = js.native
  def `then`(doneCallbacks: js.Any, failCallbacks: js.Any, progressCallbacks: js.Any): JQueryDeferred = js.native
}

