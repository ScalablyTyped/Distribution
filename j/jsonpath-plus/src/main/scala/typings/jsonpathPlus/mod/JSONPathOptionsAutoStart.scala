package typings.jsonpathPlus.mod

import typings.jsonpathPlus.jsonpathPlusBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONPathOptionsAutoStart extends JSONPathOptions {
  
  @JSName("autostart")
  var autostart_JSONPathOptionsAutoStart: `false` = js.native
}
object JSONPathOptionsAutoStart {
  
  @scala.inline
  def apply(autostart: `false`, path: String | js.Array[_]): JSONPathOptionsAutoStart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPathOptionsAutoStart]
  }
  
  @scala.inline
  implicit class JSONPathOptionsAutoStartOps[Self <: JSONPathOptionsAutoStart] (val x: Self) extends AnyVal {
    
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
    def setAutostart(value: `false`): Self = this.set("autostart", value.asInstanceOf[js.Any])
  }
}
