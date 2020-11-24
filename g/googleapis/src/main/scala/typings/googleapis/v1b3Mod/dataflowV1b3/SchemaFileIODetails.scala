package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a File connector used by the job.
  */
@js.native
trait SchemaFileIODetails extends js.Object {
  
  /**
    * File Pattern used to access files by the connector.
    */
  var filePattern: js.UndefOr[String] = js.native
}
object SchemaFileIODetails {
  
  @scala.inline
  def apply(): SchemaFileIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileIODetails]
  }
  
  @scala.inline
  implicit class SchemaFileIODetailsOps[Self <: SchemaFileIODetails] (val x: Self) extends AnyVal {
    
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
    def setFilePattern(value: String): Self = this.set("filePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePattern: Self = this.set("filePattern", js.undefined)
  }
}
