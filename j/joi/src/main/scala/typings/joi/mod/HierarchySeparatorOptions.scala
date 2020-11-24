package typings.joi.mod

import typings.joi.joiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchySeparatorOptions extends js.Object {
  
  /**
    * overrides the default `.` hierarchy separator. Set to false to treat the key as a literal value.
    *
    * @default '.'
    */
  var separator: js.UndefOr[String | `false`] = js.native
}
object HierarchySeparatorOptions {
  
  @scala.inline
  def apply(): HierarchySeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchySeparatorOptions]
  }
  
  @scala.inline
  implicit class HierarchySeparatorOptionsOps[Self <: HierarchySeparatorOptions] (val x: Self) extends AnyVal {
    
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
    def setSeparator(value: String | `false`): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
