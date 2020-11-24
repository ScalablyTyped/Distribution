package typings.jupyterlabCompleter.widgetMod.Completer

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a completion request reflecting the state of the editor.
  */
@js.native
trait ITextState extends JSONObject {
  
  /**
    * The width of a character in the editor.
    */
  val charWidth: Double = js.native
  
  /**
    * The character number of the editor cursor within a line.
    */
  val column: Double = js.native
  
  /**
    * The line number of the editor cursor.
    */
  val line: Double = js.native
  
  /**
    * The height of a character in the editor.
    */
  val lineHeight: Double = js.native
  
  /**
    * The current value of the editor.
    */
  val text: String = js.native
}
object ITextState {
  
  @scala.inline
  def apply(charWidth: Double, column: Double, line: Double, lineHeight: Double, text: String): ITextState = {
    val __obj = js.Dynamic.literal(charWidth = charWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextState]
  }
  
  @scala.inline
  implicit class ITextStateOps[Self <: ITextState] (val x: Self) extends AnyVal {
    
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
    def setCharWidth(value: Double): Self = this.set("charWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
