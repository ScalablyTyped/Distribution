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
  def apply(
    cacheId: String = null,
    displayLink: String = null,
    fileFormat: String = null,
    formattedUrl: String = null,
    htmlFormattedUrl: String = null,
    htmlSnippet: String = null,
    htmlTitle: String = null,
    image: ByteSize = null,
    kind: String = null,
    labels: js.Array[Labelwithop] = null,
    link: String = null,
    mime: String = null,
    pagemap: StringDictionary[js.Array[StringDictionary[_]]] = null,
    snippet: String = null,
    title: String = null
  ): SchemaResult = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink.asInstanceOf[js.Any])
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat.asInstanceOf[js.Any])
    if (formattedUrl != null) __obj.updateDynamic("formattedUrl")(formattedUrl.asInstanceOf[js.Any])
    if (htmlFormattedUrl != null) __obj.updateDynamic("htmlFormattedUrl")(htmlFormattedUrl.asInstanceOf[js.Any])
    if (htmlSnippet != null) __obj.updateDynamic("htmlSnippet")(htmlSnippet.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (pagemap != null) __obj.updateDynamic("pagemap")(pagemap.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResult]
  }
}

