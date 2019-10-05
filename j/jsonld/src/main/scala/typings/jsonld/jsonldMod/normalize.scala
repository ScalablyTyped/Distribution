package typings.jsonld.jsonldMod

import typings.jsonld.jsonldDashSpecMod.Document
import typings.jsonld.jsonldDashSpecMod.JsonLd
import typings.jsonld.jsonldMod.Options.Normalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "normalize")
@js.native
object normalize extends js.Object {
  def apply(input: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, callback: DocCallback): Unit = js.native
  def apply(input: Document, options: Normalize): js.Promise[JsonLd] = js.native
  def apply(input: Document, options: Normalize, callback: DocCallback): Unit = js.native
}

