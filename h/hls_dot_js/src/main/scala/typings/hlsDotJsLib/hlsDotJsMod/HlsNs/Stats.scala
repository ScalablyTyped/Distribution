package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Stats extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var mtime: scala.Double
  var tbuffered: js.UndefOr[scala.Double] = js.undefined
  /**
           * performance.now() of first received byte
           */
  var tfirst: scala.Double
  /**
           * performance.now() on load complete
           */
  var tload: scala.Double
  /**
           * performance.now() just after load() has been called
           */
  var trequest: scala.Double
}

