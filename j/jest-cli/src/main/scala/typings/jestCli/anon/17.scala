package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.`Add GraveaccentlocationGraveaccent information to the test results`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends js.Object {
  
  val default: `false` = js.native
  
  val description: `Add GraveaccentlocationGraveaccent information to the test results` = js.native
  
  val `type`: boolean = js.native
}
object `17` {
  
  @scala.inline
  def apply(
    default: `false`,
    description: `Add GraveaccentlocationGraveaccent information to the test results`,
    `type`: boolean
  ): `17` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17Ops`[Self <: `17`] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: `false`): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: `Add GraveaccentlocationGraveaccent information to the test results`): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
