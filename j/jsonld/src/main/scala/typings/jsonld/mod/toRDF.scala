package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.mod.Options.ToRdf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "toRDF")
@js.native
object toRDF extends js.Object {
  def apply(input: Document): js.Promise[RdfOrString] = js.native
  def apply(input: Document, callback: Callback[RdfOrString]): Unit = js.native
  def apply(input: Document, options: ToRdf): js.Promise[RdfOrString] = js.native
  def apply(input: Document, options: ToRdf, callback: Callback[RdfOrString]): Unit = js.native
}

