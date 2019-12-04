package typings.marko.srcComponentsTaglibTransformHelperGetComponentFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentFiles extends js.Object {
  var browserFile: String | Null
  var file: String | Null
  var `package`: String | Null
  var styles: js.Array[String]
}

object ComponentFiles {
  @scala.inline
  def apply(
    styles: js.Array[String],
    browserFile: String = null,
    file: String = null,
    `package`: String = null
  ): ComponentFiles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (browserFile != null) __obj.updateDynamic("browserFile")(browserFile.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (`package` != null) __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFiles]
  }
}

