package typings.iobroker.mod.global.ioBroker

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificates extends StObject {
  
  /** chained CA certificates */
  var ca: js.Array[String | Buffer]
  
  /** public certificate */
  var cert: String | Buffer
  
  /** private key file */
  var key: String | Buffer
}
object Certificates {
  
  @scala.inline
  def apply(ca: js.Array[String | Buffer], cert: String | Buffer, key: String | Buffer): Certificates = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificates]
  }
  
  @scala.inline
  implicit class CertificatesMutableBuilder[Self <: Certificates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: js.Array[String | Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
