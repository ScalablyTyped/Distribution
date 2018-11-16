package typings
package localizedDashStringsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localizedDashStringsMod {
  type Formatted = scala.Double | java.lang.String
  type GetInterfaceLanguageCallback = js.Function0[java.lang.String]
  type LocalizedStrings[T] = LocalizedStringsMethods with T
}
