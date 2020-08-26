package typings.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends BaseOptions {
  /**
    * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
    * Values that are not "text/html" or an XML mime type will throw. It defaults to "text/html".
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The maximum size in code units for the separate storage areas used by localStorage and sessionStorage.
    * Attempts to store data larger than this limit will cause a DOMException to be thrown. By default, it is set
    * to 5,000,000 code units per origin, as inspired by the HTML specification.
    *
    * @default 5_000_000
    */
  var storageQuota: js.UndefOr[Double] = js.native
  /**
    * url sets the value returned by window.location, document.URL, and document.documentURI,
    * and affects things like resolution of relative URLs within the document
    * and the same-origin restrictions and referrer used while fetching subresources.
    * It defaults to "about:blank".
    */
  var url: js.UndefOr[String] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setStorageQuota(value: Double): Self = this.set("storageQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageQuota: Self = this.set("storageQuota", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

