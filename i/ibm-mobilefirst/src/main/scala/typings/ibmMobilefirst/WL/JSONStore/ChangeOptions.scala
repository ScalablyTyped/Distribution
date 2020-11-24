package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeOptions extends Options {
  
  var addNew: js.UndefOr[Boolean] = js.native
  
  var markDirty: js.UndefOr[Boolean] = js.native
  
  var replaceCriteria: js.UndefOr[js.Array[String]] = js.native
}
object ChangeOptions {
  
  @scala.inline
  def apply(): ChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeOptions]
  }
  
  @scala.inline
  implicit class ChangeOptionsOps[Self <: ChangeOptions] (val x: Self) extends AnyVal {
    
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
    def setAddNew(value: Boolean): Self = this.set("addNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNew: Self = this.set("addNew", js.undefined)
    
    @scala.inline
    def setMarkDirty(value: Boolean): Self = this.set("markDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkDirty: Self = this.set("markDirty", js.undefined)
    
    @scala.inline
    def setReplaceCriteriaVarargs(value: String*): Self = this.set("replaceCriteria", js.Array(value :_*))
    
    @scala.inline
    def setReplaceCriteria(value: js.Array[String]): Self = this.set("replaceCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceCriteria: Self = this.set("replaceCriteria", js.undefined)
  }
}
