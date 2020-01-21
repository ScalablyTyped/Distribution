package typings.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonLdProcessor extends js.Object {
  def compact(input: Document, context: Context): js.Promise[JsonLd] = js.native
  def compact(input: Document, context: Context, options: Options): js.Promise[JsonLd] = js.native
  def expand(input: Document): js.Promise[JsonLd] = js.native
  def expand(input: Document, options: Options): js.Promise[JsonLd] = js.native
  def flatten(input: Document): js.Promise[JsonLd] = js.native
  def flatten(input: Document, context: Null, options: Options): js.Promise[JsonLd] = js.native
  def flatten(input: Document, context: Context): js.Promise[JsonLd] = js.native
  def flatten(input: Document, context: Context, options: Options): js.Promise[JsonLd] = js.native
}

