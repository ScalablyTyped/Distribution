package typings.loadJsonFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BeforeParse = js.Function1[/* data */ java.lang.String, java.lang.String]
  type Reviver = js.ThisFunction2[/* this */ js.Any, /* key */ java.lang.String, /* value */ js.Any, js.Any]
}
