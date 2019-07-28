package typings.hexoDashUtil.hexoDashUtilMod

import org.scalablytyped.runtime.StringDictionary
import typings.hexoDashUtil.Anon_1
import typings.hexoDashUtil.Anon_AutoDetect
import typings.hexoDashUtil.Anon_Length
import typings.hexoDashUtil.Anon_Width
import typings.node.Buffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def camelCaseKeys(obj: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def escapeDiacritic(str: String): String = js.native
  def escapeHTML(str: String): String = js.native
  def escapeRegExp(str: String): String = js.native
  def hash(str: String): Buffer = js.native
  def hash(str: ArrayBufferView): Buffer = js.native
  def highlight(str: String): String = js.native
  def highlight(str: String, options: Anon_AutoDetect): String = js.native
  def htmlTag(tag: String): String = js.native
  def htmlTag(tag: String, attrs: js.Array[String]): String = js.native
  def htmlTag(tag: String, attrs: js.Array[String], text: String): String = js.native
  def htmlTag(tag: String, attrs: StringDictionary[js.Any]): String = js.native
  def htmlTag(tag: String, attrs: StringDictionary[js.Any], text: String): String = js.native
  def htmlTag(tag: String, attrs: ArrayLike[String]): String = js.native
  def htmlTag(tag: String, attrs: ArrayLike[String], text: String): String = js.native
  def slugize(str: String): String = js.native
  def slugize(str: String, options: Anon_1): String = js.native
  def spawn(command: String): js.Promise[String] = js.native
  def spawn(command: String, args: js.Array[String]): js.Promise[String] = js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnOptions): js.Promise[String] = js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
  def spawn(command: String, options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  def spawn(command: String, options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  def spawn(command: String, options: hexoSpawnOptions): js.Promise[String] = js.native
  def spawn(command: String, options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
  def stripHTML(str: String): String = js.native
  def truncate(str: String): String = js.native
  def truncate(str: String, options: Anon_Length): String = js.native
  def wordWrap(str: String): String = js.native
  def wordWrap(str: String, options: Anon_Width): String = js.native
}

