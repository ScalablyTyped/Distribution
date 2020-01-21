package typings.javascriptObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadsMod {
  type PostMessage[U] = js.Function1[/* data */ U, scala.Unit]
  type ResponseCallback[U] = js.Function1[/* response */ U, scala.Unit]
  type SpawnCallback[T, U] = js.Function2[
    /* data */ T, 
    /* postMessage */ typings.javascriptObfuscator.threadsMod.PostMessage[U], 
    scala.Unit
  ]
}
