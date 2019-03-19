package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appendbodypart extends js.Object {
  def append_body_part(txt: java.lang.String, ct: java.lang.String): scala.Double
  def append_body_part_cd(txt: java.lang.String, ct: java.lang.String, cd: java.lang.String): scala.Double
  def append_body_part_hex(txt: java.lang.String, ct: java.lang.String): scala.Double
  def append_body_part_hex_cd(htxt: java.lang.String, ct: java.lang.String, cd: java.lang.String): scala.Double
  def cmp_istr(s1: java.lang.String, s2: java.lang.String): scala.Double
  def cmp_str(s1: java.lang.String, s2: java.lang.String): scala.Double
  def filter_body(content_type: java.lang.String): scala.Double
  def get_body_part(ctype: java.lang.String, pvname: java.lang.String): scala.Double
  def get_body_part_raw(ctype: java.lang.String, pvname: java.lang.String): scala.Double
  def has_body(): scala.Double
  def has_body_type(ctype: java.lang.String): scala.Double
  def in_list(subject: java.lang.String, list: java.lang.String, vsep: java.lang.String): scala.Double
  def in_list_prefix(subject: java.lang.String, list: java.lang.String, vsep: java.lang.String): scala.Double
  def is_audio_on_hold(): scala.Double
  def is_present_hf(hname: java.lang.String): scala.Double
  def is_present_hf_re(ematch: java.lang.String): scala.Double
  def is_privacy(privacy: java.lang.String): scala.Double
  def remove_body_part(content_type: java.lang.String): scala.Double
  def remove_hf_exp(ematch: java.lang.String, eskip: java.lang.String): scala.Double
  def remove_hf_re(ematch: java.lang.String): scala.Double
  def replace(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_all(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_body(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_body_all(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_body_atonce(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_body_str(mkey: java.lang.String, rval: java.lang.String, rmode: java.lang.String): scala.Double
  def replace_hdrs(sre: java.lang.String, sval: java.lang.String): scala.Double
  def replace_hdrs_str(mkey: java.lang.String, rval: java.lang.String, rmode: java.lang.String): scala.Double
  def replace_str(mkey: java.lang.String, rval: java.lang.String, rmode: java.lang.String): scala.Double
  def search(sre: java.lang.String): scala.Double
  def search_append(ematch: java.lang.String, `val`: java.lang.String): scala.Double
  def search_append_body(ematch: java.lang.String, `val`: java.lang.String): scala.Double
  def search_body(sre: java.lang.String): scala.Double
  def search_hf(hname: java.lang.String, sre: java.lang.String, flags: java.lang.String): scala.Double
  def set_body(nb: java.lang.String, nc: java.lang.String): scala.Double
  def set_body_multipart(nbody: java.lang.String, ctype: java.lang.String, boundary: java.lang.String): scala.Double
  def set_body_multipart_boundary(boundary: java.lang.String): scala.Double
  def set_body_multipart_content(nbody: java.lang.String, ctype: java.lang.String): scala.Double
  def set_body_multipart_mode(): scala.Double
  def set_reply_body(nb: java.lang.String, nc: java.lang.String): scala.Double
  def starts_with(s1: java.lang.String, s2: java.lang.String): scala.Double
  def subst(subst: java.lang.String): scala.Double
  def subst_body(subst: java.lang.String): scala.Double
  def subst_hf(hname: java.lang.String, subst: java.lang.String, flags: java.lang.String): scala.Double
  def subst_uri(subst: java.lang.String): scala.Double
  def subst_user(subst: java.lang.String): scala.Double
}

object Anon_Appendbodypart {
  @scala.inline
  def apply(
    append_body_part: (java.lang.String, java.lang.String) => scala.Double,
    append_body_part_cd: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    append_body_part_hex: (java.lang.String, java.lang.String) => scala.Double,
    append_body_part_hex_cd: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    cmp_istr: (java.lang.String, java.lang.String) => scala.Double,
    cmp_str: (java.lang.String, java.lang.String) => scala.Double,
    filter_body: java.lang.String => scala.Double,
    get_body_part: (java.lang.String, java.lang.String) => scala.Double,
    get_body_part_raw: (java.lang.String, java.lang.String) => scala.Double,
    has_body: () => scala.Double,
    has_body_type: java.lang.String => scala.Double,
    in_list: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    in_list_prefix: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    is_audio_on_hold: () => scala.Double,
    is_present_hf: java.lang.String => scala.Double,
    is_present_hf_re: java.lang.String => scala.Double,
    is_privacy: java.lang.String => scala.Double,
    remove_body_part: java.lang.String => scala.Double,
    remove_hf_exp: (java.lang.String, java.lang.String) => scala.Double,
    remove_hf_re: java.lang.String => scala.Double,
    replace: (java.lang.String, java.lang.String) => scala.Double,
    replace_all: (java.lang.String, java.lang.String) => scala.Double,
    replace_body: (java.lang.String, java.lang.String) => scala.Double,
    replace_body_all: (java.lang.String, java.lang.String) => scala.Double,
    replace_body_atonce: (java.lang.String, java.lang.String) => scala.Double,
    replace_body_str: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    replace_hdrs: (java.lang.String, java.lang.String) => scala.Double,
    replace_hdrs_str: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    replace_str: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    search: java.lang.String => scala.Double,
    search_append: (java.lang.String, java.lang.String) => scala.Double,
    search_append_body: (java.lang.String, java.lang.String) => scala.Double,
    search_body: java.lang.String => scala.Double,
    search_hf: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    set_body: (java.lang.String, java.lang.String) => scala.Double,
    set_body_multipart: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    set_body_multipart_boundary: java.lang.String => scala.Double,
    set_body_multipart_content: (java.lang.String, java.lang.String) => scala.Double,
    set_body_multipart_mode: () => scala.Double,
    set_reply_body: (java.lang.String, java.lang.String) => scala.Double,
    starts_with: (java.lang.String, java.lang.String) => scala.Double,
    subst: java.lang.String => scala.Double,
    subst_body: java.lang.String => scala.Double,
    subst_hf: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    subst_uri: java.lang.String => scala.Double,
    subst_user: java.lang.String => scala.Double
  ): Anon_Appendbodypart = {
    val __obj = js.Dynamic.literal(append_body_part = js.Any.fromFunction2(append_body_part), append_body_part_cd = js.Any.fromFunction3(append_body_part_cd), append_body_part_hex = js.Any.fromFunction2(append_body_part_hex), append_body_part_hex_cd = js.Any.fromFunction3(append_body_part_hex_cd), cmp_istr = js.Any.fromFunction2(cmp_istr), cmp_str = js.Any.fromFunction2(cmp_str), filter_body = js.Any.fromFunction1(filter_body), get_body_part = js.Any.fromFunction2(get_body_part), get_body_part_raw = js.Any.fromFunction2(get_body_part_raw), has_body = js.Any.fromFunction0(has_body), has_body_type = js.Any.fromFunction1(has_body_type), in_list = js.Any.fromFunction3(in_list), in_list_prefix = js.Any.fromFunction3(in_list_prefix), is_audio_on_hold = js.Any.fromFunction0(is_audio_on_hold), is_present_hf = js.Any.fromFunction1(is_present_hf), is_present_hf_re = js.Any.fromFunction1(is_present_hf_re), is_privacy = js.Any.fromFunction1(is_privacy), remove_body_part = js.Any.fromFunction1(remove_body_part), remove_hf_exp = js.Any.fromFunction2(remove_hf_exp), remove_hf_re = js.Any.fromFunction1(remove_hf_re), replace = js.Any.fromFunction2(replace), replace_all = js.Any.fromFunction2(replace_all), replace_body = js.Any.fromFunction2(replace_body), replace_body_all = js.Any.fromFunction2(replace_body_all), replace_body_atonce = js.Any.fromFunction2(replace_body_atonce), replace_body_str = js.Any.fromFunction3(replace_body_str), replace_hdrs = js.Any.fromFunction2(replace_hdrs), replace_hdrs_str = js.Any.fromFunction3(replace_hdrs_str), replace_str = js.Any.fromFunction3(replace_str), search = js.Any.fromFunction1(search), search_append = js.Any.fromFunction2(search_append), search_append_body = js.Any.fromFunction2(search_append_body), search_body = js.Any.fromFunction1(search_body), search_hf = js.Any.fromFunction3(search_hf), set_body = js.Any.fromFunction2(set_body), set_body_multipart = js.Any.fromFunction3(set_body_multipart), set_body_multipart_boundary = js.Any.fromFunction1(set_body_multipart_boundary), set_body_multipart_content = js.Any.fromFunction2(set_body_multipart_content), set_body_multipart_mode = js.Any.fromFunction0(set_body_multipart_mode), set_reply_body = js.Any.fromFunction2(set_reply_body), starts_with = js.Any.fromFunction2(starts_with), subst = js.Any.fromFunction1(subst), subst_body = js.Any.fromFunction1(subst_body), subst_hf = js.Any.fromFunction3(subst_hf), subst_uri = js.Any.fromFunction1(subst_uri), subst_user = js.Any.fromFunction1(subst_user))
  
    __obj.asInstanceOf[Anon_Appendbodypart]
  }
}

