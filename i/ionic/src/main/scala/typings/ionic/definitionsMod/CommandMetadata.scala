package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.global
import typings.ionic.ionicStrings.project
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandMetadata
  extends typings.ionicCliFramework.definitionsMod.CommandMetadata[CommandMetadataInput, CommandMetadataOption] {
  
  var `type`: global | project = js.native
}
object CommandMetadata {
  
  @scala.inline
  def apply(name: String, summary: String, `type`: global | project): CommandMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata]
  }
  
  @scala.inline
  implicit class CommandMetadataOps[Self <: CommandMetadata] (val x: Self) extends AnyVal {
    
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
    def setType(value: global | project): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
