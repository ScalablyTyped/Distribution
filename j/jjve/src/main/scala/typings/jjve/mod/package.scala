package typings.jjve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ typings.jjv.mod.Errors, 
    js.Array[typings.jjve.mod.Issue]
  ]
}
