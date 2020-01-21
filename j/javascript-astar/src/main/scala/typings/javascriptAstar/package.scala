package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javascriptAstar {
  type Heuristic = js.Function2[
    /* pos0 */ typings.javascriptAstar.AnonX, 
    /* pos1 */ typings.javascriptAstar.AnonX, 
    scala.Double
  ]
}
