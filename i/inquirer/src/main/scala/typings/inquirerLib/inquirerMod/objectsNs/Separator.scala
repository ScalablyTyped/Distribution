package typings
package inquirerLib.inquirerMod.objectsNs

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
  extends inquirerLib.inquirerMod._ChoiceType {
  var line: java.lang.String
  var `type`: java.lang.String
}

object Separator {
  @scala.inline
  def apply(line: java.lang.String, toString: () => java.lang.String, `type`: java.lang.String): Separator = {
    val __obj = js.Dynamic.literal(line = line, toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Separator]
  }
}

