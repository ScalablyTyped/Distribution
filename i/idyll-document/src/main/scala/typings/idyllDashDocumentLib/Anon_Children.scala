package typings
package idyllDashDocumentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: java.lang.String | scala.Null
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: java.lang.String = null, className: java.lang.String = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[Anon_Children]
  }
}

