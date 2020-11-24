package typings.imagekit.mod.global.ImageKit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkDeleteFilesError extends Error {
  
  var help: String = js.native
  
  var missingFileIds: js.Array[String] = js.native
}
object BulkDeleteFilesError {
  
  @scala.inline
  def apply(help: String, message: String, missingFileIds: js.Array[String], name: String): BulkDeleteFilesError = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], missingFileIds = missingFileIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDeleteFilesError]
  }
  
  @scala.inline
  implicit class BulkDeleteFilesErrorOps[Self <: BulkDeleteFilesError] (val x: Self) extends AnyVal {
    
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
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingFileIdsVarargs(value: String*): Self = this.set("missingFileIds", js.Array(value :_*))
    
    @scala.inline
    def setMissingFileIds(value: js.Array[String]): Self = this.set("missingFileIds", value.asInstanceOf[js.Any])
  }
}
