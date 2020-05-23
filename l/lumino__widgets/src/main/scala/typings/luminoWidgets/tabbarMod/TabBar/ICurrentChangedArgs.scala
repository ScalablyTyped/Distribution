package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
trait ICurrentChangedArgs[T] extends js.Object {
  /**
    * The currently selected index.
    */
  val currentIndex: Double
  /**
    * The currently selected title.
    */
  val currentTitle: Title[T] | Null
  /**
    * The previously selected index.
    */
  val previousIndex: Double
  /**
    * The previously selected title.
    */
  val previousTitle: Title[T] | Null
}

object ICurrentChangedArgs {
  @scala.inline
  def apply[T](
    currentIndex: Double,
    previousIndex: Double,
    currentTitle: Title[T] = null,
    previousTitle: Title[T] = null
  ): ICurrentChangedArgs[T] = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], currentTitle = currentTitle.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentChangedArgs[T]]
  }
}

