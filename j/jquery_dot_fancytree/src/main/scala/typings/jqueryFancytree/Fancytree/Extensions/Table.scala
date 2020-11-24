package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define table-extension options
  */
@js.native
trait Table
  extends /* extension */ StringDictionary[js.Any] {
  
  /**
    * Render the checkboxes into the this column index (default: nodeColumnIdx)
    */
  var checkboxColumnIdx: js.Any = js.native
  
  /**
    * Indent every node level by 16px; default: 16
    */
  var indentation: Double = js.native
  
  /**
    * Render node expander, icon, and title to this column (default: 0)
    */
  var nodeColumnIdx: Double = js.native
}
object Table {
  
  @scala.inline
  def apply(checkboxColumnIdx: js.Any, indentation: Double, nodeColumnIdx: Double): Table = {
    val __obj = js.Dynamic.literal(checkboxColumnIdx = checkboxColumnIdx.asInstanceOf[js.Any], indentation = indentation.asInstanceOf[js.Any], nodeColumnIdx = nodeColumnIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
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
    def setCheckboxColumnIdx(value: js.Any): Self = this.set("checkboxColumnIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentation(value: Double): Self = this.set("indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeColumnIdx(value: Double): Self = this.set("nodeColumnIdx", value.asInstanceOf[js.Any])
  }
}
