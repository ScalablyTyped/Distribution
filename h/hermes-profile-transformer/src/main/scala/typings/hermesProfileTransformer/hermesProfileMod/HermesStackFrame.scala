package typings.hermesProfileTransformer.hermesProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HermesStackFrame extends js.Object {
  
  var category: String = js.native
  
  var column: String = js.native
  
  var funcColumn: String = js.native
  
  var funcLine: String = js.native
  
  var line: String = js.native
  
  var name: String = js.native
  
  /**
    * A parent function may or may not exist
    */
  var parent: js.UndefOr[Double] = js.native
}
object HermesStackFrame {
  
  @scala.inline
  def apply(category: String, column: String, funcColumn: String, funcLine: String, line: String, name: String): HermesStackFrame = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], funcColumn = funcColumn.asInstanceOf[js.Any], funcLine = funcLine.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HermesStackFrame]
  }
  
  @scala.inline
  implicit class HermesStackFrameOps[Self <: HermesStackFrame] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncColumn(value: String): Self = this.set("funcColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncLine(value: String): Self = this.set("funcLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Double): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
