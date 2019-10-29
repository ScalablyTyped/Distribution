package typings.htmlDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlDashValidatorMod {
  type ValidationMessageLocationObject = ValidationMessageSimpleObject with ValidationMessageBasicLocationObject
  type ValidationMessageObject = ValidationMessageSimpleObject | ValidationMessageLocationObject
  type ValidationMessageSimpleObject = (ValidationMessageBasicErrorObject | ValidationMessageBasicInfoObject | ValidationMessageBasicNonDocumentErrorObject) with ValidationMessageBasicObject
}
