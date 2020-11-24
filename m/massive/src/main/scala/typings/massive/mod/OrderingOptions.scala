package typings.massive.mod

import typings.massive.massiveStrings.ASC
import typings.massive.massiveStrings.DESC
import typings.massive.massiveStrings.FIRST
import typings.massive.massiveStrings.LAST
import typings.massive.massiveStrings.asc_
import typings.massive.massiveStrings.desc_
import typings.massive.massiveStrings.first_
import typings.massive.massiveStrings.last_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderingOptions extends js.Object {
  
  var direction: js.UndefOr[ASC | asc_ | DESC | desc_] = js.native
  
  var expr: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var nulls: js.UndefOr[FIRST | first_ | LAST | last_] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OrderingOptions {
  
  @scala.inline
  def apply(): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderingOptions]
  }
  
  @scala.inline
  implicit class OrderingOptionsOps[Self <: OrderingOptions] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: ASC | asc_ | DESC | desc_): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setExpr(value: String): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpr: Self = this.set("expr", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setNulls(value: FIRST | first_ | LAST | last_): Self = this.set("nulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNulls: Self = this.set("nulls", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
