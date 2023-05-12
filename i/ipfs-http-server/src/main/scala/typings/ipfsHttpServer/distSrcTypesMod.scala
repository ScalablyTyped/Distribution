package typings.ipfsHttpServer

import typings.hapiHapi.libTypesServerOptionsMod.ServerOptions
import typings.hapiHapi.mod.Server_
import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsHttpServer.ipfsHttpServerStrings.directory
import typings.ipfsHttpServer.ipfsHttpServerStrings.file
import typings.ipfsHttpServer.ipfsHttpServerStrings.symlink
import typings.ipfsUnixfs.mod.Mtime
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @JSImport("ipfs-http-server/dist/src/types", "Server")
  @js.native
  /**
    * Creates a new server object
    * @param options server configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptions)
    */
  open class Server[A] () extends Server_[A] {
    def this(options: ServerOptions) = this()
  }
  
  trait MultipartDirectory
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var `type`: directory
  }
  object MultipartDirectory {
    
    inline def apply(name: String): MultipartDirectory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[MultipartDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipartDirectory] (val x: Self) extends AnyVal {
      
      inline def setType(value: directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsHttpServer.distSrcTypesMod.MultipartFile
    - typings.ipfsHttpServer.distSrcTypesMod.MultipartDirectory
    - typings.ipfsHttpServer.distSrcTypesMod.MultipartSymlink
  */
  trait MultipartEntry extends StObject
  object MultipartEntry {
    
    inline def MultipartDirectory(name: String): typings.ipfsHttpServer.distSrcTypesMod.MultipartDirectory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[typings.ipfsHttpServer.distSrcTypesMod.MultipartDirectory]
    }
    
    inline def MultipartFile(content: AsyncIterable[js.typedarray.Uint8Array], name: String): typings.ipfsHttpServer.distSrcTypesMod.MultipartFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[typings.ipfsHttpServer.distSrcTypesMod.MultipartFile]
    }
    
    inline def MultipartSymlink(name: String, target: String): typings.ipfsHttpServer.distSrcTypesMod.MultipartSymlink = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("symlink")
      __obj.asInstanceOf[typings.ipfsHttpServer.distSrcTypesMod.MultipartSymlink]
    }
  }
  
  trait MultipartFile
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var content: AsyncIterable[js.typedarray.Uint8Array]
    
    var `type`: file
  }
  object MultipartFile {
    
    inline def apply(content: AsyncIterable[js.typedarray.Uint8Array], name: String): MultipartFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[MultipartFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipartFile] (val x: Self) extends AnyVal {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipartSymlink
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var target: String
    
    var `type`: symlink
  }
  object MultipartSymlink {
    
    inline def apply(name: String, target: String): MultipartSymlink = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("symlink")
      __obj.asInstanceOf[MultipartSymlink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipartSymlink] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipartUpload extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var name: String
  }
  object MultipartUpload {
    
    inline def apply(name: String): MultipartUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipartUpload] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait RequestApplicationState extends StObject {
      
      var signal: AbortSignal
    }
    object RequestApplicationState {
      
      inline def apply(signal: AbortSignal): RequestApplicationState = {
        val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestApplicationState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RequestApplicationState] (val x: Self) extends AnyVal {
        
        inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServerApplicationState extends StObject {
      
      var ipfs: IPFS[js.Object]
    }
    object ServerApplicationState {
      
      inline def apply(ipfs: IPFS[js.Object]): ServerApplicationState = {
        val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerApplicationState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServerApplicationState] (val x: Self) extends AnyVal {
        
        inline def setIpfs(value: IPFS[js.Object]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      }
    }
    
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
