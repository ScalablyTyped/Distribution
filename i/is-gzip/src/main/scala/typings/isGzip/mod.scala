package typings.isGzip

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-gzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(buf: Buffer): Boolean = js.native
  def apply(buf: Uint8Array): Boolean = js.native
}
