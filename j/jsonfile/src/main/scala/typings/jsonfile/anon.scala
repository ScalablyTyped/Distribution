package typings.jsonfile

import typings.jsonfile.mod.FS
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.`3`
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EOL extends StObject {
    
    var EOL: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var fs: js.UndefOr[FS] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
    
    var spaces: js.UndefOr[String | Double] = js.undefined
  }
  object EOL {
    
    inline def apply(): EOL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EOL]
    }
    
    extension [Self <: EOL](x: Self) {
      
      inline def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
      
      inline def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setFs(value: FS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpaces(value: String | Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var fs: js.UndefOr[FS] = js.undefined
    
    var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]] = js.undefined
    
    var throws: js.UndefOr[Boolean] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setFs(value: FS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setReviver(value: (/* key */ js.Any, /* value */ js.Any) => js.Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      inline def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: Double): String | Buffer = js.native
    def apply(path: Double, options: BufferEncoding): String = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: Double, options: EncodingBufferEncoding): String = js.native
    def apply(path: Double, options: `3`): Buffer = js.native
    def apply(path: PathLike): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def apply(path: PathLike, options: `3`): Buffer = js.native
  }
  
  @js.native
  trait FnCallPathDataOptions extends StObject {
    
    def apply(path: Double, data: String): Unit = js.native
    def apply(path: Double, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: Double, data: ArrayBufferView): Unit = js.native
    def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: String): Unit = js.native
    def apply(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait TypeoffsReadFile extends StObject {
    
    def apply(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
    def apply(
      path: Double,
      options: String,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
    ): Unit = js.native
    def apply(
      path: Double,
      options: Null,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: Double,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: Double,
      options: BaseEncodingOptionsflagst,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: Double,
      options: EncodingBufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
    ): Unit = js.native
    def apply(
      path: Double,
      options: `3`,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: String,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionsflagst,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: EncodingBufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: `3`,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeoffsWriteFile extends StObject {
    
    def apply(path: Double, data: String, callback: NoParamCallback): Unit = js.native
    def apply(path: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(path: Double, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
    def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, data: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  }
}
