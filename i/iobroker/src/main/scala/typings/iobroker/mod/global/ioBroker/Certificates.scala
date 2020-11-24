package typings.iobroker.mod.global.ioBroker

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificates extends js.Object {
  
  /** chained CA certificates */
  var ca: js.Array[String | Buffer] = js.native
  
  /** public certificate */
  var cert: String | Buffer = js.native
  
  /** private key file */
  var key: String | Buffer = js.native
}
object Certificates {
  
  @scala.inline
  def apply(ca: js.Array[String | Buffer], cert: String | Buffer, key: String | Buffer): Certificates = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificates]
  }
  
  @scala.inline
  implicit class CertificatesOps[Self <: Certificates] (val x: Self) extends AnyVal {
    
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
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: js.Array[String | Buffer]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
