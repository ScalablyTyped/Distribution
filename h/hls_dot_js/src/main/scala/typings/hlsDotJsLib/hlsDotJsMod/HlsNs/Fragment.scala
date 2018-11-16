package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * the Fragment object contains fragment related info
     */

trait Fragment extends js.Object {
  /**
           * continuity count
           */
  var cc: scala.Double
  /**
           * fragment duration
           */
  var duration: scala.Double
  /**
           * fragment level identifier
           */
  var level: scala.Double
  /**
           * stream start date and time
           */
  var programDateTime: stdLib.Date
  /**
           * fragment sequence number
           */
  var sn: scala.Double
  /**
           * fragment start offset
           */
  var start: scala.Double
  /**
           * list of tags associated with the fragment
           */
  var tagList: js.Array[js.Array[java.lang.String]]
  /**
           * fragment title
           */
  var title: java.lang.String
  /**
           * fragment url
           */
  var url: java.lang.String
}

