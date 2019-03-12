package typings
package linkifyjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkifyjsMod {
  type EventHandler = js.Function1[/* e */ stdLib.HTMLElement, scala.Unit]
  type PossiblyByType[T] = T | org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type PossiblyFuncOfHrefAndType[T] = T | (js.Function2[/* href */ java.lang.String, /* type */ java.lang.String, T])
}
