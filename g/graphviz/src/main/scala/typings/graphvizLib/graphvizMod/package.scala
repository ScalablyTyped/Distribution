package typings
package graphvizLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphvizMod {
  type Edge = HasAttributes
  type ErrorCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    scala.Unit
  ]
  type Node = HasAttributes
  type OutputCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type ParseCallback = js.Function1[/* graph */ Graph, scala.Unit]
}
