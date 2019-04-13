package typings
package koaDashMorganLib.koaDashMorganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Morgan accepts these properties in the options object.
  */
trait Options extends js.Object {
  /**
    * Buffer duration before writing logs to the stream, defaults to false. When set to true, defaults to 1000 ms.
    */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Write log line on request instead of response. This means that a requests will be logged even if the server
    * crashes, but data from the response cannot be logged (like the response code).
    */
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to determine if logging is skipped, defaults to false. This function will be called as skip(req, res).
    */
  var skip: js.UndefOr[
    js.Function2[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Output stream for writing log lines, defaults to process.stdout.
    */
  var stream: js.UndefOr[StreamOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    skip: (/* req */ nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.httpMod.ServerResponse) => scala.Boolean = null,
    stream: StreamOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2(skip))
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Options]
  }
}

