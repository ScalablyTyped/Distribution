package typings.hlsJs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderCallbacks extends js.Object {
  
  def onError(error: LoaderError, context: LoaderContext): Unit = js.native
  
  def onProgress(stats: LoaderStats, context: LoaderContext, data: String): Unit = js.native
  def onProgress(stats: LoaderStats, context: LoaderContext, data: ArrayBuffer): Unit = js.native
  
  def onSuccess(response: LoaderResponse, stats: LoaderStats, context: LoaderContext): Unit = js.native
  
  def onTimeout(stats: LoaderStats, context: LoaderContext): Unit = js.native
}
