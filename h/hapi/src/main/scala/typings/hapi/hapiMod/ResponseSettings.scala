package typings.hapi.hapiMod

import typings.hapi.hapiMod.JsonNs.StringifyArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseSettings extends js.Object {
  /**
    * Defaults value: true.
    * If true and source is a Stream, copies the statusCode and headers properties of the stream object to the outbound response.
    */
  val passThrough: Boolean
  /**
    * Default value: null (use route defaults).
    * Override the route json options used when source value requires stringification.
    */
  val stringify: StringifyArguments
  /**
    * Default value: null (use route defaults).
    * If set, overrides the route cache with an expiration value in milliseconds.
    */
  val ttl: Double
  /**
    * Default value: false.
    * If true, a suffix will be automatically added to the 'ETag' header at transmission time (separated by a '-' character) when the HTTP 'Vary' header is present.
    */
  var varyEtag: Boolean
}

object ResponseSettings {
  @scala.inline
  def apply(passThrough: Boolean, stringify: StringifyArguments, ttl: Double, varyEtag: Boolean): ResponseSettings = {
    val __obj = js.Dynamic.literal(passThrough = passThrough, stringify = stringify, ttl = ttl, varyEtag = varyEtag)
  
    __obj.asInstanceOf[ResponseSettings]
  }
}

