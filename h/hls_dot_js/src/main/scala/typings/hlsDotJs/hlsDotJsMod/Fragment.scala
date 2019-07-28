package typings.hlsDotJs.hlsDotJsMod

import typings.std.Date
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
  var cc: Double
  /**
    * fragment duration
    */
  var duration: Double
  /**
    * fragment level identifier
    */
  var level: Double
  /**
    * stream start date and time
    */
  var programDateTime: Date
  /**
    * fragment sequence number
    */
  var sn: Double
  /**
    * fragment start offset
    */
  var start: Double
  /**
    * list of tags associated with the fragment
    */
  var tagList: js.Array[js.Array[String]]
  /**
    * fragment title
    */
  var title: String
  /**
    * fragment url
    */
  var url: String
}

object Fragment {
  @scala.inline
  def apply(
    cc: Double,
    duration: Double,
    level: Double,
    programDateTime: Date,
    sn: Double,
    start: Double,
    tagList: js.Array[js.Array[String]],
    title: String,
    url: String
  ): Fragment = {
    val __obj = js.Dynamic.literal(cc = cc, duration = duration, level = level, programDateTime = programDateTime, sn = sn, start = start, tagList = tagList, title = title, url = url)
  
    __obj.asInstanceOf[Fragment]
  }
}

