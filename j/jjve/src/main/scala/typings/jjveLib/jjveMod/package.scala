package typings
package jjveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jjveMod {
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ jjvLib.jjvMod.Errors, 
    js.Array[Issue]
  ]
}
