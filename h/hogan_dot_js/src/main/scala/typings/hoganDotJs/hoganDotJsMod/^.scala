package typings.hoganDotJs.hoganDotJsMod

import typings.hoganDotJs.Anon_AsString
import typings.hoganDotJs.Anon_AsStringTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hogan.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(text: String): HoganTemplate | String = js.native
  def compile(text: String, options: HoganOptions): HoganTemplate | String = js.native
  @JSName("compile")
  def compile_HoganTemplate(text: String): HoganTemplate = js.native
  @JSName("compile")
  def compile_HoganTemplate(text: String, options: HoganOptions with Anon_AsString): HoganTemplate = js.native
  @JSName("compile")
  def compile_String(text: String): String = js.native
  @JSName("compile")
  def compile_String(text: String, options: HoganOptions with Anon_AsStringTrue): String = js.native
  def parse(tokens: js.Array[Token]): Tree = js.native
  def parse(tokens: js.Array[Token], text: js.UndefOr[scala.Nothing], options: HoganOptions): Tree = js.native
  def scan(text: String): js.Array[Token] = js.native
  def scan(text: String, delimiters: String): js.Array[Token] = js.native
}

