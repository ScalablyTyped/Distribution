package typings
package markoLib.srcComponentsTaglibTransformHelperGetComponentFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentFiles extends js.Object {
  var browserFile: java.lang.String | scala.Null
  var file: java.lang.String | scala.Null
  var `package`: java.lang.String | scala.Null
  var styles: js.Array[java.lang.String]
}

object ComponentFiles {
  @scala.inline
  def apply(
    styles: js.Array[java.lang.String],
    browserFile: java.lang.String = null,
    file: java.lang.String = null,
    `package`: java.lang.String = null
  ): ComponentFiles = {
    val __obj = js.Dynamic.literal(styles = styles)
    if (browserFile != null) __obj.updateDynamic("browserFile")(browserFile)
    if (file != null) __obj.updateDynamic("file")(file)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[ComponentFiles]
  }
}

