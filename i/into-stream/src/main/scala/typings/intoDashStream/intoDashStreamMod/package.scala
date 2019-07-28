package typings.intoDashStream

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJSNs.TypedArray
import typings.std.ArrayBuffer
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intoDashStreamMod {
  type Input = Buffer | TypedArray | ArrayBuffer | String | (Iterable[Buffer | String])
  type InputObject = StringDictionary[js.Any] | Iterable[StringDictionary[js.Any]]
}
