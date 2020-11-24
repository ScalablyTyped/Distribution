package typings.luminoDatagrid.sectionlistMod.SectionList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a section list.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The size of new sections added to the list.
    */
  var defaultSize: Double = js.native
}
object IOptions {
  
  @scala.inline
  def apply(defaultSize: Double): IOptions = {
    val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultSize(value: Double): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
  }
}
