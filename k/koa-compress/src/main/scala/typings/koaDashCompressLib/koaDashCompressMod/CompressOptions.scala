package typings
package koaDashCompressLib.koaDashCompressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompressOptions
  extends nodeLib.zlibMod.ZlibOptions {
  /**
           * An optional function that checks the response content type to decide whether to compress. By default, it uses compressible.
           */
  var filter: js.UndefOr[js.Function1[/* content_type */ java.lang.String, scala.Boolean]] = js.undefined
  /**
           * Minimum response size in bytes to compress. Default 1024 bytes or 1kb.
           */
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

