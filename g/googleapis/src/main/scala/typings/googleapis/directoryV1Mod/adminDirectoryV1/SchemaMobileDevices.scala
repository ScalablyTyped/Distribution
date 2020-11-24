package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Mobile Devices operation in Directory API.
  */
@js.native
trait SchemaMobileDevices extends js.Object {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of Mobile Device objects.
    */
  var mobiledevices: js.UndefOr[js.Array[SchemaMobileDevice]] = js.native
  
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaMobileDevices {
  
  @scala.inline
  def apply(): SchemaMobileDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevices]
  }
  
  @scala.inline
  implicit class SchemaMobileDevicesOps[Self <: SchemaMobileDevices] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobiledevicesVarargs(value: SchemaMobileDevice*): Self = this.set("mobiledevices", js.Array(value :_*))
    
    @scala.inline
    def setMobiledevices(value: js.Array[SchemaMobileDevice]): Self = this.set("mobiledevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobiledevices: Self = this.set("mobiledevices", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
