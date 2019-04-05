package typings
package hoganDotJsLib.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hogan.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(text: java.lang.String): HoganTemplate = js.native
  def compile(text: java.lang.String, options: HoganOptions with hoganDotJsLib.Anon_AsString): HoganTemplate = js.native
  @JSName("compile")
  def `compile_<union>`(text: java.lang.String): HoganTemplate | java.lang.String = js.native
  @JSName("compile")
  def `compile_<union>`(text: java.lang.String, options: HoganOptions): HoganTemplate | java.lang.String = js.native
  @JSName("compile")
  def compile_String(text: java.lang.String): java.lang.String = js.native
  @JSName("compile")
  def compile_String(text: java.lang.String, options: HoganOptions with hoganDotJsLib.Anon_AsStringTrue): java.lang.String = js.native
  def parse(tokens: js.Array[Token]): Tree = js.native
  def parse(tokens: js.Array[Token], text: js.UndefOr[scala.Nothing], options: HoganOptions): Tree = js.native
  def scan(text: java.lang.String): js.Array[Token] = js.native
  def scan(text: java.lang.String, delimiters: java.lang.String): js.Array[Token] = js.native
}

