package typings.jupyterlabApplication.tokensMod.IRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options passed into a navigation request.
  */
@js.native
trait INavOptions extends js.Object {
  
  /**
    * Whether the navigation should be hard URL change instead of an HTML
    * history API change.
    */
  var hard: js.UndefOr[Boolean] = js.native
}
object INavOptions {
  
  @scala.inline
  def apply(): INavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavOptions]
  }
  
  @scala.inline
  implicit class INavOptionsOps[Self <: INavOptions] (val x: Self) extends AnyVal {
    
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
    def setHard(value: Boolean): Self = this.set("hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHard: Self = this.set("hard", js.undefined)
  }
}
