package typings.httpBasic

import typings.httpBasic.anon.PickCachedResponseheaders
import typings.httpBasic.icacheMod.ICache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileCacheMod {
  
  @JSImport("http-basic/lib/FileCache", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with FileCache {
    def this(location: String) = this()
  }
  
  @js.native
  trait FileCache
    extends StObject
       with ICache {
    
    val _location: js.Any = js.native
    
    @JSName("updateResponseHeaders")
    def updateResponseHeaders_MFileCache(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
}
