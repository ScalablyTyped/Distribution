package typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientCustomsearch.anon.ByteSize
import typings.maximMazurokGapiClientCustomsearch.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  /** Indicates the ID of Google's cached version of the search result. */
  var cacheId: js.UndefOr[String] = js.native
  
  /** An abridged version of this search result’s URL, e.g. www.example.com. */
  var displayLink: js.UndefOr[String] = js.native
  
  /** The file format of the search result. */
  var fileFormat: js.UndefOr[String] = js.native
  
  /** The URL displayed after the snippet for each search result. */
  var formattedUrl: js.UndefOr[String] = js.native
  
  /** The HTML-formatted URL displayed after the snippet for each search result. */
  var htmlFormattedUrl: js.UndefOr[String] = js.native
  
  /** The snippet of the search result, in HTML. */
  var htmlSnippet: js.UndefOr[String] = js.native
  
  /** The title of the search result, in HTML. */
  var htmlTitle: js.UndefOr[String] = js.native
  
  /** Image belonging to a custom search result. */
  var image: js.UndefOr[ByteSize] = js.native
  
  /** A unique identifier for the type of current object. For this API, it is `customsearch#result.` */
  var kind: js.UndefOr[String] = js.native
  
  /** Encapsulates all information about [refinement labels](https://developers.google.com/custom-search/docs/xml_results). */
  var labels: js.UndefOr[js.Array[DisplayName]] = js.native
  
  /** The full URL to which the search result is pointing, e.g. http://www.example.com/foo/bar. */
  var link: js.UndefOr[String] = js.native
  
  /** The MIME type of the search result. */
  var mime: js.UndefOr[String] = js.native
  
  /** Contains [PageMap](https://developers.google.com/custom-search/docs/structured_data#pagemaps) information for this search result. */
  var pagemap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Result with TopLevel[js.Any]
  ] = js.native
  
  /** The snippet of the search result, in plain text. */
  var snippet: js.UndefOr[String] = js.native
  
  /** The title of the search result, in plain text. */
  var title: js.UndefOr[String] = js.native
}
object Result {
  
  @scala.inline
  def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setCacheId(value: String): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheId: Self = this.set("cacheId", js.undefined)
    
    @scala.inline
    def setDisplayLink(value: String): Self = this.set("displayLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLink: Self = this.set("displayLink", js.undefined)
    
    @scala.inline
    def setFileFormat(value: String): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileFormat: Self = this.set("fileFormat", js.undefined)
    
    @scala.inline
    def setFormattedUrl(value: String): Self = this.set("formattedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedUrl: Self = this.set("formattedUrl", js.undefined)
    
    @scala.inline
    def setHtmlFormattedUrl(value: String): Self = this.set("htmlFormattedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFormattedUrl: Self = this.set("htmlFormattedUrl", js.undefined)
    
    @scala.inline
    def setHtmlSnippet(value: String): Self = this.set("htmlSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlSnippet: Self = this.set("htmlSnippet", js.undefined)
    
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    
    @scala.inline
    def setImage(value: ByteSize): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: DisplayName*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[DisplayName]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setPagemap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Result with TopLevel[js.Any]
    ): Self = this.set("pagemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagemap: Self = this.set("pagemap", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
