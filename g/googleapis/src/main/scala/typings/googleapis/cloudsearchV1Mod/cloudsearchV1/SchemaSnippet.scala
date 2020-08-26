package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snippet of the search result, which summarizes the content of the resulting
  * page.
  */
@js.native
trait SchemaSnippet extends js.Object {
  /**
    * The matched ranges in the snippet.
    */
  var matchRanges: js.UndefOr[js.Array[SchemaMatchRange]] = js.native
  /**
    * The snippet of the document. The snippet of the document. May contain
    * escaped HTML character that should be unescaped prior to rendering.
    */
  var snippet: js.UndefOr[String] = js.native
}

object SchemaSnippet {
  @scala.inline
  def apply(): SchemaSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnippet]
  }
  @scala.inline
  implicit class SchemaSnippetOps[Self <: SchemaSnippet] (val x: Self) extends AnyVal {
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
    def setMatchRangesVarargs(value: SchemaMatchRange*): Self = this.set("matchRanges", js.Array(value :_*))
    @scala.inline
    def setMatchRanges(value: js.Array[SchemaMatchRange]): Self = this.set("matchRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchRanges: Self = this.set("matchRanges", js.undefined)
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
  
}

