package typings.mailgunDashJs.mailgunDashJsMod

import typings.mailgunDashJs.mailgunDashJsMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationNs {
  type ValidationCallback = js.Function2[/* error */ Error, /* body */ ValidateResponse, Unit]
}
