package typings.hexoDashUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var segments: js.UndefOr[StringDictionary[String | RegExp]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(segments: StringDictionary[String | RegExp] = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments)
    __obj.asInstanceOf[Anon_Name]
  }
}

