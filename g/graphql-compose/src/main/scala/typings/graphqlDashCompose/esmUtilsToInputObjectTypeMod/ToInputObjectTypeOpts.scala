package typings.graphqlDashCompose.esmUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToInputObjectTypeOpts extends js.Object {
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object ToInputObjectTypeOpts {
  @scala.inline
  def apply(postfix: String = null, prefix: String = null): ToInputObjectTypeOpts = {
    val __obj = js.Dynamic.literal()
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ToInputObjectTypeOpts]
  }
}

