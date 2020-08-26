package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
@js.native
trait ICurrentChangedArgs[T] extends js.Object {
  /**
    * The currently selected index.
    */
  val currentIndex: Double = js.native
  /**
    * The currently selected title.
    */
  val currentTitle: Title[T] | Null = js.native
  /**
    * The previously selected index.
    */
  val previousIndex: Double = js.native
  /**
    * The previously selected title.
    */
  val previousTitle: Title[T] | Null = js.native
}

object ICurrentChangedArgs {
  @scala.inline
  def apply[T](currentIndex: Double, previousIndex: Double): ICurrentChangedArgs[T] = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentChangedArgs[T]]
  }
  @scala.inline
  implicit class ICurrentChangedArgsOps[Self <: ICurrentChangedArgs[_], T] (val x: Self with ICurrentChangedArgs[T]) extends AnyVal {
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
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousIndex(value: Double): Self = this.set("previousIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTitle(value: Title[T]): Self = this.set("currentTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTitleNull: Self = this.set("currentTitle", null)
    @scala.inline
    def setPreviousTitle(value: Title[T]): Self = this.set("previousTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousTitleNull: Self = this.set("previousTitle", null)
  }
  
}

