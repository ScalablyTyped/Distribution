package typings.linkifyjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkifyjsMod {
  type EventHandler = js.Function1[/* e */ HTMLElement, Unit]
  type PossiblyByType[T] = T | StringDictionary[js.UndefOr[T]]
  type PossiblyFuncOfHrefAndType[T] = T | (js.Function2[/* href */ String, /* type */ String, T])
}
