package typings.keystonejsFileAdapters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var stream: js.Any = js.native
  }
  object Filename {
    
    @scala.inline
    def apply(id: String, stream: js.Any): Filename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit class FilenameMutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilenameId extends StObject {
    
    var filename: String = js.native
    
    var id: String = js.native
  }
  object FilenameId {
    
    @scala.inline
    def apply(filename: String, id: String): FilenameId = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilenameId]
    }
    
    @scala.inline
    implicit class FilenameIdMutableBuilder[Self <: FilenameId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilenameString extends StObject {
    
    var filename: String = js.native
  }
  object FilenameString {
    
    @scala.inline
    def apply(filename: String): FilenameString = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilenameString]
    }
    
    @scala.inline
    implicit class FilenameStringMutableBuilder[Self <: FilenameString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var originalFilename: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, originalFilename: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    }
  }
}
