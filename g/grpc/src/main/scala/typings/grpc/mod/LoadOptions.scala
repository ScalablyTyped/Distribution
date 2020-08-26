package typings.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /**
    * Deserialize bytes values as base64 strings instead of Buffers.
    * Defaults to `false`.
    */
  var binaryAsBase64: js.UndefOr[Boolean] = js.native
  /**
    * Load this file with field names in camel case instead of their original case.
    * Defaults to `false`.
    */
  var convertFieldsToCamelCase: js.UndefOr[Boolean] = js.native
  /**
    * Use the beta method argument order for client methods, with optional
    * arguments after the callback. This option is only a temporary stopgap
    * measure to smooth an API breakage. It is deprecated, and new code
    * should not use it.
    * Defaults to `false`
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.native
  /**
    * Deserialize long values as strings instead of objects.
    * Defaults to `true`.
    */
  var longsAsStrings: js.UndefOr[Boolean] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinaryAsBase64(value: Boolean): Self = this.set("binaryAsBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryAsBase64: Self = this.set("binaryAsBase64", js.undefined)
    @scala.inline
    def setConvertFieldsToCamelCase(value: Boolean): Self = this.set("convertFieldsToCamelCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertFieldsToCamelCase: Self = this.set("convertFieldsToCamelCase", js.undefined)
    @scala.inline
    def setDeprecatedArgumentOrder(value: Boolean): Self = this.set("deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedArgumentOrder: Self = this.set("deprecatedArgumentOrder", js.undefined)
    @scala.inline
    def setLongsAsStrings(value: Boolean): Self = this.set("longsAsStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongsAsStrings: Self = this.set("longsAsStrings", js.undefined)
  }
  
}

