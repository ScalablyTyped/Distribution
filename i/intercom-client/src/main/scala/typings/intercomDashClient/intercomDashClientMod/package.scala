package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intercomDashClientMod {
  import typings.intercomDashClient.intercomErrorMod.IntercomError

  type callback[T] = (js.Function1[/* d */ T, Unit]) | (js.Function2[/* err */ IntercomError, /* d */ T, Unit])
}
