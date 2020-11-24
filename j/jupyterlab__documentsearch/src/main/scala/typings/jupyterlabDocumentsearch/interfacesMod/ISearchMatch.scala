package typings.jupyterlabDocumentsearch.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchMatch extends js.Object {
  
  /**
    * Column location of match
    */
  var column: Double = js.native
  
  /**
    * Fragment containing match
    */
  val fragment: String = js.native
  
  /**
    * Index among the other matches
    */
  var index: Double = js.native
  
  /**
    * Line number of match
    */
  var line: Double = js.native
  
  /**
    * Text of the exact match itself
    */
  val text: String = js.native
}
object ISearchMatch {
  
  @scala.inline
  def apply(column: Double, fragment: String, index: Double, line: Double, text: String): ISearchMatch = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatch]
  }
  
  @scala.inline
  implicit class ISearchMatchOps[Self <: ISearchMatch] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
