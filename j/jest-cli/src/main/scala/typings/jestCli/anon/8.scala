package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.`Will not fail if no tests are found Leftparenthesisfor example while using Graveaccent--testPathPatternGraveaccentDotRightparenthesis`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends js.Object {
  
  val default: `false` = js.native
  
  val description: `Will not fail if no tests are found Leftparenthesisfor example while using Graveaccent--testPathPatternGraveaccentDotRightparenthesis` = js.native
  
  val `type`: boolean = js.native
}
object `8` {
  
  @scala.inline
  def apply(
    default: `false`,
    description: `Will not fail if no tests are found Leftparenthesisfor example while using Graveaccent--testPathPatternGraveaccentDotRightparenthesis`,
    `type`: boolean
  ): `8` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
    
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
    def setDescription(
      value: `Will not fail if no tests are found Leftparenthesisfor example while using Graveaccent--testPathPatternGraveaccentDotRightparenthesis`
    ): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
