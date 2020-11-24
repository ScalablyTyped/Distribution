package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Print the version and exit`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasDefaultUndefinedDescription extends js.Object {
  
  val alias: v = js.native
  
  val default: js.UndefOr[scala.Nothing] = js.native
  
  val description: `Print the version and exit` = js.native
  
  val `type`: boolean = js.native
}
object AliasDefaultUndefinedDescription {
  
  @scala.inline
  def apply(alias: v, description: `Print the version and exit`, `type`: boolean): AliasDefaultUndefinedDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultUndefinedDescription]
  }
  
  @scala.inline
  implicit class AliasDefaultUndefinedDescriptionOps[Self <: AliasDefaultUndefinedDescription] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: v): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: `Print the version and exit`): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
