package typings
package hlsDotJsLib.hlsDotJsMod

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

object LevelDetails {
  @scala.inline
  def apply(
    averagetargetduration: scala.Double,
    endSN: scala.Double,
    fragments: js.Array[Fragment],
    live: scala.Boolean,
    startSN: scala.Double,
    targetduration: scala.Double,
    totalduration: scala.Double,
    `type`: java.lang.String,
    version: scala.Double
  ): LevelDetails = {
    val __obj = js.Dynamic.literal(averagetargetduration = averagetargetduration, endSN = endSN, fragments = fragments, live = live, startSN = startSN, targetduration = targetduration, totalduration = totalduration, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LevelDetails]
  }
}

