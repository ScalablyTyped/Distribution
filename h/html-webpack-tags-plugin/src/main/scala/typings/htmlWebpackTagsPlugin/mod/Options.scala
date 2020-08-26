package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends CommonOptions {
  var cssExtensions: js.UndefOr[String | js.Array[String]] = js.native
  var files: js.UndefOr[js.Array[String]] = js.native
  var jsExtensions: js.UndefOr[String | js.Array[String]] = js.native
  var links: js.UndefOr[String | LinkTagOptions | (js.Array[String | LinkTagOptions])] = js.native
  var metas: js.UndefOr[String | MetaTagOptions | (js.Array[String | MetaTagOptions])] = js.native
  var prependExternals: js.UndefOr[Boolean] = js.native
  var scripts: js.UndefOr[String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])] = js.native
  var tags: js.UndefOr[
    String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCssExtensionsVarargs(value: String*): Self = this.set("cssExtensions", js.Array(value :_*))
    @scala.inline
    def setCssExtensions(value: String | js.Array[String]): Self = this.set("cssExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssExtensions: Self = this.set("cssExtensions", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setJsExtensionsVarargs(value: String*): Self = this.set("jsExtensions", js.Array(value :_*))
    @scala.inline
    def setJsExtensions(value: String | js.Array[String]): Self = this.set("jsExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsExtensions: Self = this.set("jsExtensions", js.undefined)
    @scala.inline
    def setLinksVarargs(value: (String | LinkTagOptions)*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: String | LinkTagOptions | (js.Array[String | LinkTagOptions])): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setMetasVarargs(value: (String | MetaTagOptions)*): Self = this.set("metas", js.Array(value :_*))
    @scala.inline
    def setMetas(value: String | MetaTagOptions | (js.Array[String | MetaTagOptions])): Self = this.set("metas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetas: Self = this.set("metas", js.undefined)
    @scala.inline
    def setPrependExternals(value: Boolean): Self = this.set("prependExternals", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrependExternals: Self = this.set("prependExternals", js.undefined)
    @scala.inline
    def setScriptsVarargs(value: (String | ScriptTagOptions)*): Self = this.set("scripts", js.Array(value :_*))
    @scala.inline
    def setScripts(value: String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setTagsVarargs(value: (String | MaybeLinkTagOptions | MaybeScriptTagOptions)*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(
      value: String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
    ): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

