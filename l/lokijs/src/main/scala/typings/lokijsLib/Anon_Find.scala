package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Find extends js.Object {
  var `type`: lokijsLib.lokijsLibStrings.find | lokijsLib.lokijsLibStrings.where
  var uid: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var `val`: js.Any
}

object Anon_Find {
  @scala.inline
  def apply(
    `type`: lokijsLib.lokijsLibStrings.find | lokijsLib.lokijsLibStrings.where,
    `val`: js.Any,
    uid: java.lang.String | scala.Double = null
  ): Anon_Find = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Find]
  }
}

