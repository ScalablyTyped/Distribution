package typings
package gulpDashPlumberLib.gulpDashPlumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** 
       * Handle errors in underlying streams and output them to console. Default true.
       * If function passed, it will be attached to stream on('error')
       * If false passed, error handler will not be attached
       * If undefined passed, default error handler will be attached
       */
  var errorHandler: js.UndefOr[ErrorHandlerFunction | scala.Boolean] = js.undefined
  /** Monkeypatch pipe functions in underlying streams in pipeline. Default true. */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
}

