package typings.hexoUtil.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segments extends js.Object {
  var segments: js.UndefOr[StringDictionary[String | RegExp]] = js.undefined
}

object Segments {
  @scala.inline
  def apply(segments: StringDictionary[String | RegExp] = null): Segments = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segments]
  }
}

