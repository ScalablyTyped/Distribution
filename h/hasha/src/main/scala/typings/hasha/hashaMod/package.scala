package typings.hasha

import typings.hasha.hashaStrings.md5
import typings.hasha.hashaStrings.sha1
import typings.hasha.hashaStrings.sha256
import typings.hasha.hashaStrings.sha512
import typings.node.Buffer
import typings.typeDashFest.typeDashFestMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashaMod {
  type AlgorithmName = LiteralUnion[md5 | sha1 | sha256 | sha512, String]
  type HashaInput = Buffer | String | (js.Array[Buffer | String])
}
