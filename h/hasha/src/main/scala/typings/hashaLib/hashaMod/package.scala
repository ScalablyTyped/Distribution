package typings
package hashaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashaMod {
  type AlgorithmName = typeDashFestLib.typeDashFestMod.LiteralUnion[
    hashaLib.hashaLibStrings.md5 | hashaLib.hashaLibStrings.sha1 | hashaLib.hashaLibStrings.sha256 | hashaLib.hashaLibStrings.sha512, 
    java.lang.String
  ]
  type HashaInput = nodeLib.Buffer | java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String])
}
