package typings.joycon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoyCon extends js.Object {
  
  def addLoader(loader: AsyncLoader): this.type = js.native
  def addLoader(loader: MultiLoader): this.type = js.native
  def addLoader(loader: SyncLoader): this.type = js.native
  
  /** Clear internal cache */
  def clearCache(): this.type = js.native
  
  def load(): js.Promise[LoadResult] = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String): js.Promise[LoadResult] = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
  def load(files: js.Array[String]): js.Promise[LoadResult] = js.native
  def load(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
  def load(files: js.Array[String], cwd: String): js.Promise[LoadResult] = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
  def load(files: Options): js.Promise[LoadResult] = js.native
  def load(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[LoadResult] = js.native
  def load(files: Options, cwd: String): js.Promise[LoadResult] = js.native
  def load(files: Options, cwd: String, stopDir: String): js.Promise[LoadResult] = js.native
  
  def loadSync(): LoadResult = js.native
  def loadSync(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
  def loadSync(files: js.UndefOr[scala.Nothing], cwd: String): LoadResult = js.native
  def loadSync(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): LoadResult = js.native
  def loadSync(files: js.Array[String]): LoadResult = js.native
  def loadSync(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
  def loadSync(files: js.Array[String], cwd: String): LoadResult = js.native
  def loadSync(files: js.Array[String], cwd: String, stopDir: String): LoadResult = js.native
  def loadSync(files: Options): LoadResult = js.native
  def loadSync(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): LoadResult = js.native
  def loadSync(files: Options, cwd: String): LoadResult = js.native
  def loadSync(files: Options, cwd: String, stopDir: String): LoadResult = js.native
  
  var options: Options = js.native
  
  def removeLoader(name: String): this.type = js.native
  
  def resolve(): js.Promise[String | Null] = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String): js.Promise[String | Null] = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Promise[String | Null] = js.native
  def resolve(files: js.Array[String]): js.Promise[String | Null] = js.native
  def resolve(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
  def resolve(files: js.Array[String], cwd: String): js.Promise[String | Null] = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): js.Promise[String | Null] = js.native
  def resolve(files: Options): js.Promise[String | Null] = js.native
  def resolve(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Promise[String | Null] = js.native
  def resolve(files: Options, cwd: String): js.Promise[String | Null] = js.native
  def resolve(files: Options, cwd: String, stopDir: String): js.Promise[String | Null] = js.native
  
  def resolveSync(): String | Null = js.native
  def resolveSync(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolveSync(files: js.UndefOr[scala.Nothing], cwd: String): String | Null = js.native
  def resolveSync(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): String | Null = js.native
  def resolveSync(files: js.Array[String]): String | Null = js.native
  def resolveSync(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolveSync(files: js.Array[String], cwd: String): String | Null = js.native
  def resolveSync(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolveSync(files: Options): String | Null = js.native
  def resolveSync(files: Options, cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolveSync(files: Options, cwd: String): String | Null = js.native
  def resolveSync(files: Options, cwd: String, stopDir: String): String | Null = js.native
}
