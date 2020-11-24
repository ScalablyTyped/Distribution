package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Print debugging info about your jest configDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultUndefined extends js.Object {
  
  val default: js.UndefOr[scala.Nothing] = js.native
  
  val description: `Print debugging info about your jest configDot` = js.native
  
  val `type`: boolean = js.native
}
object DefaultUndefined {
  
  @scala.inline
  def apply(description: `Print debugging info about your jest configDot`, `type`: boolean): DefaultUndefined = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefined]
  }
  
  @scala.inline
  implicit class DefaultUndefinedOps[Self <: DefaultUndefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: `Print debugging info about your jest configDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
