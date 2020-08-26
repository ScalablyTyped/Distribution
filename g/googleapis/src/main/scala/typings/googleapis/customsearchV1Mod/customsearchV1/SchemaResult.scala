package typings.googleapis.customsearchV1Mod.customsearchV1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.ByteSize
import typings.googleapis.anon.Labelwithop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResult extends js.Object {
  var cacheId: js.UndefOr[String] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var fileFormat: js.UndefOr[String] = js.native
  var formattedUrl: js.UndefOr[String] = js.native
  var htmlFormattedUrl: js.UndefOr[String] = js.native
  var htmlSnippet: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[ByteSize] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[js.Array[Labelwithop]] = js.native
  var link: js.UndefOr[String] = js.native
  var mime: js.UndefOr[String] = js.native
  var pagemap: js.UndefOr[StringDictionary[js.Array[StringDictionary[_]]]] = js.native
  var snippet: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaResult {
  @scala.inline
  def apply(): SchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResult]
  }
  @scala.inline
  implicit class SchemaResultOps[Self <: SchemaResult] (val x: Self) extends AnyVal {
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
    def setLabelsVarargs(value: Labelwithop*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[Labelwithop]): Self = this.set("labels", value.asInstanceOf[js.Any])
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
    def setPagemap(value: StringDictionary[js.Array[StringDictionary[_]]]): Self = this.set("pagemap", value.asInstanceOf[js.Any])
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

