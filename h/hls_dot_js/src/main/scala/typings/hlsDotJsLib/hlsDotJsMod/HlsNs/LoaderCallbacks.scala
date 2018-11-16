package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderCallbacks extends js.Object {
  def onError(error: LoaderError, context: LoaderContext): scala.Unit = js.native
  def onProgress(stats: LoaderStats, context: LoaderContext, data: java.lang.String): scala.Unit = js.native
  def onProgress(stats: LoaderStats, context: LoaderContext, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def onSuccess(response: LoaderResponse, stats: LoaderStats, context: LoaderContext): scala.Unit = js.native
  def onTimeout(stats: LoaderStats, context: LoaderContext): scala.Unit = js.native
}

