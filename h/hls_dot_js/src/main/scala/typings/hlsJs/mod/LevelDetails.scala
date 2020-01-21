package typings.hlsJs.mod

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
  var averagetargetduration: Double
  /**
    * end sequence number
    */
  var endSN: Double
  /**
    * array of fragments info
    */
  var fragments: js.Array[Fragment]
  /**
    * is this level a live playlist or not?
    */
  var live: Boolean
  /**
    * start sequence number
    */
  var startSN: Double
  /**
    * level fragment target duration
    */
  var targetduration: Double
  /**
    * level total duration
    */
  var totalduration: Double
  /**
    * playlist type
    */
  var `type`: String
  /**
    * protocol version
    */
  var version: Double
}

object LevelDetails {
  @scala.inline
  def apply(
    averagetargetduration: Double,
    endSN: Double,
    fragments: js.Array[Fragment],
    live: Boolean,
    startSN: Double,
    targetduration: Double,
    totalduration: Double,
    `type`: String,
    version: Double
  ): LevelDetails = {
    val __obj = js.Dynamic.literal(averagetargetduration = averagetargetduration.asInstanceOf[js.Any], endSN = endSN.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], startSN = startSN.asInstanceOf[js.Any], targetduration = targetduration.asInstanceOf[js.Any], totalduration = totalduration.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDetails]
  }
}

