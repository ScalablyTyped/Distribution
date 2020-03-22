package typings.markdownDraftJs

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-draft-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def draftToMarkdown(RawDraft: RawDraftContentState): String = js.native
  def markdownToDraft(markdown: String): RawDraftContentState = js.native
}

