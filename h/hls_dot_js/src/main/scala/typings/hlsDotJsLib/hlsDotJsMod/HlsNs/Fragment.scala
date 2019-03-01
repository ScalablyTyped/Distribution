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

object Fragment {
  @scala.inline
  def apply(
    cc: scala.Double,
    duration: scala.Double,
    level: scala.Double,
    programDateTime: stdLib.Date,
    sn: scala.Double,
    start: scala.Double,
    tagList: js.Array[js.Array[java.lang.String]],
    title: java.lang.String,
    url: java.lang.String
  ): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cc")(cc)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("programDateTime")(programDateTime)
    __obj.updateDynamic("sn")(sn)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("tagList")(tagList)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Fragment]
  }
}

