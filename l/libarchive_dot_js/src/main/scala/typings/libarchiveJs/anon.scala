package typings.libarchiveJs

import typings.libarchiveJs.srcCompressedFileMod.CompressedFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: typings.std.File | CompressedFile
    
    var path: String
  }
  object File {
    
    inline def apply(file: typings.std.File | CompressedFile, path: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: typings.std.File | CompressedFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var file: typings.std.File
    
    var path: String
  }
  object Path {
    
    inline def apply(file: typings.std.File, path: String): Path = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerUrl extends StObject {
    
    var workerUrl: String
  }
  object WorkerUrl {
    
    inline def apply(workerUrl: String): WorkerUrl = {
      val __obj = js.Dynamic.literal(workerUrl = workerUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkerUrl] (val x: Self) extends AnyVal {
      
      inline def setWorkerUrl(value: String): Self = StObject.set(x, "workerUrl", value.asInstanceOf[js.Any])
    }
  }
}
