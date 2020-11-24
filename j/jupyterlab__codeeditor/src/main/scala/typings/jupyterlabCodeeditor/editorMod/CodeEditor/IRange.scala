package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range.
  */
@js.native
trait IRange extends JSONObject {
  
  /**
    * The position of the last character in the current range.
    *
    * #### Notes
    * If this position is less than [start] then the range is considered
    * to be backward.
    */
  val end: IPosition = js.native
  
  /**
    * The position of the first character in the current range.
    *
    * #### Notes
    * If this position is greater than [end] then the range is considered
    * to be backward.
    */
  val start: IPosition = js.native
}
object IRange {
  
  @scala.inline
  def apply(end: IPosition, start: IPosition): IRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  
  @scala.inline
  implicit class IRangeOps[Self <: IRange] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: IPosition): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IPosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
