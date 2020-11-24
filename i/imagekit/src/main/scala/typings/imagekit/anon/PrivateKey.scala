package typings.imagekit.anon

import typings.imagekit.mod.global.ImageKit.TransformationPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKey extends js.Object {
  
  var privateKey: String = js.native
  
  var publicKey: String = js.native
  
  var transformationPosition: js.UndefOr[TransformationPosition] = js.native
  
  var urlEndpoint: String = js.native
}
object PrivateKey {
  
  @scala.inline
  def apply(privateKey: String, publicKey: String, urlEndpoint: String): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], urlEndpoint = urlEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
    
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
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlEndpoint(value: String): Self = this.set("urlEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationPosition(value: TransformationPosition): Self = this.set("transformationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformationPosition: Self = this.set("transformationPosition", js.undefined)
  }
}
