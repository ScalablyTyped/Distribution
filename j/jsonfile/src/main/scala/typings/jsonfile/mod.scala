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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonfile", "readFile")
  @js.native
  def readFile(file: Path): js.Promise[_] = js.native
  @JSImport("jsonfile", "readFile")
  @js.native
  def readFile(file: Path, callback: ReadCallback): Unit = js.native
  @JSImport("jsonfile", "readFile")
  @js.native
  def readFile(file: Path, options: JFReadOptions): js.Promise[_] = js.native
  @JSImport("jsonfile", "readFile")
  @js.native
  def readFile(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = js.native
  
  @JSImport("jsonfile", "readFileSync")
  @js.native
  def readFileSync(file: Path): js.Any = js.native
  @JSImport("jsonfile", "readFileSync")
  @js.native
  def readFileSync(file: Path, options: JFReadOptions): js.Any = js.native
  
  @JSImport("jsonfile", "writeFile")
  @js.native
  def writeFile(file: Path, obj: js.Any): js.Promise[Unit] = js.native
  @JSImport("jsonfile", "writeFile")
  @js.native
  def writeFile(file: Path, obj: js.Any, callback: WriteCallback): Unit = js.native
  @JSImport("jsonfile", "writeFile")
  @js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions): js.Promise[Unit] = js.native
  @JSImport("jsonfile", "writeFile")
  @js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): Unit = js.native
  
  @JSImport("jsonfile", "writeFileSync")
  @js.native
  def writeFileSync(file: Path, obj: js.Any): Unit = js.native
  @JSImport("jsonfile", "writeFileSync")
  @js.native
  def writeFileSync(file: Path, obj: js.Any, options: JFWriteOptions): Unit = js.native
  
  @js.native
  trait FS extends StObject {
    
    var readFile: TypeoffsReadFile = js.native
    
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: BufferEncoding): String = js.native
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: Double, options: `3`): Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: `3`): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
    
    var writeFile: TypeoffsWriteFile = js.native
    
    def writeFileSync(path: Double, data: String): Unit = js.native
    def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
    def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: String): Unit = js.native
    def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
    def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallPathDataOptions = js.native
  }
  
  type JFReadOptions = js.UndefOr[Encoding | String | Null]
  
  type JFWriteOptions = EOL | String | Null
  
  type Path = PathLike | Url
  
  type ReadCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ js.Any, Unit]
  
  type WriteCallback = js.Function1[/* err */ ErrnoException, Unit]
}
