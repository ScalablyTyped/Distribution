package typings.atIonicCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesInterfaceMod {
  type BackButtonEvent = CustomEvent[BackButtonEventDetail]
  type Color = PredefinedColors | String
  type ComponentProps[T] = StringDictionary[js.Any]
  type ComponentRef = js.Function | HTMLElement | String | Null
  type ComponentTags = String
  type CssClassMap = StringDictionary[Boolean]
  type StyleEventDetail = StringDictionary[Boolean]
}
