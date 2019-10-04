package typings.htmlDashToDashDraftjs

import org.scalablytyped.runtime.StringDictionary
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftEntity
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-to-draftjs", JSImport.Namespace)
@js.native
object htmlDashToDashDraftjsMod extends js.Object {
  def default(text: String): Anon_ContentBlocks = js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): Anon_ContentBlocks = js.native
}

