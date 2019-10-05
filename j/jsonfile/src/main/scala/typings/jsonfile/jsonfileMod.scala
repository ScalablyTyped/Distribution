package typings.jsonfile

import typings.jsonfile.jsonfileMod.JFReadOptions
import typings.jsonfile.jsonfileMod.JFWriteOptions
import typings.jsonfile.jsonfileMod.Path
import typings.jsonfile.jsonfileMod.ReadCallback
import typings.jsonfile.jsonfileMod.WriteCallback
import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", JSImport.Namespace)
@js.native
object jsonfileMod extends js.Object {
  @js.native
  trait FS extends js.Object {
    var readFile: TypeoffsReadFile = js.native
    @JSName("readFileSync")
    var readFileSync_Original: Fn_Options = js.native
    var writeFile: TypeoffsWriteFile = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: Fn_Data = js.native
    def readFileSync(path: Double): Buffer = js.native
    def readFileSync(path: Double, options: String): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
    def readFileSync(path: PathLike): Buffer = js.native
    def readFileSync(path: PathLike, options: String): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: Double, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: PathLike, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike): String | Buffer = js.native
    def writeFileSync(path: Double, data: js.Any): Unit = js.native
    def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  def readFile(file: Path): js.Promise[_] = js.native
  def readFile(file: Path, callback: ReadCallback): Unit = js.native
  def readFile(file: Path, options: JFReadOptions): js.Promise[_] = js.native
  def readFile(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = js.native
  def readFileSync(file: Path): js.Any = js.native
  def readFileSync(file: Path, options: JFReadOptions): js.Any = js.native
  def writeFile(file: Path, obj: js.Any): js.Promise[Unit] = js.native
  def writeFile(file: Path, obj: js.Any, callback: WriteCallback): Unit = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions): js.Promise[Unit] = js.native
  def writeFile(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): Unit = js.native
  def writeFileSync(file: Path, obj: js.Any): Unit = js.native
  def writeFileSync(file: Path, obj: js.Any, options: JFWriteOptions): Unit = js.native
  type JFReadOptions = js.UndefOr[Anon_Encoding | String | Null]
  type JFWriteOptions = Anon_EOL | String | Null
  type Path = PathLike | Url
  type ReadCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ js.Any, Unit]
  type WriteCallback = js.Function1[/* err */ ErrnoException, Unit]
}

