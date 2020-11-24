package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalData extends js.Object {
  
  var localData: String = js.native
}
object LocalData {
  
  @scala.inline
  def apply(localData: String): LocalData = {
    val __obj = js.Dynamic.literal(localData = localData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalData]
  }
  
  @scala.inline
  implicit class LocalDataOps[Self <: LocalData] (val x: Self) extends AnyVal {
    
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
    def setLocalData(value: String): Self = this.set("localData", value.asInstanceOf[js.Any])
  }
}
