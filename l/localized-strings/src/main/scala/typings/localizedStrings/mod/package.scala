package typings.localizedStrings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatObject[U /* <: typings.localizedStrings.mod.Formatted */] = org.scalablytyped.runtime.StringDictionary[U]
  type Formatted = scala.Double | java.lang.String
  type GetInterfaceLanguageCallback = js.Function0[java.lang.String]
  type GlobalStrings[T] = org.scalablytyped.runtime.StringDictionary[T]
  type LocalizedStrings[T] = typings.localizedStrings.mod.LocalizedStringsMethods with T
}
