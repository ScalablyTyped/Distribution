package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.jsonldSpecMod.JsonLd
import typings.jsonld.mod.Options.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "frame")
@js.native
object frame extends js.Object {
  def apply(input: Document, frame: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, frame: Document, callback: DocCallback): Unit = js.native
  def apply(input: Document, frame: Document, options: Frame): js.Promise[JsonLd] = js.native
  def apply(input: Document, frame: Document, options: Frame, callback: DocCallback): Unit = js.native
}

