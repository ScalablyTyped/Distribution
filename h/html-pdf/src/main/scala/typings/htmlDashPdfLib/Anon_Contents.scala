package typings
package htmlDashPdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Contents {
  @scala.inline
  def apply(contents: java.lang.String = null, height: java.lang.String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[Anon_Contents]
  }
}

