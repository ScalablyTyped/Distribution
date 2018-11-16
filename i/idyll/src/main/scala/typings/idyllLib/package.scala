package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllLib {
  type ComponentFiles = idyllLib.idyllLibStrings.COMPONENT_DIRS | idyllLib.idyllLibStrings.DEFAULT_COMPONENT_DIRS
  type Paths = (stdLib.Record[PredefinedFile, java.lang.String]) with (stdLib.Record[ComponentFiles, js.Array[java.lang.String]])
  type PredefinedFile = idyllLib.idyllLibStrings.APP_PATH | idyllLib.idyllLibStrings.CSS_INPUT_FILE | idyllLib.idyllLibStrings.DATA_DIR | idyllLib.idyllLibStrings.HTML_TEMPLATE_FILE | idyllLib.idyllLibStrings.IDYLL_INPUT_FILE | idyllLib.idyllLibStrings.INPUT_DIR | idyllLib.idyllLibStrings.PACKAGE_FILE | idyllLib.idyllLibStrings.OUTPUT_DIR | idyllLib.idyllLibStrings.TMP_DIR | idyllLib.idyllLibStrings.CSS_OUTPUT_FILE | idyllLib.idyllLibStrings.HTML_OUTPUT_FILE | idyllLib.idyllLibStrings.JS_OUTPUT_FILE
}
