package typings.isProgressive

import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-progressive", "buffer")
  @js.native
  def buffer(buffer: Buffer): Boolean = js.native
  
  @JSImport("is-progressive", "file")
  @js.native
  def file(filepath: String): js.Promise[Boolean] = js.native
  
  @JSImport("is-progressive", "fileSync")
  @js.native
  def fileSync(filepath: String): Boolean = js.native
  
  @JSImport("is-progressive", "stream")
  @js.native
  def stream(stream: Readable): js.Promise[Boolean] = js.native
}
