package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aname extends js.Object {
  def keep_codecs_by_id(codecs: java.lang.String, media: java.lang.String): scala.Double
  def keep_codecs_by_name(codecs: java.lang.String, media: java.lang.String): scala.Double
  def remove_codecs_by_id(codecs: java.lang.String, media: java.lang.String): scala.Double
  def remove_codecs_by_name(codecs: java.lang.String, media: java.lang.String): scala.Double
  def remove_line_by_prefix(prefix: java.lang.String, media: java.lang.String): scala.Double
  def remove_media(media: java.lang.String): scala.Double
  def sdp_content(): scala.Double
  def sdp_content_flags(flags: scala.Double): scala.Double
  def sdp_get(avp: java.lang.String): scala.Double
  def sdp_get_line_startswith(aname: java.lang.String, sline: java.lang.String): scala.Double
  def sdp_print(llevel: scala.Double): scala.Double
  def sdp_transport(avp: java.lang.String): scala.Double
  def sdp_with_active_media(media: java.lang.String): scala.Double
  def sdp_with_ice(): scala.Double
  def sdp_with_media(media: java.lang.String): scala.Double
}

object Anon_Aname {
  @scala.inline
  def apply(
    keep_codecs_by_id: (java.lang.String, java.lang.String) => scala.Double,
    keep_codecs_by_name: (java.lang.String, java.lang.String) => scala.Double,
    remove_codecs_by_id: (java.lang.String, java.lang.String) => scala.Double,
    remove_codecs_by_name: (java.lang.String, java.lang.String) => scala.Double,
    remove_line_by_prefix: (java.lang.String, java.lang.String) => scala.Double,
    remove_media: java.lang.String => scala.Double,
    sdp_content: () => scala.Double,
    sdp_content_flags: scala.Double => scala.Double,
    sdp_get: java.lang.String => scala.Double,
    sdp_get_line_startswith: (java.lang.String, java.lang.String) => scala.Double,
    sdp_print: scala.Double => scala.Double,
    sdp_transport: java.lang.String => scala.Double,
    sdp_with_active_media: java.lang.String => scala.Double,
    sdp_with_ice: () => scala.Double,
    sdp_with_media: java.lang.String => scala.Double
  ): Anon_Aname = {
    val __obj = js.Dynamic.literal(keep_codecs_by_id = js.Any.fromFunction2(keep_codecs_by_id), keep_codecs_by_name = js.Any.fromFunction2(keep_codecs_by_name), remove_codecs_by_id = js.Any.fromFunction2(remove_codecs_by_id), remove_codecs_by_name = js.Any.fromFunction2(remove_codecs_by_name), remove_line_by_prefix = js.Any.fromFunction2(remove_line_by_prefix), remove_media = js.Any.fromFunction1(remove_media), sdp_content = js.Any.fromFunction0(sdp_content), sdp_content_flags = js.Any.fromFunction1(sdp_content_flags), sdp_get = js.Any.fromFunction1(sdp_get), sdp_get_line_startswith = js.Any.fromFunction2(sdp_get_line_startswith), sdp_print = js.Any.fromFunction1(sdp_print), sdp_transport = js.Any.fromFunction1(sdp_transport), sdp_with_active_media = js.Any.fromFunction1(sdp_with_active_media), sdp_with_ice = js.Any.fromFunction0(sdp_with_ice), sdp_with_media = js.Any.fromFunction1(sdp_with_media))
  
    __obj.asInstanceOf[Anon_Aname]
  }
}

