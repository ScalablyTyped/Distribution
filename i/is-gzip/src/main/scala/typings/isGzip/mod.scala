package typings.isGzip

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def apply(buf: Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-gzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
