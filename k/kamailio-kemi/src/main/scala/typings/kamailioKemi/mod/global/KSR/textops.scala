package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textops {
  
  @JSGlobal("KSR.textops")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendBodyPart(txt: String, ct: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_body_part")(txt.asInstanceOf[js.Any], ct.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def appendBodyPartCd(txt: String, ct: String, cd: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_body_part_cd")(txt.asInstanceOf[js.Any], ct.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def appendBodyPartHex(txt: String, ct: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_body_part_hex")(txt.asInstanceOf[js.Any], ct.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def appendBodyPartHexCd(htxt: String, ct: String, cd: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_body_part_hex_cd")(htxt.asInstanceOf[js.Any], ct.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def cmpIstr(s1: String, s2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp_istr")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def cmpStr(s1: String, s2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp_str")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def filterBody(content_type: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("filter_body")(content_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBodyPart(ctype: String, pvname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_body_part")(ctype.asInstanceOf[js.Any], pvname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getBodyPartRaw(ctype: String, pvname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_body_part_raw")(ctype.asInstanceOf[js.Any], pvname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasBody(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_body")().asInstanceOf[Double]
  
  inline def hasBodyType(ctype: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_body_type")(ctype.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def inList(subject: String, list: String, vsep: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("in_list")(subject.asInstanceOf[js.Any], list.asInstanceOf[js.Any], vsep.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def inListPrefix(subject: String, list: String, vsep: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("in_list_prefix")(subject.asInstanceOf[js.Any], list.asInstanceOf[js.Any], vsep.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isAudioOnHold(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_audio_on_hold")().asInstanceOf[Double]
  
  inline def isPresentHf(hname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_present_hf")(hname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isPresentHfRe(ematch: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_present_hf_re")(ematch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isPrivacy(privacy: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_privacy")(privacy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeBodyPart(content_type: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_body_part")(content_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeHfExp(ematch: String, eskip: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_hf_exp")(ematch.asInstanceOf[js.Any], eskip.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeHfRe(ematch: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_hf_re")(ematch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def replace(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceAll(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_all")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceBody(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_body")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceBodyAll(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_body_all")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceBodyAtonce(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_body_atonce")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceBodyStr(mkey: String, rval: String, rmode: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_body_str")(mkey.asInstanceOf[js.Any], rval.asInstanceOf[js.Any], rmode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceHdrs(sre: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_hdrs")(sre.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceHdrsStr(mkey: String, rval: String, rmode: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_hdrs_str")(mkey.asInstanceOf[js.Any], rval.asInstanceOf[js.Any], rmode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceStr(mkey: String, rval: String, rmode: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace_str")(mkey.asInstanceOf[js.Any], rval.asInstanceOf[js.Any], rmode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def search(sre: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(sre.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def searchAppend(ematch: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search_append")(ematch.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def searchAppendBody(ematch: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search_append_body")(ematch.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def searchBody(sre: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("search_body")(sre.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def searchHf(hname: String, sre: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search_hf")(hname.asInstanceOf[js.Any], sre.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setBody(nb: String, nc: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_body")(nb.asInstanceOf[js.Any], nc.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setBodyMultipart(nbody: String, ctype: String, boundary: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_body_multipart")(nbody.asInstanceOf[js.Any], ctype.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setBodyMultipartBoundary(boundary: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_body_multipart_boundary")(boundary.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setBodyMultipartContent(nbody: String, ctype: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_body_multipart_content")(nbody.asInstanceOf[js.Any], ctype.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setBodyMultipartMode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_body_multipart_mode")().asInstanceOf[Double]
  
  inline def setReplyBody(nb: String, nc: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_reply_body")(nb.asInstanceOf[js.Any], nc.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def startsWith(s1: String, s2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("starts_with")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def subst(subst: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("subst")(subst.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def substBody(subst: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("subst_body")(subst.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def substHf(hname: String, subst: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("subst_hf")(hname.asInstanceOf[js.Any], subst.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def substUri(subst: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("subst_uri")(subst.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def substUser(subst: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("subst_user")(subst.asInstanceOf[js.Any]).asInstanceOf[Double]
}
