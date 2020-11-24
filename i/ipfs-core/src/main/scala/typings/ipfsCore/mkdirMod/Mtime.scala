package typings.ipfsCore.mkdirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mtime extends js.Object {
  
  var nsecs: js.UndefOr[Double] = js.native
  
  var secs: js.UndefOr[Double] = js.native
}
object Mtime {
  
  @scala.inline
  def apply(): Mtime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mtime]
  }
  
  @scala.inline
  implicit class MtimeOps[Self <: Mtime] (val x: Self) extends AnyVal {
    
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
    def setNsecs(value: Double): Self = this.set("nsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsecs: Self = this.set("nsecs", js.undefined)
    
    @scala.inline
    def setSecs(value: Double): Self = this.set("secs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecs: Self = this.set("secs", js.undefined)
  }
}
