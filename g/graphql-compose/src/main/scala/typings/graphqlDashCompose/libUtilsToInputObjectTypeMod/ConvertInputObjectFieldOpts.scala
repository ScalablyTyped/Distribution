package typings.graphqlDashCompose.libUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertInputObjectFieldOpts extends js.Object {
  var fieldName: js.UndefOr[String] = js.undefined
  var outputTypeName: js.UndefOr[String] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object ConvertInputObjectFieldOpts {
  @scala.inline
  def apply(
    fieldName: String = null,
    outputTypeName: String = null,
    postfix: String = null,
    prefix: String = null
  ): ConvertInputObjectFieldOpts = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (outputTypeName != null) __obj.updateDynamic("outputTypeName")(outputTypeName)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ConvertInputObjectFieldOpts]
  }
}

