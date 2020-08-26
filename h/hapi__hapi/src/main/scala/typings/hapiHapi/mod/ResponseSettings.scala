package typings.hapiHapi.mod

import typings.hapiHapi.mod.Json.StringifyArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseSettings extends js.Object {
  /**
    * Defaults value: true.
    * If true and source is a Stream, copies the statusCode and headers properties of the stream object to the outbound response.
    */
  val passThrough: Boolean = js.native
  /**
    * @default null (use route defaults).
    * Override the route json options used when source value requires stringification.
    */
  val stringify: StringifyArguments = js.native
  /**
    * @default null (use route defaults).
    * If set, overrides the route cache with an expiration value in milliseconds.
    */
  val ttl: Double = js.native
  /**
    * @default false.
    * If true, a suffix will be automatically added to the 'ETag' header at transmission time (separated by a '-' character) when the HTTP 'Vary' header is present.
    */
  var varyEtag: Boolean = js.native
}

object ResponseSettings {
  @scala.inline
  def apply(passThrough: Boolean, stringify: StringifyArguments, ttl: Double, varyEtag: Boolean): ResponseSettings = {
    val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], varyEtag = varyEtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseSettings]
  }
  @scala.inline
  implicit class ResponseSettingsOps[Self <: ResponseSettings] (val x: Self) extends AnyVal {
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
    def setPassThrough(value: Boolean): Self = this.set("passThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringify(value: StringifyArguments): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaryEtag(value: Boolean): Self = this.set("varyEtag", value.asInstanceOf[js.Any])
  }
  
}

