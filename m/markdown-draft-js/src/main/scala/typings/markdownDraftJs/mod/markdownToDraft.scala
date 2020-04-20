package typings.markdownDraftJs.mod

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-draft-js", "markdownToDraft")
@js.native
object markdownToDraft extends js.Object {
  def apply(markdown: String): RawDraftContentState = js.native
  def apply(markdown: String, options: MarkdownToDraftOptions): RawDraftContentState = js.native
}

