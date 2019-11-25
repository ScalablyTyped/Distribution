package typings.jake

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name
  extends /* name */ StringDictionary[js.Any] {
  var quiet: Boolean
}

object Anon_Name {
  @scala.inline
  def apply(quiet: Boolean, StringDictionary: /* name */ StringDictionary[js.Any] = null): Anon_Name = {
    val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Name]
  }
}

