package typings.inquirer.inquirerMod.objectsNs

import typings.inquirer.inquirerMod._ChoiceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Separator object
  * Used to space/separate choices group
  * @constructor
  * @param {String} line   Separation line content (facultative)
  */
trait Separator
  extends _ChoiceType[js.Any] {
  var line: String
  var `type`: String
}

object Separator {
  @scala.inline
  def apply(line: String, toString: () => String, `type`: String): Separator = {
    val __obj = js.Dynamic.literal(line = line, toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Separator]
  }
}

