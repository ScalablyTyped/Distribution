package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.o
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasDefaultDescription extends js.Object {
  
  val alias: o = js.native
  
  val default: js.UndefOr[scala.Nothing] = js.native
  
  val description: java.lang.String = js.native
  
  val `type`: boolean = js.native
}
object AliasDefaultDescription {
  
  @scala.inline
  def apply(alias: o, description: java.lang.String, `type`: boolean): AliasDefaultDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultDescription]
  }
  
  @scala.inline
  implicit class AliasDefaultDescriptionOps[Self <: AliasDefaultDescription] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: o): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
