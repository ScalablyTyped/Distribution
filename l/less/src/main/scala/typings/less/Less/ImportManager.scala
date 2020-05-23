package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportManager extends js.Object {
  var contents: StringDictionary[String]
}

object ImportManager {
  @scala.inline
  def apply(contents: StringDictionary[String]): ImportManager = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportManager]
  }
}

