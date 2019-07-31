package typings.inquirer.libUtilsPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to draw paginated content using a `ScreenManager`.
  */
trait Paginator extends js.Object {
  /**
    * Gets or sets the index of the last focused line.
    */
  var lastIndex: Double
  /**
    * Gets or sets the index of the currently focused line.
    */
  var pointer: Double
  /**
    * Gets or sets an object for drawing the paginated content.
    */
  var screen: typings.inquirer.libUtilsScreenDashManagerMod.^
  /**
    * Paginates the specified `content`.
    *
    * @param content
    * The content to paginate.
    *
    * @param selectedIndex
    * The number of the selected line.
    *
    * @returns
    * The paginated content.
    */
  def paginate(content: String, selectedIndex: Double): String
}

object Paginator {
  @scala.inline
  def apply(
    lastIndex: Double,
    paginate: (String, Double) => String,
    pointer: Double,
    screen: typings.inquirer.libUtilsScreenDashManagerMod.^
  ): Paginator = {
    val __obj = js.Dynamic.literal(lastIndex = lastIndex, paginate = js.Any.fromFunction2(paginate), pointer = pointer, screen = screen)
  
    __obj.asInstanceOf[Paginator]
  }
}

