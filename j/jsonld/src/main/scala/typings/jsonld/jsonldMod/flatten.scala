package typings.jsonld.jsonldMod

import typings.jsonld.jsonldDashSpecMod.Context
import typings.jsonld.jsonldDashSpecMod.Document
import typings.jsonld.jsonldDashSpecMod.JsonLd
import typings.jsonld.jsonldMod.Options.Flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "flatten")
@js.native
object flatten extends js.Object {
  def apply(input: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Null, callback: DocCallback): Unit = js.native
  def apply(input: Document, ctx: Null, options: Flatten): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Null, options: Flatten, callback: DocCallback): Unit = js.native
  def apply(input: Document, ctx: Context): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Context, callback: DocCallback): Unit = js.native
  def apply(input: Document, ctx: Context, options: Flatten): js.Promise[JsonLd] = js.native
  def apply(input: Document, ctx: Context, options: Flatten, callback: DocCallback): Unit = js.native
}

