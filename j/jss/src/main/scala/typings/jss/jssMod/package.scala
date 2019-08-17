package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jssMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jss.Anon_ClassNamePrefix
  import typings.jss.Anon_Data
  import typings.jss.cssMod.Style
  import typings.std.Partial
  import typings.std.Record

  type Classes[Name /* <: String */] = Record[Name, String]
  type CreateStyleSheetOptions[Name /* <: String */] = Partial[Anon_ClassNamePrefix[Name]]
  type GenerateClassName[Name /* <: String */] = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[Name]], String]
  type JSSPlugin = StringDictionary[Partial[Anon_Data]]
  type Styles[Name /* <: String */] = Record[Name, Style]
}
