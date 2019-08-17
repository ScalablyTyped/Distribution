package typings.issueDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object issueDashParserMod {
  import org.scalablytyped.runtime.StringDictionary

  type Actions = StringDictionary[js.Array[Action]]
  type Parser = js.Function1[/* text */ String, Result]
}
