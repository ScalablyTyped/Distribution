package typings.luminoWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for the `open` method on a menu.
  */
@js.native
trait IOpenOptions extends js.Object {
  
  /**
    * Whether to force the X position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * X coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceX: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to force the Y position of the menu.
    *
    * Setting to `true` will disable the logic which repositions the
    * Y coordinate of the menu if it will not fit entirely on screen.
    *
    * The default is `false`.
    */
  var forceY: js.UndefOr[Boolean] = js.native
}
object IOpenOptions {
  
  @scala.inline
  def apply(): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenOptions]
  }
  
  @scala.inline
  implicit class IOpenOptionsOps[Self <: IOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setForceX(value: Boolean): Self = this.set("forceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceX: Self = this.set("forceX", js.undefined)
    
    @scala.inline
    def setForceY(value: Boolean): Self = this.set("forceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceY: Self = this.set("forceY", js.undefined)
  }
}
