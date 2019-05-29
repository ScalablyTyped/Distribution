package typings
package koaDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashJwtMod {
  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    js.Promise[
      java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
    ]
  ]
}
