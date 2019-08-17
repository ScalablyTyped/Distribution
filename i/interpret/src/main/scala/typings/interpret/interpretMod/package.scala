package typings.interpret

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpretMod {
  import org.scalablytyped.runtime.StringDictionary

  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  type Extensions = StringDictionary[Extension | Null]
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}
