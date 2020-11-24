package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.mod.Options.Normalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonld", "normalize")
@js.native
object normalize extends js.Object {
  
  def apply(input: Document): js.Promise[String] = js.native
  def apply(input: Document, callback: Callback[String]): Unit = js.native
  def apply(input: Document, options: Normalize): js.Promise[String] = js.native
  def apply(input: Document, options: Normalize, callback: Callback[String]): Unit = js.native
}
