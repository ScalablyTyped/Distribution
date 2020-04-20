package typings.markdownDraftJs.mod

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-draft-js", "draftToMarkdown")
@js.native
object draftToMarkdown extends js.Object {
  def apply(RawDraft: RawDraftContentState): String = js.native
  def apply(RawDraft: RawDraftContentState, options: DraftToMarkdownOptions): String = js.native
}

