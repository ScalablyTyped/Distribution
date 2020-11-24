package typings.jose.anon

import typings.jose.joseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jose.jose.JWS.VerifyOptions & {  complete :true} */
@js.native
trait VerifyOptionscompletetrue extends js.Object {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  var complete: js.UndefOr[Boolean] with `true` = js.native
  
  var crit: js.UndefOr[js.Array[String]] = js.native
}
object VerifyOptionscompletetrue {
  
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] with `true`): VerifyOptionscompletetrue = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptionscompletetrue]
  }
  
  @scala.inline
  implicit class VerifyOptionscompletetrueOps[Self <: VerifyOptionscompletetrue] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    
    @scala.inline
    def setCrit(value: js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrit: Self = this.set("crit", js.undefined)
  }
}
