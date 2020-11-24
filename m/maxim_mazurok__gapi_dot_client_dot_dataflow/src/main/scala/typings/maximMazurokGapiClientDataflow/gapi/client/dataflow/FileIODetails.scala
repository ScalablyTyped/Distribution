package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileIODetails extends js.Object {
  
  /** File Pattern used to access files by the connector. */
  var filePattern: js.UndefOr[String] = js.native
}
object FileIODetails {
  
  @scala.inline
  def apply(): FileIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileIODetails]
  }
  
  @scala.inline
  implicit class FileIODetailsOps[Self <: FileIODetails] (val x: Self) extends AnyVal {
    
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
