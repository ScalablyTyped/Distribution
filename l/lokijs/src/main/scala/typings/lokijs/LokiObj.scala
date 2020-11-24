package typings.lokijs

import typings.lokijs.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiObj extends js.Object {
  
  @JSName("$loki")
  var $loki: Double = js.native
  
  var meta: Created = js.native
}
object LokiObj {
  
  @scala.inline
  def apply($loki: Double, meta: Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiObj]
  }
  
  @scala.inline
  implicit class LokiObjOps[Self <: LokiObj] (val x: Self) extends AnyVal {
    
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
    def set$loki(value: Double): Self = this.set("$loki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Created): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
