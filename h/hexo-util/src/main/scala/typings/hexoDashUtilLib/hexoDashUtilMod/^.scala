package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def camelCaseKeys(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def escapeDiacritic(str: java.lang.String): java.lang.String = js.native
  def escapeHTML(str: java.lang.String): java.lang.String = js.native
  def escapeRegExp(str: java.lang.String): java.lang.String = js.native
  def hash(str: java.lang.String): nodeLib.Buffer = js.native
  def hash(str: stdLib.ArrayBufferView): nodeLib.Buffer = js.native
  def highlight(str: java.lang.String): java.lang.String = js.native
  def highlight(str: java.lang.String, options: hexoDashUtilLib.Anon_AutoDetect): java.lang.String = js.native
  def htmlTag(tag: java.lang.String): java.lang.String = js.native
  def htmlTag(tag: java.lang.String, attrs: js.Array[java.lang.String]): java.lang.String = js.native
  def htmlTag(tag: java.lang.String, attrs: js.Array[java.lang.String], text: java.lang.String): java.lang.String = js.native
  def htmlTag(tag: java.lang.String, attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def htmlTag(
    tag: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    text: java.lang.String
  ): java.lang.String = js.native
  def htmlTag(tag: java.lang.String, attrs: stdLib.ArrayLike[java.lang.String]): java.lang.String = js.native
  def htmlTag(tag: java.lang.String, attrs: stdLib.ArrayLike[java.lang.String], text: java.lang.String): java.lang.String = js.native
  def slugize(str: java.lang.String): java.lang.String = js.native
  def slugize(str: java.lang.String, options: hexoDashUtilLib.Anon_1): java.lang.String = js.native
  def spawn(command: java.lang.String): js.Promise[java.lang.String] = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: hexoSpawnDisableEncodingAndOverrideStdioOptions
  ): js.Promise[js.UndefOr[nodeLib.Buffer]] = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: hexoSpawnDisableEncodingOptions
  ): js.Promise[nodeLib.Buffer] = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: hexoSpawnOptions): js.Promise[java.lang.String] = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: hexoSpawnOverrideStdioOptions
  ): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def spawn(command: java.lang.String, options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[nodeLib.Buffer]] = js.native
  def spawn(command: java.lang.String, options: hexoSpawnDisableEncodingOptions): js.Promise[nodeLib.Buffer] = js.native
  def spawn(command: java.lang.String, options: hexoSpawnOptions): js.Promise[java.lang.String] = js.native
  def spawn(command: java.lang.String, options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def stripHTML(str: java.lang.String): java.lang.String = js.native
  def truncate(str: java.lang.String): java.lang.String = js.native
  def truncate(str: java.lang.String, options: hexoDashUtilLib.Anon_Length): java.lang.String = js.native
  def wordWrap(str: java.lang.String): java.lang.String = js.native
  def wordWrap(str: java.lang.String, options: hexoDashUtilLib.Anon_Width): java.lang.String = js.native
}

