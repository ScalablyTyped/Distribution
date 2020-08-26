package typings.gulpTypescript.typesMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VinylFile extends js.Object {
  var base: String = js.native
  var basename: String = js.native
  var contents: Buffer | ReadableStream | Null = js.native
  var cwd: String = js.native
  var dirname: String = js.native
  var extname: String = js.native
  var path: String = js.native
  var sourceMap: js.UndefOr[js.Any] = js.native
  var stem: String = js.native
}

object VinylFile {
  @scala.inline
  def apply(
    base: String,
    basename: String,
    cwd: String,
    dirname: String,
    extname: String,
    path: String,
    stem: String
  ): VinylFile = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VinylFile]
  }
  @scala.inline
  implicit class VinylFileOps[Self <: VinylFile] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem(value: String): Self = this.set("stem", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents(value: Buffer | ReadableStream): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentsNull: Self = this.set("contents", null)
    @scala.inline
    def setSourceMap(value: js.Any): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

