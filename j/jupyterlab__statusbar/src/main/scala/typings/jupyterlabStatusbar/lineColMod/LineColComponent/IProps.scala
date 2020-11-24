package typings.jupyterlabStatusbar.lineColMod.LineColComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Props for LineColComponent.
  */
@js.native
trait IProps extends js.Object {
  
  /**
    * The current column number.
    */
  var column: Double = js.native
  
  /**
    * A click handler for the LineColComponent, which
    * we use to launch the LineFormComponent.
    */
  def handleClick(): Unit = js.native
  
  /**
    * The current line number.
    */
  var line: Double = js.native
}
object IProps {
  
  @scala.inline
  def apply(column: Double, handleClick: () => Unit, line: Double): IProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handleClick = js.Any.fromFunction0(handleClick), line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
  
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    
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
    def setHandleClick(value: () => Unit): Self = this.set("handleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
  }
}
