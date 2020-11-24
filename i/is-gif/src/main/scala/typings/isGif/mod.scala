package typings.isGif

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-gif", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Returns a boolean of whether input is a GIF image.
    */
  def apply(input: Buffer): Boolean = js.native
  def apply(input: Uint8Array): Boolean = js.native
}
