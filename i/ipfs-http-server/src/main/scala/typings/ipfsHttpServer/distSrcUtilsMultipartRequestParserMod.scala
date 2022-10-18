package typings.ipfsHttpServer

import typings.ipfsHttpServer.ipfsHttpServerStrings.directory
import typings.ipfsHttpServer.ipfsHttpServerStrings.file
import typings.ipfsHttpServer.ipfsHttpServerStrings.symlink
import typings.ipfsUnixfs.distSrcTypesMod.Mtime
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMultipartRequestParserMod {
  
  @JSImport("ipfs-http-server/dist/src/utils/multipart-request-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multipartRequestParser(stream: IncomingMessage): AsyncGenerator[MultipartEntry, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequestParser")(stream.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[MultipartEntry, Unit, Unit]]
  
  type IncomingMessage = typings.node.httpMod.IncomingMessage
  
  type MultipartEntry = typings.ipfsHttpServer.distSrcTypesMod.MultipartEntry
  
  trait MultipartUpload extends StObject {
    
    var body: AsyncIterable[js.typedarray.Uint8Array]
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var name: String
    
    var `type`: file | directory | symlink
  }
  object MultipartUpload {
    
    inline def apply(body: AsyncIterable[js.typedarray.Uint8Array], name: String, `type`: file | directory | symlink): MultipartUpload = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartUpload]
    }
    
    extension [Self <: MultipartUpload](x: Self) {
      
      inline def setBody(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | directory | symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Part = typings.itMultipart.mod.Part
}
