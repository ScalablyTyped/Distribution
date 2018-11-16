package typings
package koaDashJwtLib.koaDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jwtNs {
  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    stdLib.Promise[
      java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
    ]
  ]
}
