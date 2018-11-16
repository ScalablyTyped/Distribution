package typings
package logrotateDashStreamLib.logrotateDashStreamMod.logrotateStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Optionally compress rotated files with gzip.
           */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The file log file to write data to.
           */
  var file: java.lang.String
  /**
           * The number of rotated log files to keep (including the primary log file). Additional logs are deleted no rotation.
           */
  var keep: scala.Double
  /**
           * The max file size of a log before rotation occurs. Supports 1024, 1k, 1m, 1g
           */
  var size: java.lang.String
}

