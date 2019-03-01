package typings
package inquirerLib.inquirerMod.inquirerNs.objectsNs

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
  extends inquirerLib.inquirerMod.inquirerNs._ChoiceType {
  var line: java.lang.String
  var `type`: java.lang.String
}

object Separator {
  @scala.inline
  def apply(line: java.lang.String, toString: js.Function0[java.lang.String], `type`: java.lang.String): Separator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[Separator]
  }
}

