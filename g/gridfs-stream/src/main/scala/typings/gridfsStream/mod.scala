package typings.gridfsStream

import typings.gridfsStream.mod.GridFSStream.Options
import typings.gridfsStream.mod.GridFSStream.ReadStream
import typings.gridfsStream.mod.GridFSStream.WriteStream
import typings.mongodb.mod.Collection
import typings.mongodb.mod.DefaultSchema
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Merged declaration, g is both a callable function and a namespace
  inline def apply(db: js.Any, mongo: js.Any): Grid = (^.asInstanceOf[js.Dynamic].apply(db.asInstanceOf[js.Any], mongo.asInstanceOf[js.Any])).asInstanceOf[Grid]
  
  @JSImport("gridfs-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridfs-stream", "Grid")
  @js.native
  class Grid () extends StObject {
    
    def collection(): Collection[DefaultSchema] = js.native
    def collection(name: String): Collection[DefaultSchema] = js.native
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(options: String): ReadStream = js.native
    def createReadStream(options: Options): ReadStream = js.native
    
    def createWriteStream(): WriteStream = js.native
    def createWriteStream(options: String): WriteStream = js.native
    def createWriteStream(options: Options): WriteStream = js.native
    
    var curCol: String = js.native
    
    def exist(options: Options, callback: js.Function2[/* err */ Error, /* found */ Boolean, Unit]): Unit = js.native
    
    var files: Collection[DefaultSchema] = js.native
    
    def findOne(options: Options, callback: js.Function2[/* err */ Error, /* record */ js.Any, Unit]): Unit = js.native
    
    def remove(options: Options, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  object GridFSStream {
    
    trait Options extends StObject {
      
      var _id: js.UndefOr[String] = js.undefined
      
      // any other options from the GridStore may be passed too, e.g.
      var chunkSize: js.UndefOr[Double] = js.undefined
      
      var content_type: js.UndefOr[String] = js.undefined
      
      var filename: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[js.Any] = js.undefined
      
      var mode: js.UndefOr[String] = js.undefined
      
      var range: js.UndefOr[Range] = js.undefined
      
      var root: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
        
        inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
        
        inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
        
        inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
        
        inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        
        inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      }
    }
    
    trait Range extends StObject {
      
      var endPos: Double
      
      var startPos: Double
    }
    object Range {
      
      inline def apply(endPos: Double, startPos: Double): Range = {
        val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
        __obj.asInstanceOf[Range]
      }
      
      extension [Self <: Range](x: Self) {
        
        inline def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
        
        inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ReadStream
      extends StObject
         with ReadableStream {
      
      var paused: Boolean = js.native
    }
    
    @js.native
    trait WriteStream
      extends StObject
         with WritableStream {
      
      var id: String = js.native
      
      var mode: String = js.native
      
      var name: String = js.native
      
      var options: Options = js.native
    }
  }
}
