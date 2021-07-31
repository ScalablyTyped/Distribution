package typings.isProgressive

import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-progressive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buffer(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def file(filepath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def fileSync(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def stream(stream: Readable): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
