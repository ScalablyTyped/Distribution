package typings.localizedDashStrings

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localizedDashStringsMod {
  type FormatObject[U /* <: Formatted */] = StringDictionary[U]
  type Formatted = Double | String
  type GetInterfaceLanguageCallback = js.Function0[String]
  type GlobalStrings[T] = StringDictionary[T]
  type LocalizedStrings[T] = LocalizedStringsMethods with T
}
