package typings
package gulpDashTypescriptLib.releaseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VinylFile extends js.Object {
  var base: java.lang.String
  var basename: java.lang.String
  var contents: nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream | scala.Null
  var cwd: java.lang.String
  var dirname: java.lang.String
  var extname: java.lang.String
  var path: java.lang.String
  var sourceMap: js.UndefOr[js.Any] = js.undefined
  var stem: java.lang.String
}

object VinylFile {
  @scala.inline
  def apply(
    base: java.lang.String,
    basename: java.lang.String,
    cwd: java.lang.String,
    dirname: java.lang.String,
    extname: java.lang.String,
    path: java.lang.String,
    stem: java.lang.String,
    contents: nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream = null,
    sourceMap: js.Any = null
  ): VinylFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("basename")(basename)
    __obj.updateDynamic("cwd")(cwd)
    __obj.updateDynamic("dirname")(dirname)
    __obj.updateDynamic("extname")(extname)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("stem")(stem)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[VinylFile]
  }
}

