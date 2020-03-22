package typings.hasha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlgorithmName = typings.typeFest.literalUnionMod.LiteralUnion[
    typings.hasha.hashaStrings.md5 | typings.hasha.hashaStrings.sha1 | typings.hasha.hashaStrings.sha256 | typings.hasha.hashaStrings.sha512, 
    java.lang.String
  ]
  type HashaInput = typings.node.Buffer | java.lang.String | (js.Array[typings.node.Buffer | java.lang.String])
}
