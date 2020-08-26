package typings.gulpUseref.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalStreams: js.UndefOr[js.Array[ReadWriteStream]] = js.native
  var base: js.UndefOr[String] = js.native
  var noAssets: js.UndefOr[Boolean] = js.native
  var noconcat: js.UndefOr[Boolean] = js.native
  var searchPath: js.UndefOr[String | js.Array[String]] = js.native
  var transformPath: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAdditionalStreamsVarargs(value: ReadWriteStream*): Self = this.set("additionalStreams", js.Array(value :_*))
    @scala.inline
    def setAdditionalStreams(value: js.Array[ReadWriteStream]): Self = this.set("additionalStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalStreams: Self = this.set("additionalStreams", js.undefined)
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setNoAssets(value: Boolean): Self = this.set("noAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAssets: Self = this.set("noAssets", js.undefined)
    @scala.inline
    def setNoconcat(value: Boolean): Self = this.set("noconcat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoconcat: Self = this.set("noconcat", js.undefined)
    @scala.inline
    def setSearchPathVarargs(value: String*): Self = this.set("searchPath", js.Array(value :_*))
    @scala.inline
    def setSearchPath(value: String | js.Array[String]): Self = this.set("searchPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPath: Self = this.set("searchPath", js.undefined)
    @scala.inline
    def setTransformPath(value: /* filePath */ String => Unit): Self = this.set("transformPath", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformPath: Self = this.set("transformPath", js.undefined)
  }
  
}

