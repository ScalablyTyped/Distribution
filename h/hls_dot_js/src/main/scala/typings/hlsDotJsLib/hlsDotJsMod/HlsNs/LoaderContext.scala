package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoaderContext extends js.Object {
  /**
           * fragment object
           */
  var frag: Fragment
  /**
           * level id
           */
  var level: scala.Double
  /**
           * true if onProgress should report partial chunk of loaded content
           */
  var progressData: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * end byte range offset
           */
  var rangeEnd: js.UndefOr[scala.Double] = js.undefined
  /**
           * start byte range offset
           */
  var rangeStart: js.UndefOr[scala.Double] = js.undefined
  /**
           * loader response type (arraybuffer or default response type for playlist)
           */
  var responseType: java.lang.String
  /**
           * request type
           * - level, manifest
           */
  var `type`: java.lang.String
  /**
           * target URL
           */
  var url: java.lang.String
}

