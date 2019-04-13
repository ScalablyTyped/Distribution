package typings
package localizedDashStringsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localizedDashStringsMod {
  type FormatObject[U /* <: Formatted */] = org.scalablytyped.runtime.StringDictionary[U]
  type Formatted = scala.Double | java.lang.String
  type GetInterfaceLanguageCallback = js.Function0[java.lang.String]
  type GlobalStrings[T] = org.scalablytyped.runtime.StringDictionary[T]
  type LocalizedStrings[T] = LocalizedStringsMethods with T
}
