package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.jsonldSpecMod.JsonLd
import typings.jsonld.mod.Options.Flatten
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

