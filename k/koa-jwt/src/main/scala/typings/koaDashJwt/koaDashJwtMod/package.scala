package typings.koaDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashJwtMod {
  import typings.node.Buffer

  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    js.Promise[String | (js.Array[Buffer | String]) | Buffer]
  ]
}
