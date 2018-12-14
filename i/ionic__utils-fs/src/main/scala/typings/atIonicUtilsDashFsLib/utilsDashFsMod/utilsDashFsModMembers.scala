package typings
package atIonicUtilsDashFsLib.utilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", JSImport.Namespace)
@js.native
object utilsDashFsModMembers extends js.Object {
  def access(arg1: java.lang.String, arg2: scala.Double): js.Promise[scala.Unit] = js.native
  def cacheFileChecksum(p: java.lang.String): js.Promise[scala.Unit] = js.native
  def cacheFileChecksum(p: java.lang.String, checksum: java.lang.String): js.Promise[scala.Unit] = js.native
  def compilePaths(filePath: java.lang.String): js.Array[java.lang.String] = js.native
  def copyDirectory(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] = js.native
  def copyDirectory(source: java.lang.String, destination: java.lang.String, options: ncpLib.ncpMod.Options): js.Promise[scala.Unit] = js.native
  def copyFile(fileName: java.lang.String, target: java.lang.String): js.Promise[js.Object] = js.native
  def copyFile(fileName: java.lang.String, target: java.lang.String, mode: scala.Double): js.Promise[js.Object] = js.native
  def fileToString(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
  def findBaseDirectory(dir: java.lang.String, file: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def getFileChecksum(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
  def getFileChecksums(p: java.lang.String): js.Promise[js.Tuple2[java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  def isDir(p: java.lang.String): js.Promise[scala.Boolean] = js.native
  def mkdir(arg1: java.lang.String, arg2: scala.Double): js.Promise[scala.Unit] = js.native
  def mkdirp(p: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirp(p: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def mkdirpSync(p: java.lang.String): scala.Unit = js.native
  def mkdirpSync(p: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def open(arg1: java.lang.String, arg2: java.lang.String): js.Promise[scala.Double] = js.native
  def pathAccessible(filePath: java.lang.String, mode: scala.Double): js.Promise[scala.Boolean] = js.native
  def pathExists(filePath: java.lang.String): js.Promise[scala.Boolean] = js.native
  def readDir(arg1: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readDirSafe(dir: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readDirp(dir: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readDirp(dir: java.lang.String, hasFilterWalkerOptions: ReadDirROptions): js.Promise[js.Array[java.lang.String]] = js.native
  def readFile(arg1: java.lang.String, arg2: ReadFileOptions): js.Promise[java.lang.String] = js.native
  def readJsonFile(filePath: java.lang.String): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def readJsonFile(filePath: java.lang.String, options: ReadFileOptions): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def removeDirectory(dir: java.lang.String): js.Promise[scala.Unit] = js.native
  def stat(arg1: java.lang.String): js.Promise[nodeLib.fsMod.Stats] = js.native
  def statSafe(p: java.lang.String): js.Promise[js.UndefOr[nodeLib.fsMod.Stats]] = js.native
  def tmpfilepath(): java.lang.String = js.native
  def tmpfilepath(prefix: java.lang.String): java.lang.String = js.native
  def unlink(arg1: java.lang.String): js.Promise[scala.Unit] = js.native
  def walk(p: java.lang.String): Walker = js.native
  def walk(p: java.lang.String, options: WalkerOptions): Walker = js.native
  def writeFile(arg1: java.lang.String, arg2: js.Any, arg3: WriteFileOptions): js.Promise[scala.Unit] = js.native
  def writeJsonFile(
    filePath: java.lang.String,
    json: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: WriteFileOptions
  ): js.Promise[scala.Unit] = js.native
  def writeStreamToFile(stream: nodeLib.NodeJSNs.ReadableStream, destination: java.lang.String): js.Promise[_] = js.native
}

