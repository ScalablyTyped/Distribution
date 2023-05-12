package typings.ipfsUtils

import typings.ipfsUtils.distSrcTypesMod.GlobSourceOptions
import typings.ipfsUtils.distSrcTypesMod.GlobSourceResult
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesGlobSourceMod {
  
  inline def apply(cwd: String, pattern: String): AsyncGenerator[GlobSourceResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[GlobSourceResult, Unit, Any]]
  inline def apply(cwd: String, pattern: String, options: GlobSourceOptions): AsyncGenerator[GlobSourceResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[GlobSourceResult, Unit, Any]]
  
  @JSImport("ipfs-utils/dist/src/files/glob-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
