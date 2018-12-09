package typings
package imageminLib.imageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imageminNs {
  type Plugin = js.Function1[/* input */ nodeLib.Buffer, js.Promise[nodeLib.Buffer]]
}
