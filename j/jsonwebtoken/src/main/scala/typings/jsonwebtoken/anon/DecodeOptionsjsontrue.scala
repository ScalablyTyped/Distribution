package typings.jsonwebtoken.anon

import typings.jsonwebtoken.jsonwebtokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json :true} */
@js.native
trait DecodeOptionsjsontrue extends js.Object {
  
  var complete: js.UndefOr[Boolean] = js.native
  
  var json: js.UndefOr[Boolean] with `true` = js.native
}
object DecodeOptionsjsontrue {
  
  @scala.inline
  def apply(json: js.UndefOr[Boolean] with `true`): DecodeOptionsjsontrue = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptionsjsontrue]
  }
  
  @scala.inline
  implicit class DecodeOptionsjsontrueOps[Self <: DecodeOptionsjsontrue] (val x: Self) extends AnyVal {
    
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
    def setJson(value: js.UndefOr[Boolean] with `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
  }
}
