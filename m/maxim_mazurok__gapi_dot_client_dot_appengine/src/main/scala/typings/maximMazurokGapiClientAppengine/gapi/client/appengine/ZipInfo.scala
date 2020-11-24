package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipInfo extends js.Object {
  
  /**
    * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not
    * provided, deployment may be slow.
    */
  var filesCount: js.UndefOr[Double] = js.native
  
  /** URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'. */
  var sourceUrl: js.UndefOr[String] = js.native
}
object ZipInfo {
  
  @scala.inline
  def apply(): ZipInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipInfo]
  }
  
  @scala.inline
  implicit class ZipInfoOps[Self <: ZipInfo] (val x: Self) extends AnyVal {
    
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
    def setFilesCount(value: Double): Self = this.set("filesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesCount: Self = this.set("filesCount", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = this.set("sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUrl: Self = this.set("sourceUrl", js.undefined)
  }
}
