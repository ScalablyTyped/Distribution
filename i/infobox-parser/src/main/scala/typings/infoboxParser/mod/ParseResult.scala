package typings.infoboxParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseResult extends js.Object {
  
  var general: js.Any = js.native
  
  var lists: js.Array[_] = js.native
  
  var tables: js.Array[_] = js.native
}
object ParseResult {
  
  @scala.inline
  def apply(general: js.Any, lists: js.Array[_], tables: js.Array[_]): ParseResult = {
    val __obj = js.Dynamic.literal(general = general.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    
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
    def setGeneral(value: js.Any): Self = this.set("general", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: js.Any*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[_]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: js.Any*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[_]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
}
