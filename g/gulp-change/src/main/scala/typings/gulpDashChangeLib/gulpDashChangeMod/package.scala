package typings
package gulpDashChangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashChangeMod {
  type Callback = js.Function2[/* err */ js.Any, /* content */ java.lang.String, js.Any]
  type ChangeFunction = js.Function2[
    /* content */ java.lang.String, 
    /* callback */ Callback, 
    java.lang.String | scala.Unit
  ]
}
