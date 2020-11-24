package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.JsonLdArray
import typings.jsonld.mod.Options.FromRdf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonld", "fromRDF")
@js.native
object fromRDF extends js.Object {
  
  def apply(dataset: RdfDataSet): js.Promise[JsonLdArray] = js.native
  def apply(dataset: RdfDataSet, callback: Callback[JsonLdArray]): Unit = js.native
  def apply(dataset: RdfDataSet, options: FromRdf): js.Promise[JsonLdArray] = js.native
  def apply(dataset: RdfDataSet, options: FromRdf, callback: Callback[JsonLdArray]): Unit = js.native
}
