package typings.jsonschema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnknownAttributes: js.UndefOr[Boolean] = js.undefined
  var base: js.UndefOr[String] = js.undefined
  var propertyName: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[RewriteFunction] = js.undefined
  var skipAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var throwError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnknownAttributes: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    propertyName: String = null,
    rewrite: (/* instance */ js.Any, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => js.Any = null,
    skipAttributes: js.Array[String] = null,
    throwError: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnknownAttributes)) __obj.updateDynamic("allowUnknownAttributes")(allowUnknownAttributes.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    if (rewrite != null) __obj.updateDynamic("rewrite")(js.Any.fromFunction4(rewrite))
    if (skipAttributes != null) __obj.updateDynamic("skipAttributes")(skipAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(throwError)) __obj.updateDynamic("throwError")(throwError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

