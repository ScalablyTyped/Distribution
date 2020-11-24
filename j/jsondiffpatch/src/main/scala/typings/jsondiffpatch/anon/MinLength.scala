package typings.jsondiffpatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinLength extends js.Object {
  
  // default 60, minimum string length (left and right sides) to use text diff algorythm: google-diff-match-patch
  var minLength: Double = js.native
}
object MinLength {
  
  @scala.inline
  def apply(minLength: Double): MinLength = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinLength]
  }
  
  @scala.inline
  implicit class MinLengthOps[Self <: MinLength] (val x: Self) extends AnyVal {
    
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
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
  }
}
