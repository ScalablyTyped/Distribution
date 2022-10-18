package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distIncludeExcludeTestMod.IncludeExcludeTest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChunkIncludeExcludeTesterMod {
  
  @JSImport("license-webpack-plugin/dist/ChunkIncludeExcludeTester", "ChunkIncludeExcludeTester")
  @js.native
  open class ChunkIncludeExcludeTester protected () extends StObject {
    def this(includeExcludeTest: IncludeExcludeTest) = this()
    
    /* private */ var includeExcludeTest: Any = js.native
    
    def isIncluded(chunkName: String): Boolean = js.native
  }
}
