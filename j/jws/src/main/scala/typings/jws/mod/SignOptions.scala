package typings.jws.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends js.Object {
  
  var encoding: js.UndefOr[String | Buffer | Readable] = js.native
  
  var header: Header = js.native
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var key: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var payload: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var privateKey: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var secret: js.UndefOr[js.Any] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(header: Header): SignOptions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: Header): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String | Buffer | Readable): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: js.Any): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setSecret(value: js.Any): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
