package typings.inquirer.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to draw paginated content using a `ScreenManager`.
  */
@JSImport("inquirer/lib/utils/paginator", JSImport.Namespace)
@js.native
class ^ protected () extends Paginator {
  /**
    * Initializes a new instance of the `Paginator` class.
    *
    * @param screenManager
    * A screen-manager for drawing the paginated content.
    */
  def this(screenManager: typings.inquirer.screenManagerMod.^) = this()
  /**
    * Gets or sets the index of the last focused line.
    */
  /* CompleteClass */
  override var lastIndex: Double = js.native
  /**
    * Gets or sets the index of the currently focused line.
    */
  /* CompleteClass */
  override var pointer: Double = js.native
  /**
    * Gets or sets an object for drawing the paginated content.
    */
  /* CompleteClass */
  override var screen: typings.inquirer.screenManagerMod.^ = js.native
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
  /* CompleteClass */
  override def paginate(content: String, selectedIndex: Double): String = js.native
}

