package typings.ical.icalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamList extends js.Object {
  var params: StringDictionary[String]
  var `val`: String
}

object ParamList {
  @scala.inline
  def apply(params: StringDictionary[String], `val`: String): ParamList = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamList]
  }
}

