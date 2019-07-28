package typings.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object log4jsMod {
  type Format = String | (js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* formatter */ js.Function1[/* str */ String, String], 
    String
  ])
  type Token = (js.Function1[/* logEvent */ LoggingEvent, String]) | String
}
