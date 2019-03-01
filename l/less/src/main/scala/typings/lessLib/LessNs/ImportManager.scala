package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportManager extends js.Object {
  var contents: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ImportManager {
  @scala.inline
  def apply(contents: org.scalablytyped.runtime.StringDictionary[java.lang.String]): ImportManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[ImportManager]
  }
}

