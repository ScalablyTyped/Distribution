package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single menu command that is part of a Contact.
  */
@js.native
trait SchemaCommand extends js.Object {
  
  /**
    * The type of operation this command corresponds to. Allowed values are: -
    * TAKE_A_NOTE - Shares a timeline item with the transcription of user
    * speech from the &quot;Take a note&quot; voice menu command.   -
    * POST_AN_UPDATE - Shares a timeline item with the transcription of user
    * speech from the &quot;Post an update&quot; voice menu command.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaCommand {
  
  @scala.inline
  def apply(): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommand]
  }
  
  @scala.inline
  implicit class SchemaCommandOps[Self <: SchemaCommand] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
