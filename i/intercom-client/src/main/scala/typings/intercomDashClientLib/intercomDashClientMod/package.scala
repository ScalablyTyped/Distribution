package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intercomDashClientMod {
  type callback[T] = (js.Function1[/* d */ T, scala.Unit]) | (js.Function2[
    /* err */ intercomDashClientLib.intercomerrorMod.IntercomError, 
    /* d */ T, 
    scala.Unit
  ])
}
