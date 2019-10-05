package typings.jsonld.jsonldMod

import typings.jsonld.jsonldDashSpecMod.Context
import typings.jsonld.jsonldDashSpecMod.Document
import typings.jsonld.jsonldDashSpecMod.JsonLd
import typings.jsonld.jsonldMod.Options.Compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "compact")
@js.native
object compact extends js.Object {
  def apply(input: Document, ctx: Context): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Context, callback: DocCallback): Unit = js.native
  def apply(input: Document, ctx: Context, options: Compact): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Context, options: Compact, callback: DocCallback): Unit = js.native
}

