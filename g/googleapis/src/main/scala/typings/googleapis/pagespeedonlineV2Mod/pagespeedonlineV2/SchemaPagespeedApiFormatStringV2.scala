package typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2

import typings.googleapis.anon.Rects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiFormatStringV2 extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.UndefOr[js.Array[Rects]] = js.native
  /**
    * A localized format string with {{FOO}} placeholders, where &#39;FOO&#39;
    * is the key of the argument whose value should be substituted. For
    * HYPERLINK arguments, the format string will instead contain {{BEGIN_FOO}}
    * and {{END_FOO}} for the argument with key &#39;FOO&#39;.
    */
  var format: js.UndefOr[String] = js.native
}

object SchemaPagespeedApiFormatStringV2 {
  @scala.inline
  def apply(): SchemaPagespeedApiFormatStringV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiFormatStringV2]
  }
  @scala.inline
  implicit class SchemaPagespeedApiFormatStringV2Ops[Self <: SchemaPagespeedApiFormatStringV2] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Rects*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Rects]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

