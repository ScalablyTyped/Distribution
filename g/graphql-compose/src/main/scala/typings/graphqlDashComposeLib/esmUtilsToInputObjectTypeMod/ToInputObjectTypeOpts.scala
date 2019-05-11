package typings
package graphqlDashComposeLib.esmUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToInputObjectTypeOpts extends js.Object {
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ToInputObjectTypeOpts {
  @scala.inline
  def apply(postfix: java.lang.String = null, prefix: java.lang.String = null): ToInputObjectTypeOpts = {
    val __obj = js.Dynamic.literal()
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ToInputObjectTypeOpts]
  }
}

