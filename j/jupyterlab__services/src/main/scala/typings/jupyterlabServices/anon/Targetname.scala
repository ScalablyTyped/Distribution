package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targetname extends js.Object {
  
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.native
}
object Targetname {
  
  @scala.inline
  def apply(): Targetname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targetname]
  }
  
  @scala.inline
  implicit class TargetnameOps[Self <: Targetname] (val x: Self) extends AnyVal {
    
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
    def setTarget_name(value: String): Self = this.set("target_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_name: Self = this.set("target_name", js.undefined)
  }
}
