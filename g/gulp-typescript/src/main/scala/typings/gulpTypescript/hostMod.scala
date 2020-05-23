package typings.gulpTypescript

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.inputMod.FileCache
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/host", JSImport.Namespace)
@js.native
object hostMod extends js.Object {
  @js.native
  class Host protected () extends CompilerHost {
    def this(typescript: Typeofts, currentDirectory: String, input: FileCache, options: CompilerOptions) = this()
    var currentDirectory: String = js.native
    var fallback: CompilerHost = js.native
    var input: FileCache = js.native
    var typescript: Typeofts = js.native
    @JSName("directoryExists")
    def directoryExists_MHost(path: String): Boolean = js.native
    /* CompleteClass */
    override def fileExists(fileName: String): Boolean = js.native
    @JSName("getCurrentDirectory")
    def getCurrentDirectory_MHost(): String = js.native
    @JSName("getDefaultLibLocation")
    def getDefaultLibLocation_MHost(): String = js.native
    @JSName("getDirectories")
    def getDirectories_MHost(path: String): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MHost(
      rootDir: String,
      extensions: js.Array[String],
      excludes: js.Array[String],
      includes: js.Array[String]
    ): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MHost(
      rootDir: String,
      extensions: js.Array[String],
      excludes: js.Array[String],
      includes: js.Array[String],
      depth: Double
    ): js.Array[String] = js.native
    /* CompleteClass */
    override def readFile(fileName: String): js.UndefOr[String] = js.native
    @JSName("realpath")
    def realpath_MHost(path: String): String = js.native
  }
  
}

