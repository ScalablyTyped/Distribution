package typings.isGif

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a boolean of whether input is a GIF image.
    */
  @scala.inline
  def apply(input: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def apply(input: Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-gif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
