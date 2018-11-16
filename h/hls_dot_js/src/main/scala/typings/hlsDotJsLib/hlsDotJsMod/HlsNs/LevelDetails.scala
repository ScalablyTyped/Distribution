package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * a LevelDetails object contains level details retrieved after level playlist parsing
     */

trait LevelDetails extends js.Object {
  /**
           * average fragment duration
           */
  var averagetargetduration: scala.Double
  /**
           * end sequence number
           */
  var endSN: scala.Double
  /**
           * array of fragments info
           */
  var fragments: js.Array[Fragment]
  /**
           * is this level a live playlist or not?
           */
  var live: scala.Boolean
  /**
           * start sequence number
           */
  var startSN: scala.Double
  /**
           * level fragment target duration
           */
  var targetduration: scala.Double
  /**
           * level total duration
           */
  var totalduration: scala.Double
  /**
           * playlist type
           */
  var `type`: java.lang.String
  /**
           * protocol version
           */
  var version: scala.Double
}

