package typings.lokijs.global

import typings.lokijs.anon.AsyncResponses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In in-memory persistence adapter for an in-memory database.
  * This simple 'key/value' adapter is intended for unit testing and diagnostics.
  *
  * @param [options] - memory adapter options
  * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
  * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
  * @constructor LokiMemoryAdapter
  */
@JSGlobal("LokiMemoryAdapter")
@js.native
class LokiMemoryAdapter ()
  extends typings.lokijs.LokiMemoryAdapter {
  def this(options: AsyncResponses) = this()
}

