package typings.isGif

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a boolean of whether input is a GIF image.
    */
  @JSImport("is-gif", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): Boolean = js.native
  @JSImport("is-gif", JSImport.Namespace)
  @js.native
  def apply(input: Uint8Array): Boolean = js.native
}
