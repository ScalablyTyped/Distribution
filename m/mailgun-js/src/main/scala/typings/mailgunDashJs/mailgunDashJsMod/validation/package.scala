package typings.mailgunDashJs.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validation {
  import typings.mailgunDashJs.mailgunDashJsMod.Error

  type ValidationCallback = js.Function2[/* error */ Error, /* body */ ValidateResponse, Unit]
}
