package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep
  extends /* key */ StringDictionary[js.Any] {
  
  var deep: js.UndefOr[Boolean] = js.native
  
  var parentRelative: js.UndefOr[Boolean] = js.native
}
object Deep {
  
  @scala.inline
  def apply(): Deep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deep]
  }
  
  @scala.inline
  implicit class DeepOps[Self <: Deep] (val x: Self) extends AnyVal {
    
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setParentRelative(value: Boolean): Self = this.set("parentRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentRelative: Self = this.set("parentRelative", js.undefined)
  }
}
