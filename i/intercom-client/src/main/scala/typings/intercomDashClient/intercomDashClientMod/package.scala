package typings.intercomDashClient

import typings.intercomDashClient.intercomErrorMod.IntercomError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intercomDashClientMod {
  type callback[T] = (js.Function1[/* d */ T, Unit]) | (js.Function2[/* err */ IntercomError, /* d */ T, Unit])
}
