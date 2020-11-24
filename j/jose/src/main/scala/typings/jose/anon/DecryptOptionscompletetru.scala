package typings.jose.anon

import typings.jose.joseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jose.jose.JWE.DecryptOptions & {  complete :true} */
@js.native
trait DecryptOptionscompletetru extends js.Object {
  
  var complete: js.UndefOr[Boolean] with `true` = js.native
  
  var contentEncryptionAlgorithms: js.UndefOr[js.Array[String]] = js.native
  
  var crit: js.UndefOr[js.Array[String]] = js.native
  
  var keyManagementAlgorithms: js.UndefOr[js.Array[String]] = js.native
}
object DecryptOptionscompletetru {
  
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] with `true`): DecryptOptionscompletetru = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionscompletetru]
  }
  
  @scala.inline
  implicit class DecryptOptionscompletetruOps[Self <: DecryptOptionscompletetru] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: js.UndefOr[Boolean] with `true`): Self = this.set("complete", value.asInstanceOf[js.Any])
    
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
