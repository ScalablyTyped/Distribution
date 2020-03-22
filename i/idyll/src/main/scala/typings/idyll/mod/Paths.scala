package typings.idyll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<idyll.idyll.PredefinedFile, string> & std.Record<idyll.idyll.ComponentFiles, std.Array<string>> */
trait Paths extends js.Object {
  var APP_PATH: String
  var COMPONENT_DIRS: js.Array[String]
  var CSS_INPUT_FILE: String
  var CSS_OUTPUT_FILE: String
  var DATA_DIR: String
  var DEFAULT_COMPONENT_DIRS: js.Array[String]
  var HTML_OUTPUT_FILE: String
  var HTML_TEMPLATE_FILE: String
  var IDYLL_INPUT_FILE: String
  var INPUT_DIR: String
  var JS_OUTPUT_FILE: String
  var OUTPUT_DIR: String
  var PACKAGE_FILE: String
  var TMP_DIR: String
}

object Paths {
  @scala.inline
  def apply(
    APP_PATH: String,
    COMPONENT_DIRS: js.Array[String],
    CSS_INPUT_FILE: String,
    CSS_OUTPUT_FILE: String,
    DATA_DIR: String,
    DEFAULT_COMPONENT_DIRS: js.Array[String],
    HTML_OUTPUT_FILE: String,
    HTML_TEMPLATE_FILE: String,
    IDYLL_INPUT_FILE: String,
    INPUT_DIR: String,
    JS_OUTPUT_FILE: String,
    OUTPUT_DIR: String,
    PACKAGE_FILE: String,
    TMP_DIR: String
  ): Paths = {
    val __obj = js.Dynamic.literal(APP_PATH = APP_PATH.asInstanceOf[js.Any], COMPONENT_DIRS = COMPONENT_DIRS.asInstanceOf[js.Any], CSS_INPUT_FILE = CSS_INPUT_FILE.asInstanceOf[js.Any], CSS_OUTPUT_FILE = CSS_OUTPUT_FILE.asInstanceOf[js.Any], DATA_DIR = DATA_DIR.asInstanceOf[js.Any], DEFAULT_COMPONENT_DIRS = DEFAULT_COMPONENT_DIRS.asInstanceOf[js.Any], HTML_OUTPUT_FILE = HTML_OUTPUT_FILE.asInstanceOf[js.Any], HTML_TEMPLATE_FILE = HTML_TEMPLATE_FILE.asInstanceOf[js.Any], IDYLL_INPUT_FILE = IDYLL_INPUT_FILE.asInstanceOf[js.Any], INPUT_DIR = INPUT_DIR.asInstanceOf[js.Any], JS_OUTPUT_FILE = JS_OUTPUT_FILE.asInstanceOf[js.Any], OUTPUT_DIR = OUTPUT_DIR.asInstanceOf[js.Any], PACKAGE_FILE = PACKAGE_FILE.asInstanceOf[js.Any], TMP_DIR = TMP_DIR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Paths]
  }
}

