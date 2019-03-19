package typings
package hashaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashaMod {
  type AlgorithmName = java.lang.String with hashaLib.Anon_Algorithm
  type HashaInput = nodeLib.Buffer | java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String])
}
