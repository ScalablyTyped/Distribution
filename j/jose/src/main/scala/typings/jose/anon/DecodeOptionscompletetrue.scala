package typings.jose.anon

import typings.jose.joseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jose.jose.JWT.DecodeOptions & {  complete :true} */
@js.native
trait DecodeOptionscompletetrue extends js.Object {
  
  var complete: js.UndefOr[Boolean] with `true` = js.native
}
object DecodeOptionscompletetrue {
  
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] with `true`): DecodeOptionscompletetrue = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptionscompletetrue]
  }
  
  @scala.inline
  implicit class DecodeOptionscompletetrueOps[Self <: DecodeOptionscompletetrue] (val x: Self) extends AnyVal {
    
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
  }
}
