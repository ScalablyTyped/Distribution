package typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The props for TabSpaceComponent.
  */
@js.native
trait IProps extends js.Object {
  
  /**
    * A click handler for the TabSpace component. By default
    * opens a menu allowing the user to select tabs vs spaces.
    */
  def handleClick(): Unit = js.native
  
  /**
    * Whether to use spaces or tabs.
    */
  var isSpaces: Boolean = js.native
  
  /**
    * The number of spaces to insert on tab.
    */
  var tabSpace: Double = js.native
}
object IProps {
  
  @scala.inline
  def apply(handleClick: () => Unit, isSpaces: Boolean, tabSpace: Double): IProps = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), isSpaces = isSpaces.asInstanceOf[js.Any], tabSpace = tabSpace.asInstanceOf[js.Any])
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
    def setHandleClick(value: () => Unit): Self = this.set("handleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSpaces(value: Boolean): Self = this.set("isSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSpace(value: Double): Self = this.set("tabSpace", value.asInstanceOf[js.Any])
  }
}
