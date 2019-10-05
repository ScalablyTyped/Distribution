package typings.jsonld.jsonldMod

import typings.jsonld.jsonldDashSpecMod.JsonLd
import typings.jsonld.jsonldMod.Options.FromRdf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "fromRDF")
@js.native
object fromRDF extends js.Object {
  def apply(dataset: RdfOrString): js.Promise[JsonLd] = js.native
  def apply(dataset: RdfOrString, callback: DocCallback): Unit = js.native
  def apply(dataset: RdfOrString, options: FromRdf): js.Promise[JsonLd] = js.native
  def apply(dataset: RdfOrString, options: FromRdf, callback: DocCallback): Unit = js.native
}

