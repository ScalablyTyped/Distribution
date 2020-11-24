package typings.inquirer.mod.ui

import typings.inquirer.mod.StreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the bottom-bar UI.
  */
@js.native
trait BottomBarOptions extends StreamOptions {
  
  /**
    * The initial text to display.
    */
  var bottomBar: js.UndefOr[String] = js.native
}
object BottomBarOptions {
  
  @scala.inline
  def apply(): BottomBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomBarOptions]
  }
  
  @scala.inline
  implicit class BottomBarOptionsOps[Self <: BottomBarOptions] (val x: Self) extends AnyVal {
    
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
    def setBottomBar(value: String): Self = this.set("bottomBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBar: Self = this.set("bottomBar", js.undefined)
  }
}
