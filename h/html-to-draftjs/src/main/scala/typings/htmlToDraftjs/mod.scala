package typings.htmlToDraftjs

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typings.htmlToDraftjs.anon.ContentBlocks
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-draftjs", JSImport.Default)
  @js.native
  def default(text: String): ContentBlocks = js.native
  @JSImport("html-to-draftjs", JSImport.Default)
  @js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): ContentBlocks = js.native
}
