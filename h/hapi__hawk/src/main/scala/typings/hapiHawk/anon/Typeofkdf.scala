package typings.hapiHawk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofkdf extends js.Object {
  
  /**
    * OpenSSL key derivation function.
    */
  val OpenSSL: Execute = js.native
}
object Typeofkdf {
  
  @scala.inline
  def apply(OpenSSL: Execute): Typeofkdf = {
    val __obj = js.Dynamic.literal(OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofkdf]
  }
  
  @scala.inline
  implicit class TypeofkdfOps[Self <: Typeofkdf] (val x: Self) extends AnyVal {
    
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
    def setOpenSSL(value: Execute): Self = this.set("OpenSSL", value.asInstanceOf[js.Any])
  }
}
