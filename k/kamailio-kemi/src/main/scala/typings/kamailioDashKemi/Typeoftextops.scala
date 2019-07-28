package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftextops extends js.Object {
  def append_body_part(txt: String, ct: String): Double
  def append_body_part_cd(txt: String, ct: String, cd: String): Double
  def append_body_part_hex(txt: String, ct: String): Double
  def append_body_part_hex_cd(htxt: String, ct: String, cd: String): Double
  def cmp_istr(s1: String, s2: String): Double
  def cmp_str(s1: String, s2: String): Double
  def filter_body(content_type: String): Double
  def get_body_part(ctype: String, pvname: String): Double
  def get_body_part_raw(ctype: String, pvname: String): Double
  def has_body(): Double
  def has_body_type(ctype: String): Double
  def in_list(subject: String, list: String, vsep: String): Double
  def in_list_prefix(subject: String, list: String, vsep: String): Double
  def is_audio_on_hold(): Double
  def is_present_hf(hname: String): Double
  def is_present_hf_re(ematch: String): Double
  def is_privacy(privacy: String): Double
  def remove_body_part(content_type: String): Double
  def remove_hf_exp(ematch: String, eskip: String): Double
  def remove_hf_re(ematch: String): Double
  def replace(sre: String, sval: String): Double
  def replace_all(sre: String, sval: String): Double
  def replace_body(sre: String, sval: String): Double
  def replace_body_all(sre: String, sval: String): Double
  def replace_body_atonce(sre: String, sval: String): Double
  def replace_body_str(mkey: String, rval: String, rmode: String): Double
  def replace_hdrs(sre: String, sval: String): Double
  def replace_hdrs_str(mkey: String, rval: String, rmode: String): Double
  def replace_str(mkey: String, rval: String, rmode: String): Double
  def search(sre: String): Double
  def search_append(ematch: String, `val`: String): Double
  def search_append_body(ematch: String, `val`: String): Double
  def search_body(sre: String): Double
  def search_hf(hname: String, sre: String, flags: String): Double
  def set_body(nb: String, nc: String): Double
  def set_body_multipart(nbody: String, ctype: String, boundary: String): Double
  def set_body_multipart_boundary(boundary: String): Double
  def set_body_multipart_content(nbody: String, ctype: String): Double
  def set_body_multipart_mode(): Double
  def set_reply_body(nb: String, nc: String): Double
  def starts_with(s1: String, s2: String): Double
  def subst(subst: String): Double
  def subst_body(subst: String): Double
  def subst_hf(hname: String, subst: String, flags: String): Double
  def subst_uri(subst: String): Double
  def subst_user(subst: String): Double
}

object Typeoftextops {
  @scala.inline
  def apply(
    append_body_part: (String, String) => Double,
    append_body_part_cd: (String, String, String) => Double,
    append_body_part_hex: (String, String) => Double,
    append_body_part_hex_cd: (String, String, String) => Double,
    cmp_istr: (String, String) => Double,
    cmp_str: (String, String) => Double,
    filter_body: String => Double,
    get_body_part: (String, String) => Double,
    get_body_part_raw: (String, String) => Double,
    has_body: () => Double,
    has_body_type: String => Double,
    in_list: (String, String, String) => Double,
    in_list_prefix: (String, String, String) => Double,
    is_audio_on_hold: () => Double,
    is_present_hf: String => Double,
    is_present_hf_re: String => Double,
    is_privacy: String => Double,
    remove_body_part: String => Double,
    remove_hf_exp: (String, String) => Double,
    remove_hf_re: String => Double,
    replace: (String, String) => Double,
    replace_all: (String, String) => Double,
    replace_body: (String, String) => Double,
    replace_body_all: (String, String) => Double,
    replace_body_atonce: (String, String) => Double,
    replace_body_str: (String, String, String) => Double,
    replace_hdrs: (String, String) => Double,
    replace_hdrs_str: (String, String, String) => Double,
    replace_str: (String, String, String) => Double,
    search: String => Double,
    search_append: (String, String) => Double,
    search_append_body: (String, String) => Double,
    search_body: String => Double,
    search_hf: (String, String, String) => Double,
    set_body: (String, String) => Double,
    set_body_multipart: (String, String, String) => Double,
    set_body_multipart_boundary: String => Double,
    set_body_multipart_content: (String, String) => Double,
    set_body_multipart_mode: () => Double,
    set_reply_body: (String, String) => Double,
    starts_with: (String, String) => Double,
    subst: String => Double,
    subst_body: String => Double,
    subst_hf: (String, String, String) => Double,
    subst_uri: String => Double,
    subst_user: String => Double
  ): Typeoftextops = {
    val __obj = js.Dynamic.literal(append_body_part = js.Any.fromFunction2(append_body_part), append_body_part_cd = js.Any.fromFunction3(append_body_part_cd), append_body_part_hex = js.Any.fromFunction2(append_body_part_hex), append_body_part_hex_cd = js.Any.fromFunction3(append_body_part_hex_cd), cmp_istr = js.Any.fromFunction2(cmp_istr), cmp_str = js.Any.fromFunction2(cmp_str), filter_body = js.Any.fromFunction1(filter_body), get_body_part = js.Any.fromFunction2(get_body_part), get_body_part_raw = js.Any.fromFunction2(get_body_part_raw), has_body = js.Any.fromFunction0(has_body), has_body_type = js.Any.fromFunction1(has_body_type), in_list = js.Any.fromFunction3(in_list), in_list_prefix = js.Any.fromFunction3(in_list_prefix), is_audio_on_hold = js.Any.fromFunction0(is_audio_on_hold), is_present_hf = js.Any.fromFunction1(is_present_hf), is_present_hf_re = js.Any.fromFunction1(is_present_hf_re), is_privacy = js.Any.fromFunction1(is_privacy), remove_body_part = js.Any.fromFunction1(remove_body_part), remove_hf_exp = js.Any.fromFunction2(remove_hf_exp), remove_hf_re = js.Any.fromFunction1(remove_hf_re), replace = js.Any.fromFunction2(replace), replace_all = js.Any.fromFunction2(replace_all), replace_body = js.Any.fromFunction2(replace_body), replace_body_all = js.Any.fromFunction2(replace_body_all), replace_body_atonce = js.Any.fromFunction2(replace_body_atonce), replace_body_str = js.Any.fromFunction3(replace_body_str), replace_hdrs = js.Any.fromFunction2(replace_hdrs), replace_hdrs_str = js.Any.fromFunction3(replace_hdrs_str), replace_str = js.Any.fromFunction3(replace_str), search = js.Any.fromFunction1(search), search_append = js.Any.fromFunction2(search_append), search_append_body = js.Any.fromFunction2(search_append_body), search_body = js.Any.fromFunction1(search_body), search_hf = js.Any.fromFunction3(search_hf), set_body = js.Any.fromFunction2(set_body), set_body_multipart = js.Any.fromFunction3(set_body_multipart), set_body_multipart_boundary = js.Any.fromFunction1(set_body_multipart_boundary), set_body_multipart_content = js.Any.fromFunction2(set_body_multipart_content), set_body_multipart_mode = js.Any.fromFunction0(set_body_multipart_mode), set_reply_body = js.Any.fromFunction2(set_reply_body), starts_with = js.Any.fromFunction2(starts_with), subst = js.Any.fromFunction1(subst), subst_body = js.Any.fromFunction1(subst_body), subst_hf = js.Any.fromFunction3(subst_hf), subst_uri = js.Any.fromFunction1(subst_uri), subst_user = js.Any.fromFunction1(subst_user))
  
    __obj.asInstanceOf[Typeoftextops]
  }
}

