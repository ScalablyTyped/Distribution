package typings.ipfsUtils

import typings.ipfsUtils.anon.Content
import typings.ipfsUtils.anon.FollowSymlinks
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesGlobSourceMod {
  
  inline def apply(cwd: String, pattern: String): AsyncGenerator[Content, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Content, Unit, Any]]
  inline def apply(cwd: String, pattern: String, options: FollowSymlinks): AsyncGenerator[Content, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Content, Unit, Any]]
  
  @JSImport("ipfs-utils/dist/src/files/glob-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
