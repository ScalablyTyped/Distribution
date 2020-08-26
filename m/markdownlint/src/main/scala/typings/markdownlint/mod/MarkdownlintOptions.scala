package typings.markdownlint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownlintOptions extends js.Object {
  var config: js.UndefOr[MarkdownlintConfig] = js.native
  var files: js.UndefOr[js.Array[String] | String] = js.native
  var frontMatter: js.UndefOr[RegExp] = js.native
  var noInlineConfig: js.UndefOr[Boolean] = js.native
  var resultVersion: js.UndefOr[Double] = js.native
  var strings: js.UndefOr[StringDictionary[String]] = js.native
}

object MarkdownlintOptions {
  @scala.inline
  def apply(): MarkdownlintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownlintOptions]
  }
  @scala.inline
  implicit class MarkdownlintOptionsOps[Self <: MarkdownlintOptions] (val x: Self) extends AnyVal {
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
    def setConfig(value: MarkdownlintConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String] | String): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFrontMatter(value: RegExp): Self = this.set("frontMatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrontMatter: Self = this.set("frontMatter", js.undefined)
    @scala.inline
    def setNoInlineConfig(value: Boolean): Self = this.set("noInlineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInlineConfig: Self = this.set("noInlineConfig", js.undefined)
    @scala.inline
    def setResultVersion(value: Double): Self = this.set("resultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultVersion: Self = this.set("resultVersion", js.undefined)
    @scala.inline
    def setStrings(value: StringDictionary[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
  
}

