package typings
package logfmtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(contentType: java.lang.String = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

