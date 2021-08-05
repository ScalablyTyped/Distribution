package typings.keystonejsFileAdapters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var stream: js.Any
  }
  object Filename {
    
    inline def apply(id: String, stream: js.Any): Filename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    extension [Self <: Filename](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilenameId extends StObject {
    
    var filename: String
    
    var id: String
  }
  object FilenameId {
    
    inline def apply(filename: String, id: String): FilenameId = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilenameId]
    }
    
    extension [Self <: FilenameId](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilenameString extends StObject {
    
    var filename: String
  }
  object FilenameString {
    
    inline def apply(filename: String): FilenameString = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilenameString]
    }
    
    extension [Self <: FilenameString](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var originalFilename: String
  }
  object Id {
    
    inline def apply(id: String, originalFilename: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    }
  }
}
