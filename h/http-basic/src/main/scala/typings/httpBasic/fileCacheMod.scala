package typings.httpBasic

import typings.httpBasic.anon.PickCachedResponseheaders
import typings.httpBasic.icacheMod.ICache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic/lib/FileCache", JSImport.Namespace)
@js.native
object fileCacheMod extends js.Object {
  
  @js.native
  trait FileCache extends ICache {
    
    val _location: js.Any = js.native
    
    @JSName("updateResponseHeaders")
    def updateResponseHeaders_MFileCache(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
  
  @js.native
  class default protected () extends FileCache {
    def this(location: String) = this()
  }
}
