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
    callback: jsonldLib.DocCallback
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
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document, callback: jsonldLib.DocCallback): scala.Unit = js.native
  def expand(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.Expand): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def expand(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Expand,
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document, ctx: jsonldLib.jsonldDashSpecMod.Context): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: jsonldLib.jsonldDashSpecMod.Context,
    callback: jsonldLib.DocCallback
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
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def flatten(input: jsonldLib.jsonldDashSpecMod.Document, ctx: scala.Null, callback: jsonldLib.DocCallback): scala.Unit = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: scala.Null,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten
  ): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def flatten(
    input: jsonldLib.jsonldDashSpecMod.Document,
    ctx: scala.Null,
    options: jsonldLib.jsonldMod.OptionsNs.Flatten,
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def frame(input: jsonldLib.jsonldDashSpecMod.Document, frame: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def frame(
    input: jsonldLib.jsonldDashSpecMod.Document,
    frame: jsonldLib.jsonldDashSpecMod.Document,
    callback: jsonldLib.DocCallback
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
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def fromRDF(dataset: jsonldLib.RdfOrString): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def fromRDF(dataset: jsonldLib.RdfOrString, callback: jsonldLib.DocCallback): scala.Unit = js.native
  def fromRDF(dataset: jsonldLib.RdfOrString, options: jsonldLib.jsonldMod.OptionsNs.FromRdf): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def fromRDF(
    dataset: jsonldLib.RdfOrString,
    options: jsonldLib.jsonldMod.OptionsNs.FromRdf,
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document, callback: jsonldLib.DocCallback): scala.Unit = js.native
  def normalize(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.Normalize): js.Promise[jsonldLib.jsonldDashSpecMod.JsonLd] = js.native
  def normalize(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.Normalize,
    callback: jsonldLib.DocCallback
  ): scala.Unit = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document): js.Promise[jsonldLib.RdfOrString] = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document, callback: jsonldLib.Callback[jsonldLib.RdfOrString]): scala.Unit = js.native
  def toRDF(input: jsonldLib.jsonldDashSpecMod.Document, options: jsonldLib.jsonldMod.OptionsNs.ToRdf): js.Promise[jsonldLib.RdfOrString] = js.native
  def toRDF(
    input: jsonldLib.jsonldDashSpecMod.Document,
    options: jsonldLib.jsonldMod.OptionsNs.ToRdf,
    callback: jsonldLib.Callback[jsonldLib.RdfOrString]
  ): scala.Unit = js.native
}

