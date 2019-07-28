package typings.graphviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphvizMod {
  type Edge = HasAttributes
  type ErrorCallback = js.Function3[/* code */ Double, /* stdout */ String, /* stderr */ String, Unit]
  type Node = HasAttributes
  type OutputCallback = js.Function1[/* data */ String, Unit]
  type ParseCallback = js.Function1[/* graph */ Graph, Unit]
}
