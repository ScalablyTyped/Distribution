package typings.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /**
    * Deserialize bytes values as base64 strings instead of Buffers.
    * Defaults to `false`.
    */
  var binaryAsBase64: js.UndefOr[Boolean] = js.undefined
  /**
    * Load this file with field names in camel case instead of their original case.
    * Defaults to `false`.
    */
  var convertFieldsToCamelCase: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the beta method argument order for client methods, with optional
    * arguments after the callback. This option is only a temporary stopgap
    * measure to smooth an API breakage. It is deprecated, and new code
    * should not use it.
    * Defaults to `false`
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.undefined
  /**
    * Deserialize long values as strings instead of objects.
    * Defaults to `true`.
    */
  var longsAsStrings: js.UndefOr[Boolean] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    binaryAsBase64: js.UndefOr[Boolean] = js.undefined,
    convertFieldsToCamelCase: js.UndefOr[Boolean] = js.undefined,
    deprecatedArgumentOrder: js.UndefOr[Boolean] = js.undefined,
    longsAsStrings: js.UndefOr[Boolean] = js.undefined
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binaryAsBase64)) __obj.updateDynamic("binaryAsBase64")(binaryAsBase64)
    if (!js.isUndefined(convertFieldsToCamelCase)) __obj.updateDynamic("convertFieldsToCamelCase")(convertFieldsToCamelCase)
    if (!js.isUndefined(deprecatedArgumentOrder)) __obj.updateDynamic("deprecatedArgumentOrder")(deprecatedArgumentOrder)
    if (!js.isUndefined(longsAsStrings)) __obj.updateDynamic("longsAsStrings")(longsAsStrings)
    __obj.asInstanceOf[LoadOptions]
  }
}

