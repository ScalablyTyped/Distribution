package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavbarOptions extends js.Object {
  
  /**
    * Whether or not to add a navbar above the panels.
    * Default: true
    */
  var add: js.UndefOr[Boolean] = js.native
  
  /**
    * The title above the main panel.
    * Default: "Menu"
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of link to set for the title.
    * Possible values: "parent", "anchor" or "none".
    * Default: "parent"
    */
  var titleLink: js.UndefOr[String] = js.native
}
object NavbarOptions {
  
  @scala.inline
  def apply(): NavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarOptions]
  }
  
  @scala.inline
  implicit class NavbarOptionsOps[Self <: NavbarOptions] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleLink(value: String): Self = this.set("titleLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLink: Self = this.set("titleLink", js.undefined)
  }
}
