package typings
package matterDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    StringDictionary: /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_]
  }
}

