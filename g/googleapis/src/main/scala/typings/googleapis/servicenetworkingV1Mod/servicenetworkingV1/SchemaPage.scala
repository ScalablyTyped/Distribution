package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a documentation page. A page can contain subpages to represent
  * nested documentation set structure.
  */
@js.native
trait SchemaPage extends js.Object {
  /**
    * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;==
    * include {path} ==&amp;#41;&lt;/code&gt; to include content from a
    * Markdown file.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The name of the page. It will be used as an identity of the page to
    * generate URI of the page, text of the link to this page in navigation,
    * etc. The full page name (start from the root page name to this page
    * concatenated with `.`) can be used as reference to the page in your
    * documentation. For example: &lt;pre&gt;&lt;code&gt;pages: - name:
    * Tutorial   content: &amp;#40;== include tutorial.md ==&amp;#41; subpages:
    * - name: Java     content: &amp;#40;== include tutorial_java.md
    * ==&amp;#41; &lt;/code&gt;&lt;/pre&gt; You can reference `Java` page using
    * Markdown reference link syntax: `Java`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subpages of this page. The order of subpages specified here will be
    * honored in the generated docset.
    */
  var subpages: js.UndefOr[js.Array[SchemaPage]] = js.native
}

object SchemaPage {
  @scala.inline
  def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  @scala.inline
  implicit class SchemaPageOps[Self <: SchemaPage] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubpagesVarargs(value: SchemaPage*): Self = this.set("subpages", js.Array(value :_*))
    @scala.inline
    def setSubpages(value: js.Array[SchemaPage]): Self = this.set("subpages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubpages: Self = this.set("subpages", js.undefined)
  }
  
}

