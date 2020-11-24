package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftextops extends js.Object {
  
  def append_body_part(txt: String, ct: String): Double = js.native
  
  def append_body_part_cd(txt: String, ct: String, cd: String): Double = js.native
  
  def append_body_part_hex(txt: String, ct: String): Double = js.native
  
  def append_body_part_hex_cd(htxt: String, ct: String, cd: String): Double = js.native
  
  def cmp_istr(s1: String, s2: String): Double = js.native
  
  def cmp_str(s1: String, s2: String): Double = js.native
  
  def filter_body(content_type: String): Double = js.native
  
  def get_body_part(ctype: String, pvname: String): Double = js.native
  
  def get_body_part_raw(ctype: String, pvname: String): Double = js.native
  
  def has_body(): Double = js.native
  
  def has_body_type(ctype: String): Double = js.native
  
  def in_list(subject: String, list: String, vsep: String): Double = js.native
  
  def in_list_prefix(subject: String, list: String, vsep: String): Double = js.native
  
  def is_audio_on_hold(): Double = js.native
  
  def is_present_hf(hname: String): Double = js.native
  
  def is_present_hf_re(ematch: String): Double = js.native
  
  def is_privacy(privacy: String): Double = js.native
  
  def remove_body_part(content_type: String): Double = js.native
  
  def remove_hf_exp(ematch: String, eskip: String): Double = js.native
  
  def remove_hf_re(ematch: String): Double = js.native
  
  def replace(sre: String, sval: String): Double = js.native
  
  def replace_all(sre: String, sval: String): Double = js.native
  
  def replace_body(sre: String, sval: String): Double = js.native
  
  def replace_body_all(sre: String, sval: String): Double = js.native
  
  def replace_body_atonce(sre: String, sval: String): Double = js.native
  
  def replace_body_str(mkey: String, rval: String, rmode: String): Double = js.native
  
  def replace_hdrs(sre: String, sval: String): Double = js.native
  
  def replace_hdrs_str(mkey: String, rval: String, rmode: String): Double = js.native
  
  def replace_str(mkey: String, rval: String, rmode: String): Double = js.native
  
  def search(sre: String): Double = js.native
  
  def search_append(ematch: String, `val`: String): Double = js.native
  
  def search_append_body(ematch: String, `val`: String): Double = js.native
  
  def search_body(sre: String): Double = js.native
  
  def search_hf(hname: String, sre: String, flags: String): Double = js.native
  
  def set_body(nb: String, nc: String): Double = js.native
  
  def set_body_multipart(nbody: String, ctype: String, boundary: String): Double = js.native
  
  def set_body_multipart_boundary(boundary: String): Double = js.native
  
  def set_body_multipart_content(nbody: String, ctype: String): Double = js.native
  
  def set_body_multipart_mode(): Double = js.native
  
  def set_reply_body(nb: String, nc: String): Double = js.native
  
  def starts_with(s1: String, s2: String): Double = js.native
  
  def subst(subst: String): Double = js.native
  
  def subst_body(subst: String): Double = js.native
  
  def subst_hf(hname: String, subst: String, flags: String): Double = js.native
  
  def subst_uri(subst: String): Double = js.native
  
  def subst_user(subst: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeoftextopsOps[Self <: Typeoftextops] (val x: Self) extends AnyVal {
    
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
    def setAppend_body_part(value: (String, String) => Double): Self = this.set("append_body_part", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppend_body_part_cd(value: (String, String, String) => Double): Self = this.set("append_body_part_cd", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppend_body_part_hex(value: (String, String) => Double): Self = this.set("append_body_part_hex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppend_body_part_hex_cd(value: (String, String, String) => Double): Self = this.set("append_body_part_hex_cd", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCmp_istr(value: (String, String) => Double): Self = this.set("cmp_istr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCmp_str(value: (String, String) => Double): Self = this.set("cmp_str", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter_body(value: String => Double): Self = this.set("filter_body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_body_part(value: (String, String) => Double): Self = this.set("get_body_part", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet_body_part_raw(value: (String, String) => Double): Self = this.set("get_body_part_raw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHas_body(value: () => Double): Self = this.set("has_body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHas_body_type(value: String => Double): Self = this.set("has_body_type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn_list(value: (String, String, String) => Double): Self = this.set("in_list", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIn_list_prefix(value: (String, String, String) => Double): Self = this.set("in_list_prefix", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIs_audio_on_hold(value: () => Double): Self = this.set("is_audio_on_hold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIs_present_hf(value: String => Double): Self = this.set("is_present_hf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_present_hf_re(value: String => Double): Self = this.set("is_present_hf_re", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_privacy(value: String => Double): Self = this.set("is_privacy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_body_part(value: String => Double): Self = this.set("remove_body_part", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_hf_exp(value: (String, String) => Double): Self = this.set("remove_hf_exp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove_hf_re(value: String => Double): Self = this.set("remove_hf_re", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplace(value: (String, String) => Double): Self = this.set("replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_all(value: (String, String) => Double): Self = this.set("replace_all", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_body(value: (String, String) => Double): Self = this.set("replace_body", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_body_all(value: (String, String) => Double): Self = this.set("replace_body_all", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_body_atonce(value: (String, String) => Double): Self = this.set("replace_body_atonce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_body_str(value: (String, String, String) => Double): Self = this.set("replace_body_str", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplace_hdrs(value: (String, String) => Double): Self = this.set("replace_hdrs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace_hdrs_str(value: (String, String, String) => Double): Self = this.set("replace_hdrs_str", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplace_str(value: (String, String, String) => Double): Self = this.set("replace_str", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSearch(value: String => Double): Self = this.set("search", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch_append(value: (String, String) => Double): Self = this.set("search_append", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearch_append_body(value: (String, String) => Double): Self = this.set("search_append_body", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearch_body(value: String => Double): Self = this.set("search_body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch_hf(value: (String, String, String) => Double): Self = this.set("search_hf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSet_body(value: (String, String) => Double): Self = this.set("set_body", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_body_multipart(value: (String, String, String) => Double): Self = this.set("set_body_multipart", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSet_body_multipart_boundary(value: String => Double): Self = this.set("set_body_multipart_boundary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_body_multipart_content(value: (String, String) => Double): Self = this.set("set_body_multipart_content", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_body_multipart_mode(value: () => Double): Self = this.set("set_body_multipart_mode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_reply_body(value: (String, String) => Double): Self = this.set("set_reply_body", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStarts_with(value: (String, String) => Double): Self = this.set("starts_with", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubst(value: String => Double): Self = this.set("subst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubst_body(value: String => Double): Self = this.set("subst_body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubst_hf(value: (String, String, String) => Double): Self = this.set("subst_hf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSubst_uri(value: String => Double): Self = this.set("subst_uri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubst_user(value: String => Double): Self = this.set("subst_user", js.Any.fromFunction1(value))
  }
}
