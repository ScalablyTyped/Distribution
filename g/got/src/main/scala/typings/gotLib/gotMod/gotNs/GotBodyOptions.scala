package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GotBodyOptions[E /* <: java.lang.String | scala.Null */] extends GotOptions[E] {
  var body: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var hooks: js.UndefOr[Hooks[GotBodyOptions[E]]] = js.undefined
}

