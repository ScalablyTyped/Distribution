package typings.json2md.mod

import typings.json2md.mod.DefaultConverters.CodeInput
import typings.json2md.mod.DefaultConverters.ImgInput
import typings.json2md.mod.DefaultConverters.TableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]: json2md.json2md.ConverterCallback<json2md.json2md.DefaultConverters.Converters[TConverter]>} */
@js.native
trait ConvertersMethods extends js.Object {
  @JSName("blockquote")
  var blockquote_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("code")
  var code_Original: ConverterCallback[CodeInput] = js.native
  @JSName("h1")
  var h1_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("h2")
  var h2_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("h3")
  var h3_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("h4")
  var h4_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("h5")
  var h5_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("h6")
  var h6_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("img")
  var img_Original: ConverterCallback[ImgInput | js.Array[ImgInput]] = js.native
  @JSName("ol")
  var ol_Original: ConverterCallback[js.Array[String]] = js.native
  @JSName("p")
  var p_Original: ConverterCallback[String | js.Array[String]] = js.native
  @JSName("table")
  var table_Original: ConverterCallback[TableInput] = js.native
  @JSName("ul")
  var ul_Original: ConverterCallback[js.Array[String]] = js.native
  def blockquote(input: String, json2md: json2md): String = js.native
  def blockquote(input: js.Array[String], json2md: json2md): String = js.native
  def code(input: CodeInput, json2md: json2md): String = js.native
  def h1(input: String, json2md: json2md): String = js.native
  def h1(input: js.Array[String], json2md: json2md): String = js.native
  def h2(input: String, json2md: json2md): String = js.native
  def h2(input: js.Array[String], json2md: json2md): String = js.native
  def h3(input: String, json2md: json2md): String = js.native
  def h3(input: js.Array[String], json2md: json2md): String = js.native
  def h4(input: String, json2md: json2md): String = js.native
  def h4(input: js.Array[String], json2md: json2md): String = js.native
  def h5(input: String, json2md: json2md): String = js.native
  def h5(input: js.Array[String], json2md: json2md): String = js.native
  def h6(input: String, json2md: json2md): String = js.native
  def h6(input: js.Array[String], json2md: json2md): String = js.native
  def img(input: js.Array[ImgInput], json2md: json2md): String = js.native
  def img(input: ImgInput, json2md: json2md): String = js.native
  def ol(input: js.Array[String], json2md: json2md): String = js.native
  def p(input: String, json2md: json2md): String = js.native
  def p(input: js.Array[String], json2md: json2md): String = js.native
  def table(input: TableInput, json2md: json2md): String = js.native
  def ul(input: js.Array[String], json2md: json2md): String = js.native
}

