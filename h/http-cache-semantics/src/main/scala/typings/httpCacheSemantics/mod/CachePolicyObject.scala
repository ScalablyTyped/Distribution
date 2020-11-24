package typings.httpCacheSemantics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicyObject extends js.Object {
  
  var a: Boolean = js.native
  
  var ch: Double = js.native
  
  var h: js.UndefOr[String] = js.native
  
  var imm: Double = js.native
  
  var m: String = js.native
  
  var reqcc: StringDictionary[String] = js.native
  
  var reqh: Headers | Null = js.native
  
  var rescc: StringDictionary[String] = js.native
  
  var resh: Headers = js.native
  
  var sh: Boolean = js.native
  
  var st: Double = js.native
  
  var t: Double = js.native
  
  var u: js.UndefOr[String] = js.native
  
  var v: Double = js.native
}
object CachePolicyObject {
  
  @scala.inline
  def apply(
    a: Boolean,
    ch: Double,
    imm: Double,
    m: String,
    reqcc: StringDictionary[String],
    rescc: StringDictionary[String],
    resh: Headers,
    sh: Boolean,
    st: Double,
    t: Double,
    v: Double
  ): CachePolicyObject = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], ch = ch.asInstanceOf[js.Any], imm = imm.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], reqcc = reqcc.asInstanceOf[js.Any], rescc = rescc.asInstanceOf[js.Any], resh = resh.asInstanceOf[js.Any], sh = sh.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyObject]
  }
  
  @scala.inline
  implicit class CachePolicyObjectOps[Self <: CachePolicyObject] (val x: Self) extends AnyVal {
    
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
    def setA(value: Boolean): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCh(value: Double): Self = this.set("ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImm(value: Double): Self = this.set("imm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: String): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqcc(value: StringDictionary[String]): Self = this.set("reqcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRescc(value: StringDictionary[String]): Self = this.set("rescc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResh(value: Headers): Self = this.set("resh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSh(value: Boolean): Self = this.set("sh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSt(value: Double): Self = this.set("st", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: String): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setReqh(value: Headers): Self = this.set("reqh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqhNull: Self = this.set("reqh", null)
    
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU: Self = this.set("u", js.undefined)
  }
}
