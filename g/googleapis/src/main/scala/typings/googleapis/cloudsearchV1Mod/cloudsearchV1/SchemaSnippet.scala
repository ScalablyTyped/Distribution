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
  def apply(matchRanges: js.Array[SchemaMatchRange] = null, snippet: String = null): SchemaSnippet = {
    val __obj = js.Dynamic.literal()
    if (matchRanges != null) __obj.updateDynamic("matchRanges")(matchRanges.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSnippet]
  }
}

