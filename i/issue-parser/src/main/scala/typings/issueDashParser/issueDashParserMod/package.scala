package typings.issueDashParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object issueDashParserMod {
  type Actions = StringDictionary[js.Array[Action]]
  type Parser = js.Function1[/* text */ String, Result]
}
