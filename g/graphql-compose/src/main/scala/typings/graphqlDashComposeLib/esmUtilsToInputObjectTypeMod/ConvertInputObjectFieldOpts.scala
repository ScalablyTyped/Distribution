package typings
package graphqlDashComposeLib.esmUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertInputObjectFieldOpts extends js.Object {
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  var outputTypeName: js.UndefOr[java.lang.String] = js.undefined
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ConvertInputObjectFieldOpts {
  @scala.inline
  def apply(
    fieldName: java.lang.String = null,
    outputTypeName: java.lang.String = null,
    postfix: java.lang.String = null,
    prefix: java.lang.String = null
  ): ConvertInputObjectFieldOpts = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (outputTypeName != null) __obj.updateDynamic("outputTypeName")(outputTypeName)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ConvertInputObjectFieldOpts]
  }
}

