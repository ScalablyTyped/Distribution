package typings.hexoFs

import typings.hexoFs.hexoFsStrings.buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var encoding: buffer
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait `2` extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait AutoClose extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object AutoClose {
    
    inline def apply(): AutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoClose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Buffer extends StObject {
    
    var buffer: typings.node.bufferMod.global.Buffer
    
    var bytesRead: Double
  }
  object Buffer {
    
    inline def apply(buffer: typings.node.bufferMod.global.Buffer, bytesRead: Double): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferBytesWritten extends StObject {
    
    var buffer: String
    
    var bytesWritten: Double
  }
  object BufferBytesWritten {
    
    inline def apply(buffer: String, bytesWritten: Double): BufferBytesWritten = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferBytesWritten]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferBytesWritten] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesRead extends StObject {
    
    var buffer: js.typedarray.Uint8Array
    
    var bytesRead: Double
  }
  object BytesRead {
    
    inline def apply(buffer: js.typedarray.Uint8Array, bytesRead: Double): BytesRead = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesRead]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytesRead] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesWritten[TBuffer /* <: typings.node.bufferMod.global.Buffer | js.typedarray.Uint8Array */] extends StObject {
    
    var buffer: TBuffer
    
    var bytesWritten: Double
  }
  object BytesWritten {
    
    inline def apply[TBuffer /* <: typings.node.bufferMod.global.Buffer | js.typedarray.Uint8Array */](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesWritten[TBuffer]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytesWritten[?], TBuffer /* <: typings.node.bufferMod.global.Buffer | js.typedarray.Uint8Array */] (val x: Self & BytesWritten[TBuffer]) extends AnyVal {
      
      inline def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hexo-fs.hexo-fs.DirectoryOptions & {  exclude :std.Array<string> | undefined} */
  trait DirectoryOptionsexcludeAr extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreHidden: js.UndefOr[Boolean] = js.undefined
    
    var ignorePattern: js.UndefOr[js.RegExp] = js.undefined
  }
  object DirectoryOptionsexcludeAr {
    
    inline def apply(): DirectoryOptionsexcludeAr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptionsexcludeAr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryOptionsexcludeAr] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
      
      inline def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: BufferEncoding | Null
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal(encoding = null)
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    }
  }
  
  trait Escape extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Escape {
    
    inline def apply(): Escape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Escape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Escape] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait Flag extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
  }
  object Flag {
    
    inline def apply(): Flag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
