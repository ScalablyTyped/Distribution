package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpretMod {
  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  type Extensions = StringDictionary[Extension | Null]
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}
