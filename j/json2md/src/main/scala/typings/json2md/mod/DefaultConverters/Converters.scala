package typings.json2md.mod.DefaultConverters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converters
  extends /* converter */ StringDictionary[js.Any] {
  var blockquote: String | js.Array[String] = js.native
  var code: CodeInput = js.native
  var h1: String | js.Array[String] = js.native
  var h2: String | js.Array[String] = js.native
  var h3: String | js.Array[String] = js.native
  var h4: String | js.Array[String] = js.native
  var h5: String | js.Array[String] = js.native
  var h6: String | js.Array[String] = js.native
  var img: ImgInput | js.Array[ImgInput] = js.native
  var ol: js.Array[String] = js.native
  var p: String | js.Array[String] = js.native
  var table: TableInput = js.native
  var ul: js.Array[String] = js.native
}

object Converters {
  @scala.inline
  def apply(
    blockquote: String | js.Array[String],
    code: CodeInput,
    h1: String | js.Array[String],
    h2: String | js.Array[String],
    h3: String | js.Array[String],
    h4: String | js.Array[String],
    h5: String | js.Array[String],
    h6: String | js.Array[String],
    img: ImgInput | js.Array[ImgInput],
    ol: js.Array[String],
    p: String | js.Array[String],
    table: TableInput,
    ul: js.Array[String]
  ): Converters = {
    val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converters]
  }
  @scala.inline
  implicit class ConvertersOps[Self <: Converters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockquoteVarargs(value: String*): Self = this.set("blockquote", js.Array(value :_*))
    @scala.inline
    def setBlockquote(value: String | js.Array[String]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: CodeInput): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setH1Varargs(value: String*): Self = this.set("h1", js.Array(value :_*))
    @scala.inline
    def setH1(value: String | js.Array[String]): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def setH2Varargs(value: String*): Self = this.set("h2", js.Array(value :_*))
    @scala.inline
    def setH2(value: String | js.Array[String]): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def setH3Varargs(value: String*): Self = this.set("h3", js.Array(value :_*))
    @scala.inline
    def setH3(value: String | js.Array[String]): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def setH4Varargs(value: String*): Self = this.set("h4", js.Array(value :_*))
    @scala.inline
    def setH4(value: String | js.Array[String]): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def setH5Varargs(value: String*): Self = this.set("h5", js.Array(value :_*))
    @scala.inline
    def setH5(value: String | js.Array[String]): Self = this.set("h5", value.asInstanceOf[js.Any])
    @scala.inline
    def setH6Varargs(value: String*): Self = this.set("h6", js.Array(value :_*))
    @scala.inline
    def setH6(value: String | js.Array[String]): Self = this.set("h6", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgVarargs(value: ImgInput*): Self = this.set("img", js.Array(value :_*))
    @scala.inline
    def setImg(value: ImgInput | js.Array[ImgInput]): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setOlVarargs(value: String*): Self = this.set("ol", js.Array(value :_*))
    @scala.inline
    def setOl(value: js.Array[String]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def setPVarargs(value: String*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: String | js.Array[String]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: TableInput): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setUlVarargs(value: String*): Self = this.set("ul", js.Array(value :_*))
    @scala.inline
    def setUl(value: js.Array[String]): Self = this.set("ul", value.asInstanceOf[js.Any])
  }
  
}

