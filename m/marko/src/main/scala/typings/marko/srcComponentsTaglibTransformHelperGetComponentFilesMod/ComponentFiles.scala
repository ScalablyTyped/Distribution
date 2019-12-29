package typings.marko.srcComponentsTaglibTransformHelperGetComponentFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentFiles extends js.Object {
  @JSName("package")
  var _package: String | Null
  var browserFile: String | Null
  var file: String | Null
  var styles: js.Array[String]
}

object ComponentFiles {
  @scala.inline
  def apply(styles: js.Array[String], _package: String = null, browserFile: String = null, file: String = null): ComponentFiles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (browserFile != null) __obj.updateDynamic("browserFile")(browserFile.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFiles]
  }
}

