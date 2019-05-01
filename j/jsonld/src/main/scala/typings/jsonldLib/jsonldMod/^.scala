package typings
package jsonldLib.jsonldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var JsonLdProcessor: jsonldLib.jsonldDashSpecMod.JsonLdProcessor = js.native
  def compact(input: jsonldLib.jsonldDashSpecMod.Document, ctx: jsonldLib.jsonldDashSpecMod.Context): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def compact(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    callback: DocCallback
  ): scala.Unit = js.native
  def compact(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    options: jsonldLib.jsonldMod.OptionsNs.Compact
  ): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def compact(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    options: jsonldLib.jsonldMod.OptionsNs.Compact,
    callback: DocCallback
  ): scala.Unit = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document, callback: DocCallback): scala.Unit = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.Expand): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def expand(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Expand,
    callback: DocCallback
  ): scala.Unit = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document, ctx: jsonldLib.jsonldDashSpecMod.Context): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    callback: DocCallback
  ): scala.Unit = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten
  ): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten,
    callback: DocCallback
  ): scala.Unit = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document, ctx: scala.Null, callback: DocCallback): scala.Unit = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: scala.Null,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten
  ): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: scala.Null,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten,
    callback: DocCallback
  ): scala.Unit = js.native
  def frame(input: jsonldLib.jsonldDashSpecMod.Document, frame: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def frame(
    input: jsonldLib.jsonldDashSpecMod.Document,
    frame: jsonldLib.jsonldDashSpecMod.Document,
    callback: DocCallback
  ): scala.Unit = js.native
  def frame(
    input: jsonldLib.jsonldDashSpecMod.Document,
    frame: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Frame
  ): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def frame(
    input: jsonldLib.jsonldDashSpecMod.Document,
    frame: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Frame,
    callback: DocCallback
  ): scala.Unit = js.native
  def fromRDF(dataset: RdfOrString): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def fromRDF(dataset: RdfOrString, callback: DocCallback): scala.Unit = js.native
  def fromRDF(dataset: RdfOrString, options: jsonldLib.jsonldMod.OptionsNs.FromRdf): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def fromRDF(dataset: RdfOrString, options: jsonldLib.jsonldMod.OptionsNs.FromRdf, callback: DocCallback): scala.Unit = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document, callback: DocCallback): scala.Unit = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.Normalize): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def normalize(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Normalize,
    callback: DocCallback
  ): scala.Unit = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[RdfOrString] = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document, callback: Callback[RdfOrString]): scala.Unit = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.ToRdf): js.Promise[RdfOrString] = js.native
  def toRDF(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.ToRdf,
    callback: Callback[RdfOrString]
  ): scala.Unit = js.native
}

