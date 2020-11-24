package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffDownloadResponse extends js.Object {
  
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}
object SchemaGdataDiffDownloadResponse {
  
  @scala.inline
  def apply(): SchemaGdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffDownloadResponse]
  }
  
  @scala.inline
  implicit class SchemaGdataDiffDownloadResponseOps[Self <: SchemaGdataDiffDownloadResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectLocation(value: SchemaGdataCompositeMedia): Self = this.set("objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLocation: Self = this.set("objectLocation", js.undefined)
  }
}
