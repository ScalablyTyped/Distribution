package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object log4jsLib {
  type Format = java.lang.String | (js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* formatter */ js.Function1[/* str */ java.lang.String, java.lang.String], 
    java.lang.String
  ])
}
