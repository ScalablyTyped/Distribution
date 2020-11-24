package typings.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonLdProcessor extends js.Object {
  
  def compact(input: Document, context: Context): js.Promise[JsonLdObj] = js.native
  def compact(input: Document, context: Context, options: Options): js.Promise[JsonLdObj] = js.native
  
  def expand(input: Document): js.Promise[JsonLdArray] = js.native
  def expand(input: Document, options: Options): js.Promise[JsonLdArray] = js.native
  
  def flatten(input: Document): js.Promise[JsonLdObj] = js.native
  def flatten(input: Document, context: js.UndefOr[Context], options: Options): js.Promise[JsonLdObj] = js.native
  def flatten(input: Document, context: Null, options: Options): js.Promise[JsonLdObj] = js.native
  def flatten(input: Document, context: Context): js.Promise[JsonLdObj] = js.native
}
