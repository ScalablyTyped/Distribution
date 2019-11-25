package typings.matterDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /* _ */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(StringDictionary: /* _ */ StringDictionary[js.Any] = null, name: String = null): Anon_ = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

