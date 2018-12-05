package typings
package interpretLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpretMod {
  type Extension = java.lang.String | ExtensionDescriptor | (js.Array[java.lang.String | ExtensionDescriptor])
  type RegisterFn = js.Function1[/* hook */ Hook, scala.Unit]
}
