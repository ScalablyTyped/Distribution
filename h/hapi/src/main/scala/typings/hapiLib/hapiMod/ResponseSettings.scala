package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseSettings extends js.Object {
  /**
    * Defaults value: true.
    * If true and source is a Stream, copies the statusCode and headers properties of the stream object to the outbound response.
    */
  val passThrough: scala.Boolean
  /**
    * Default value: null (use route defaults).
    * Override the route json options used when source value requires stringification.
    */
  val stringify: hapiLib.hapiMod.JsonNs.StringifyArguments
  /**
    * Default value: null (use route defaults).
    * If set, overrides the route cache with an expiration value in milliseconds.
    */
  val ttl: scala.Double
  /**
    * Default value: false.
    * If true, a suffix will be automatically added to the 'ETag' header at transmission time (separated by a '-' character) when the HTTP 'Vary' header is present.
    */
  var varyEtag: scala.Boolean
}

object ResponseSettings {
  @scala.inline
  def apply(
    passThrough: scala.Boolean,
    stringify: hapiLib.hapiMod.JsonNs.StringifyArguments,
    ttl: scala.Double,
    varyEtag: scala.Boolean
  ): ResponseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("passThrough")(passThrough)
    __obj.updateDynamic("stringify")(stringify)
    __obj.updateDynamic("ttl")(ttl)
    __obj.updateDynamic("varyEtag")(varyEtag)
    __obj.asInstanceOf[ResponseSettings]
  }
}

