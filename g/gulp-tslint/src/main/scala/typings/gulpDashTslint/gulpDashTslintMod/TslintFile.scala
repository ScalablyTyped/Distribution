package typings.gulpDashTslint.gulpDashTslintMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TslintFile extends js.Object {
  var contents: Buffer | js.Any
  var path: String
  var relative: String
  var tslint: js.Any
  def isNull(): Boolean
  def isStream(): Boolean
}

object TslintFile {
  @scala.inline
  def apply(
    contents: Buffer | js.Any,
    isNull: () => Boolean,
    isStream: () => Boolean,
    path: String,
    relative: String,
    tslint: js.Any
  ): TslintFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = js.Any.fromFunction0(isNull), isStream = js.Any.fromFunction0(isStream), path = path, relative = relative, tslint = tslint)
  
    __obj.asInstanceOf[TslintFile]
  }
}

