package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Md2 extends js.Object {
  
  var md2: String = js.native
  
  var md5: String = js.native
  
  var ripemd160: String = js.native
  
  var sha1: String = js.native
  
  var sha224: String = js.native
  
  var sha256: String = js.native
  
  var sha384: String = js.native
  
  var sha512: String = js.native
}
object Md2 {
  
  @scala.inline
  def apply(
    md2: String,
    md5: String,
    ripemd160: String,
    sha1: String,
    sha224: String,
    sha256: String,
    sha384: String,
    sha512: String
  ): Md2 = {
    val __obj = js.Dynamic.literal(md2 = md2.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], ripemd160 = ripemd160.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha224 = sha224.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md2]
  }
  
  @scala.inline
  implicit class Md2Ops[Self <: Md2] (val x: Self) extends AnyVal {
    
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
    def setMd2(value: String): Self = this.set("md2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRipemd160(value: String): Self = this.set("ripemd160", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha224(value: String): Self = this.set("sha224", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha384(value: String): Self = this.set("sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512(value: String): Self = this.set("sha512", value.asInstanceOf[js.Any])
  }
}
