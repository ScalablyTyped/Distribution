package typings.gulpDashTypescript.releaseTypesMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VinylFile extends js.Object {
  var base: String
  var basename: String
  var contents: Buffer | ReadableStream | Null
  var cwd: String
  var dirname: String
  var extname: String
  var path: String
  var sourceMap: js.UndefOr[js.Any] = js.undefined
  var stem: String
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
    stem: String,
    contents: Buffer | ReadableStream = null,
    sourceMap: js.Any = null
  ): VinylFile = {
    val __obj = js.Dynamic.literal(base = base, basename = basename, cwd = cwd, dirname = dirname, extname = extname, path = path, stem = stem)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[VinylFile]
  }
}

