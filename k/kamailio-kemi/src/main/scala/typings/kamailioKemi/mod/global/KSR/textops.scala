package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textops {
  
  @JSGlobal("KSR.textops.append_body_part")
  @js.native
  def appendBodyPart(txt: String, ct: String): Double = js.native
  
  @JSGlobal("KSR.textops.append_body_part_cd")
  @js.native
  def appendBodyPartCd(txt: String, ct: String, cd: String): Double = js.native
  
  @JSGlobal("KSR.textops.append_body_part_hex")
  @js.native
  def appendBodyPartHex(txt: String, ct: String): Double = js.native
  
  @JSGlobal("KSR.textops.append_body_part_hex_cd")
  @js.native
  def appendBodyPartHexCd(htxt: String, ct: String, cd: String): Double = js.native
  
  @JSGlobal("KSR.textops.cmp_istr")
  @js.native
  def cmpIstr(s1: String, s2: String): Double = js.native
  
  @JSGlobal("KSR.textops.cmp_str")
  @js.native
  def cmpStr(s1: String, s2: String): Double = js.native
  
  @JSGlobal("KSR.textops.filter_body")
  @js.native
  def filterBody(content_type: String): Double = js.native
  
  @JSGlobal("KSR.textops.get_body_part")
  @js.native
  def getBodyPart(ctype: String, pvname: String): Double = js.native
  
  @JSGlobal("KSR.textops.get_body_part_raw")
  @js.native
  def getBodyPartRaw(ctype: String, pvname: String): Double = js.native
  
  @JSGlobal("KSR.textops.has_body")
  @js.native
  def hasBody(): Double = js.native
  
  @JSGlobal("KSR.textops.has_body_type")
  @js.native
  def hasBodyType(ctype: String): Double = js.native
  
  @JSGlobal("KSR.textops.in_list")
  @js.native
  def inList(subject: String, list: String, vsep: String): Double = js.native
  
  @JSGlobal("KSR.textops.in_list_prefix")
  @js.native
  def inListPrefix(subject: String, list: String, vsep: String): Double = js.native
  
  @JSGlobal("KSR.textops.is_audio_on_hold")
  @js.native
  def isAudioOnHold(): Double = js.native
  
  @JSGlobal("KSR.textops.is_present_hf")
  @js.native
  def isPresentHf(hname: String): Double = js.native
  
  @JSGlobal("KSR.textops.is_present_hf_re")
  @js.native
  def isPresentHfRe(ematch: String): Double = js.native
  
  @JSGlobal("KSR.textops.is_privacy")
  @js.native
  def isPrivacy(privacy: String): Double = js.native
  
  @JSGlobal("KSR.textops.remove_body_part")
  @js.native
  def removeBodyPart(content_type: String): Double = js.native
  
  @JSGlobal("KSR.textops.remove_hf_exp")
  @js.native
  def removeHfExp(ematch: String, eskip: String): Double = js.native
  
  @JSGlobal("KSR.textops.remove_hf_re")
  @js.native
  def removeHfRe(ematch: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace")
  @js.native
  def replace(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_all")
  @js.native
  def replaceAll(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_body")
  @js.native
  def replaceBody(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_body_all")
  @js.native
  def replaceBodyAll(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_body_atonce")
  @js.native
  def replaceBodyAtonce(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_body_str")
  @js.native
  def replaceBodyStr(mkey: String, rval: String, rmode: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_hdrs")
  @js.native
  def replaceHdrs(sre: String, sval: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_hdrs_str")
  @js.native
  def replaceHdrsStr(mkey: String, rval: String, rmode: String): Double = js.native
  
  @JSGlobal("KSR.textops.replace_str")
  @js.native
  def replaceStr(mkey: String, rval: String, rmode: String): Double = js.native
  
  @JSGlobal("KSR.textops.search")
  @js.native
  def search(sre: String): Double = js.native
  
  @JSGlobal("KSR.textops.search_append")
  @js.native
  def searchAppend(ematch: String, `val`: String): Double = js.native
  
  @JSGlobal("KSR.textops.search_append_body")
  @js.native
  def searchAppendBody(ematch: String, `val`: String): Double = js.native
  
  @JSGlobal("KSR.textops.search_body")
  @js.native
  def searchBody(sre: String): Double = js.native
  
  @JSGlobal("KSR.textops.search_hf")
  @js.native
  def searchHf(hname: String, sre: String, flags: String): Double = js.native
  
  @JSGlobal("KSR.textops.set_body")
  @js.native
  def setBody(nb: String, nc: String): Double = js.native
  
  @JSGlobal("KSR.textops.set_body_multipart")
  @js.native
  def setBodyMultipart(nbody: String, ctype: String, boundary: String): Double = js.native
  
  @JSGlobal("KSR.textops.set_body_multipart_boundary")
  @js.native
  def setBodyMultipartBoundary(boundary: String): Double = js.native
  
  @JSGlobal("KSR.textops.set_body_multipart_content")
  @js.native
  def setBodyMultipartContent(nbody: String, ctype: String): Double = js.native
  
  @JSGlobal("KSR.textops.set_body_multipart_mode")
  @js.native
  def setBodyMultipartMode(): Double = js.native
  
  @JSGlobal("KSR.textops.set_reply_body")
  @js.native
  def setReplyBody(nb: String, nc: String): Double = js.native
  
  @JSGlobal("KSR.textops.starts_with")
  @js.native
  def startsWith(s1: String, s2: String): Double = js.native
  
  @JSGlobal("KSR.textops.subst")
  @js.native
  def subst(subst: String): Double = js.native
  
  @JSGlobal("KSR.textops.subst_body")
  @js.native
  def substBody(subst: String): Double = js.native
  
  @JSGlobal("KSR.textops.subst_hf")
  @js.native
  def substHf(hname: String, subst: String, flags: String): Double = js.native
  
  @JSGlobal("KSR.textops.subst_uri")
  @js.native
  def substUri(subst: String): Double = js.native
  
  @JSGlobal("KSR.textops.subst_user")
  @js.native
  def substUser(subst: String): Double = js.native
}
