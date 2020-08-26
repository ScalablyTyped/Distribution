package typings.htmlparser2.feedHandlerMod

import typings.htmlparser2.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/FeedHandler", "parseFeed")
@js.native
object parseFeed extends js.Object {
  def apply(feed: String): js.UndefOr[Feed] = js.native
  def apply(
    feed: String,
    options: ParserOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any)
  ): js.UndefOr[Feed] = js.native
}

