package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Format = java.lang.String | (js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* formatter */ js.Function1[/* str */ java.lang.String, java.lang.String], 
    java.lang.String
  ])
  type Token = (js.Function1[/* logEvent */ typings.log4js.mod.LoggingEvent, java.lang.String]) | java.lang.String
}
