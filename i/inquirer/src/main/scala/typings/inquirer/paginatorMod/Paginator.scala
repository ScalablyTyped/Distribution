package typings.inquirer.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to draw paginated content using a `ScreenManager`.
  */
@js.native
trait Paginator extends js.Object {
  
  /**
    * Gets or sets the index of the last focused line.
    */
  var lastIndex: Double = js.native
  
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
  def paginate(content: String, selectedIndex: Double): String = js.native
  
  /**
    * Gets or sets the index of the currently focused line.
    */
  var pointer: Double = js.native
  
  /**
    * Gets or sets an object for drawing the paginated content.
    */
  var screen: typings.inquirer.screenManagerMod.^ = js.native
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
  
  @scala.inline
  implicit class PaginatorOps[Self <: Paginator] (val x: Self) extends AnyVal {
    
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
    def setLastIndex(value: Double): Self = this.set("lastIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginate(value: (String, Double) => String): Self = this.set("paginate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointer(value: Double): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: typings.inquirer.screenManagerMod.^): Self = this.set("screen", value.asInstanceOf[js.Any])
  }
}
