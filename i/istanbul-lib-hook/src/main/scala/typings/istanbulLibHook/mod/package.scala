package typings.istanbulLibHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Matcher = js.Function1[/* filename */ java.lang.String, scala.Boolean]
  type Transformer = js.Function2[
    /* code */ java.lang.String, 
    /* options */ typings.istanbulLibHook.mod.TransformerOptions, 
    java.lang.String
  ]
}
