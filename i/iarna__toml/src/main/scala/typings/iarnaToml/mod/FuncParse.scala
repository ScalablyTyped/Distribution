package typings.iarnaToml.mod

import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FuncParse extends js.Object {
  
  /**
    * Synchronously parse a TOML string and return an object.
    */
  def apply(toml: String): JsonMap = js.native
  
  /**
    * Asynchronously parse a TOML string and return a promise of the resulting object.
    */
  def async(toml: String): js.Promise[JsonMap] = js.native
  def async(toml: String, options: ParseOptions): js.Promise[JsonMap] = js.native
  
  def stream(): Transform = js.native
  /**
    * Given a readable stream, parse it as it feeds us data. Return a promise of the resulting object.
    */
  def stream(readable: ReadableStream): js.Promise[JsonMap] = js.native
}
