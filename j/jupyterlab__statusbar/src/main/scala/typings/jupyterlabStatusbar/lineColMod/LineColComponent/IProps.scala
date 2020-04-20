package typings.jupyterlabStatusbar.lineColMod.LineColComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for LineColComponent.
  */
trait IProps extends js.Object {
  /**
    * The current column number.
    */
  var column: Double
  /**
    * The current line number.
    */
  var line: Double
  /**
    * A click handler for the LineColComponent, which
    * we use to launch the LineFormComponent.
    */
  def handleClick(): Unit
}

object IProps {
  @scala.inline
  def apply(column: Double, handleClick: () => Unit, line: Double): IProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handleClick = js.Any.fromFunction0(handleClick), line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

