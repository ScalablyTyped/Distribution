package typings.kurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ typings.kurentoClient.mod.Error, /* result */ T, scala.Unit]
}
