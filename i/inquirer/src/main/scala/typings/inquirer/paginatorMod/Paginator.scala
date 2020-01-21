package typings.inquirer.paginatorMod

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
  var screen: typings.inquirer.screenManagerMod.^
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
    screen: typings.inquirer.screenManagerMod.^
  ): Paginator = {
    val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], paginate = js.Any.fromFunction2(paginate), pointer = pointer.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Paginator]
  }
}

