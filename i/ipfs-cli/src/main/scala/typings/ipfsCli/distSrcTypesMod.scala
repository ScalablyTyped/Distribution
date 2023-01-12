package typings.ipfsCli

import typings.ipfsCoreTypes.mod.IPFS
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.bufferMod.global.Buffer
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait Context extends StObject {
    
    def getStdin(): AsyncIterable[Buffer]
    
    var ipfs: IPFS[js.Object]
    
    var isDaemon: Boolean
    
    def print(msg: String): Unit
    def print(msg: String, includeNewline: Boolean): Unit
    def print(msg: String, includeNewline: Boolean, isError: Boolean): Unit
    def print(msg: String, includeNewline: Unit, isError: Boolean): Unit
    def print(msg: js.typedarray.Uint8Array): Unit
    def print(msg: js.typedarray.Uint8Array, includeNewline: Boolean): Unit
    def print(msg: js.typedarray.Uint8Array, includeNewline: Boolean, isError: Boolean): Unit
    def print(msg: js.typedarray.Uint8Array, includeNewline: Unit, isError: Boolean): Unit
    @JSName("print")
    var print_Original: Print
    
    var repoPath: String
  }
  object Context {
    
    inline def apply(
      getStdin: () => AsyncIterable[Buffer],
      ipfs: IPFS[js.Object],
      isDaemon: Boolean,
      print: Print,
      repoPath: String
    ): Context = {
      val __obj = js.Dynamic.literal(getStdin = js.Any.fromFunction0(getStdin), ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setGetStdin(value: () => AsyncIterable[Buffer]): Self = StObject.set(x, "getStdin", js.Any.fromFunction0(value))
      
      inline def setIpfs(value: IPFS[js.Object]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def setIsDaemon(value: Boolean): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: Print): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setRepoPath(value: String): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Print extends StObject {
    
    def apply(msg: String): Unit = js.native
    def apply(msg: String, includeNewline: Boolean): Unit = js.native
    def apply(msg: String, includeNewline: Boolean, isError: Boolean): Unit = js.native
    def apply(msg: String, includeNewline: Unit, isError: Boolean): Unit = js.native
    def apply(msg: js.typedarray.Uint8Array): Unit = js.native
    def apply(msg: js.typedarray.Uint8Array, includeNewline: Boolean): Unit = js.native
    def apply(msg: js.typedarray.Uint8Array, includeNewline: Boolean, isError: Boolean): Unit = js.native
    def apply(msg: js.typedarray.Uint8Array, includeNewline: Unit, isError: Boolean): Unit = js.native
    
    def clearLine(): Unit = js.native
    
    var columns: Any = js.native
    
    def cursorTo(pos: Double): Unit = js.native
    
    def error(msg: String): Unit = js.native
    def error(msg: String, includeNewline: Boolean): Unit = js.native
    
    var isTTY: Boolean = js.native
    
    def write(data: Any): Unit = js.native
  }
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerInfo extends StObject {
      
      var ma: Multiaddr_
    }
    object ServerInfo {
      
      inline def apply(ma: Multiaddr_): ServerInfo = {
        val __obj = js.Dynamic.literal(ma = ma.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
        
        inline def setMa(value: Multiaddr_): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
      }
    }
  }
}
