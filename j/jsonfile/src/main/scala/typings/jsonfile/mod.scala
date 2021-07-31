package typings.jsonfile

import typings.jsonfile.anon.EOL
import typings.jsonfile.anon.Encoding
import typings.jsonfile.anon.FnCall
import typings.jsonfile.anon.FnCallPathDataOptions
import typings.jsonfile.anon.TypeoffsReadFile
import typings.jsonfile.anon.TypeoffsWriteFile
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.`3`
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readFile(file: Path): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def readFile(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(file: Path, options: JFReadOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def readFile(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readFileSync(file: Path): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def readFileSync(file: Path, options: JFReadOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def writeFile(file: Path, obj: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: Path, obj: js.Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFileSync(file: Path, obj: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFileSync(file: Path, obj: js.Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FS extends StObject {
    
    var readFile: TypeoffsReadFile
    
    def readFileSync(path: Double): String | Buffer
    def readFileSync(path: Double, options: BufferEncoding): String
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer
    def readFileSync(path: Double, options: EncodingBufferEncoding): String
    def readFileSync(path: Double, options: `3`): Buffer
    def readFileSync(path: PathLike): String | Buffer
    def readFileSync(path: PathLike, options: BufferEncoding): String
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String
    def readFileSync(path: PathLike, options: `3`): Buffer
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer
    @JSName("readFileSync")
    var readFileSync_Original: FnCall
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer
    
    var writeFile: TypeoffsWriteFile
    
    def writeFileSync(path: Double, data: String): Unit
    def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit
    def writeFileSync(path: Double, data: ArrayBufferView): Unit
    def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit
    def writeFileSync(path: PathLike, data: String): Unit
    def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit
    def writeFileSync(path: PathLike, data: ArrayBufferView): Unit
    def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallPathDataOptions
  }
  object FS {
    
    @scala.inline
    def apply(
      readFile: TypeoffsReadFile,
      readFileSync: FnCall,
      writeFile: TypeoffsWriteFile,
      writeFileSync: FnCallPathDataOptions
    ): FS = {
      val __obj = js.Dynamic.literal(readFile = readFile.asInstanceOf[js.Any], readFileSync = readFileSync.asInstanceOf[js.Any], writeFile = writeFile.asInstanceOf[js.Any], writeFileSync = writeFileSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FS]
    }
    
    @scala.inline
    implicit class FSMutableBuilder[Self <: FS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadFile(value: TypeoffsReadFile): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileSync(value: FnCall): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFile(value: TypeoffsWriteFile): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileSync(value: FnCallPathDataOptions): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
    }
  }
  
  type JFReadOptions = js.UndefOr[Encoding | String | Null]
  
  type JFWriteOptions = EOL | String | Null
  
  type Path = PathLike | Url
  
  type ReadCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ js.Any, Unit]
  
  type WriteCallback = js.Function1[/* err */ ErrnoException, Unit]
}
