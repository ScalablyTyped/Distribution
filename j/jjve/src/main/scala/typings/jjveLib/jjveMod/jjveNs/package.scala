package typings
package jjveLib.jjveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jjveNs {
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ jjvLib.jjvMod.jjvNs.Errors, 
    js.Array[Issue]
  ]
}
