package typings.jsonld.jsonldMod

import typings.jsonld.jsonldDashSpecMod.Context
import typings.jsonld.jsonldDashSpecMod.Document
import typings.jsonld.jsonldDashSpecMod.JsonLd
import typings.jsonld.jsonldMod.OptionsNs.Compact
import typings.jsonld.jsonldMod.OptionsNs.Expand
import typings.jsonld.jsonldMod.OptionsNs.Flatten
import typings.jsonld.jsonldMod.OptionsNs.Frame
import typings.jsonld.jsonldMod.OptionsNs.FromRdf
import typings.jsonld.jsonldMod.OptionsNs.Normalize
import typings.jsonld.jsonldMod.OptionsNs.ToRdf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var JsonLdProcessor: typings.jsonld.jsonldDashSpecMod.JsonLdProcessor = js.native
  def compact(input: Document, ctx: Context): js.Promise[JsonLd] = js.native
  def compact(input: Document, ctx: Context, callback: DocCallback): Unit = js.native
  def compact(input: Document, ctx: Context, options: Compact): js.Promise[JsonLd] = js.native
  def compact(input: Document, ctx: Context, options: Compact, callback: DocCallback): Unit = js.native
  def expand(input: Document): js.Promise[JsonLd] = js.native
  def expand(input: Document, callback: DocCallback): Unit = js.native
  def expand(input: Document, options: Expand): js.Promise[JsonLd] = js.native
  def expand(input: Document, options: Expand, callback: DocCallback): Unit = js.native
  def flatten(input: Document): js.Promise[JsonLd] = js.native
  def flatten(input: Document, ctx: Null, callback: DocCallback): Unit = js.native
  def flatten(input: Document, ctx: Null, options: Flatten): js.Promise[JsonLd] = js.native
  def flatten(input: Document, ctx: Null, options: Flatten, callback: DocCallback): Unit = js.native
  def flatten(input: Document, ctx: Context): js.Promise[JsonLd] = js.native
  def flatten(input: Document, ctx: Context, callback: DocCallback): Unit = js.native
  def flatten(input: Document, ctx: Context, options: Flatten): js.Promise[JsonLd] = js.native
  def flatten(input: Document, ctx: Context, options: Flatten, callback: DocCallback): Unit = js.native
  def frame(input: Document, frame: Document): js.Promise[JsonLd] = js.native
  def frame(input: Document, frame: Document, callback: DocCallback): Unit = js.native
  def frame(input: Document, frame: Document, options: Frame): js.Promise[JsonLd] = js.native
  def frame(input: Document, frame: Document, options: Frame, callback: DocCallback): Unit = js.native
  def fromRDF(dataset: RdfOrString): js.Promise[JsonLd] = js.native
  def fromRDF(dataset: RdfOrString, callback: DocCallback): Unit = js.native
  def fromRDF(dataset: RdfOrString, options: FromRdf): js.Promise[JsonLd] = js.native
  def fromRDF(dataset: RdfOrString, options: FromRdf, callback: DocCallback): Unit = js.native
  def normalize(input: Document): js.Promise[JsonLd] = js.native
  def normalize(input: Document, callback: DocCallback): Unit = js.native
  def normalize(input: Document, options: Normalize): js.Promise[JsonLd] = js.native
  def normalize(input: Document, options: Normalize, callback: DocCallback): Unit = js.native
  def toRDF(input: Document): js.Promise[RdfOrString] = js.native
  def toRDF(input: Document, callback: Callback[RdfOrString]): Unit = js.native
  def toRDF(input: Document, options: ToRdf): js.Promise[RdfOrString] = js.native
  def toRDF(input: Document, options: ToRdf, callback: Callback[RdfOrString]): Unit = js.native
}

