package typings.graphviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Edge = typings.graphviz.mod.HasAttributes
  type ErrorCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    scala.Unit
  ]
  type Node = typings.graphviz.mod.HasAttributes
  type OutputCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type ParseCallback = js.Function1[/* graph */ typings.graphviz.mod.Graph_, scala.Unit]
}
