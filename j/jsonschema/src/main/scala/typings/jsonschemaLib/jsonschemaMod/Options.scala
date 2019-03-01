package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnknownAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var base: js.UndefOr[java.lang.String] = js.undefined
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  var rewrite: js.UndefOr[RewriteFunction] = js.undefined
  var skipAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var throwError: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnknownAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    base: java.lang.String = null,
    propertyName: java.lang.String = null,
    rewrite: RewriteFunction = null,
    skipAttributes: js.Array[java.lang.String] = null,
    throwError: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnknownAttributes)) __obj.updateDynamic("allowUnknownAttributes")(allowUnknownAttributes)
    if (base != null) __obj.updateDynamic("base")(base)
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    if (rewrite != null) __obj.updateDynamic("rewrite")(rewrite)
    if (skipAttributes != null) __obj.updateDynamic("skipAttributes")(skipAttributes)
    if (!js.isUndefined(throwError)) __obj.updateDynamic("throwError")(throwError)
    __obj.asInstanceOf[Options]
  }
}

