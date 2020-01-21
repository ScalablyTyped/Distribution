package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gestureMod {
  type GestureCallback = js.Function1[
    /* detail */ typings.ionicCore.gestureMod.GestureDetail, 
    scala.Boolean | scala.Unit
  ]
}
