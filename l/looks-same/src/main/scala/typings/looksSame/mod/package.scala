package typings.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LooksSameCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ typings.looksSame.mod.LooksSameResult, 
    scala.Unit
  ]
}
