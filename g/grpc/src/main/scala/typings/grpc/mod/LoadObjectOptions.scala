package typings.grpc.mod

import typings.grpc.grpcNumbers.`5`
import typings.grpc.grpcNumbers.`6`
import typings.grpc.grpcStrings.detect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadObjectOptions extends js.Object {
  /**
    * Deserialize bytes values as base64 strings instead of Buffers.
    * Defaults to `false`.
    */
  var binaryAsBase64: js.UndefOr[Boolean] = js.native
  /**
    * use the beta method argument order for client methods, with optional
    * arguments after the callback. This option is only a temporary stopgap
    * measure to smooth an API breakage. It is deprecated, and new code
    * should not use it.
    * Defaults to `false`
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.native
  /**
    * Deserialize enum values as strings instead of numbers. Only works with
    * Protobuf.js 6 values.
    * Defaults to `true`.
    */
  var enumsAsStrings: js.UndefOr[Boolean] = js.native
  /**
    * Deserialize long values as strings instead of objects.
    * Defaults to `true`.
    */
  var longsAsStrings: js.UndefOr[Boolean] = js.native
  /**
    * 5 and 6 respectively indicate that an object from the corresponding
    * version of Protobuf.js is provided in the value argument. If the option
    * is 'detect', gRPC wll guess what the version is based on the structure
    * of the value.
    */
  var protobufjsVersion: js.UndefOr[`5` | `6` | detect] = js.native
}

object LoadObjectOptions {
  @scala.inline
  def apply(): LoadObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadObjectOptions]
  }
  @scala.inline
  implicit class LoadObjectOptionsOps[Self <: LoadObjectOptions] (val x: Self) extends AnyVal {
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
    def setDeprecatedArgumentOrder(value: Boolean): Self = this.set("deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedArgumentOrder: Self = this.set("deprecatedArgumentOrder", js.undefined)
    @scala.inline
    def setEnumsAsStrings(value: Boolean): Self = this.set("enumsAsStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumsAsStrings: Self = this.set("enumsAsStrings", js.undefined)
    @scala.inline
    def setLongsAsStrings(value: Boolean): Self = this.set("longsAsStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongsAsStrings: Self = this.set("longsAsStrings", js.undefined)
    @scala.inline
    def setProtobufjsVersion(value: `5` | `6` | detect): Self = this.set("protobufjsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtobufjsVersion: Self = this.set("protobufjsVersion", js.undefined)
  }
  
}

