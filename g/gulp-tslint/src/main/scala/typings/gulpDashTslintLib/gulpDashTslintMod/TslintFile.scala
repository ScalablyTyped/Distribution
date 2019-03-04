package typings
package gulpDashTslintLib.gulpDashTslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TslintFile extends js.Object {
  var contents: nodeLib.Buffer | js.Any
  var path: java.lang.String
  var relative: java.lang.String
  var tslint: js.Any
  def isNull(): scala.Boolean
  def isStream(): scala.Boolean
}

object TslintFile {
  @scala.inline
  def apply(
    contents: nodeLib.Buffer | js.Any,
    isNull: js.Function0[scala.Boolean],
    isStream: js.Function0[scala.Boolean],
    path: java.lang.String,
    relative: java.lang.String,
    tslint: js.Any
  ): TslintFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = isNull, isStream = isStream, path = path, relative = relative, tslint = tslint)
  
    __obj.asInstanceOf[TslintFile]
  }
}

