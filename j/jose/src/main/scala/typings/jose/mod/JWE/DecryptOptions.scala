package typings.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptOptions extends js.Object {
  
  var complete: js.UndefOr[Boolean] = js.native
  
  var contentEncryptionAlgorithms: js.UndefOr[js.Array[String]] = js.native
  
  var crit: js.UndefOr[js.Array[String]] = js.native
  
  var keyManagementAlgorithms: js.UndefOr[js.Array[String]] = js.native
}
object DecryptOptions {
  
  @scala.inline
  def apply(): DecryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptOptions]
  }
  
  @scala.inline
  implicit class DecryptOptionsOps[Self <: DecryptOptions] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setContentEncryptionAlgorithmsVarargs(value: String*): Self = this.set("contentEncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setContentEncryptionAlgorithms(value: js.Array[String]): Self = this.set("contentEncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncryptionAlgorithms: Self = this.set("contentEncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    
    @scala.inline
    def setCrit(value: js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrit: Self = this.set("crit", js.undefined)
    
    @scala.inline
    def setKeyManagementAlgorithmsVarargs(value: String*): Self = this.set("keyManagementAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setKeyManagementAlgorithms(value: js.Array[String]): Self = this.set("keyManagementAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyManagementAlgorithms: Self = this.set("keyManagementAlgorithms", js.undefined)
  }
}
