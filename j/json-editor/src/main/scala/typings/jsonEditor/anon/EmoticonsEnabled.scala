package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmoticonsEnabled extends js.Object {
  
  var emoticonsEnabled: Boolean = js.native
}
object EmoticonsEnabled {
  
  @scala.inline
  def apply(emoticonsEnabled: Boolean): EmoticonsEnabled = {
    val __obj = js.Dynamic.literal(emoticonsEnabled = emoticonsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmoticonsEnabled]
  }
  
  @scala.inline
  implicit class EmoticonsEnabledOps[Self <: EmoticonsEnabled] (val x: Self) extends AnyVal {
    
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
    def setEmoticonsEnabled(value: Boolean): Self = this.set("emoticonsEnabled", value.asInstanceOf[js.Any])
  }
}
