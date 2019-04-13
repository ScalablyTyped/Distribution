package typings
package imageminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imageminMod {
  type Plugin = js.Function1[/* input */ nodeLib.Buffer, js.Promise[nodeLib.Buffer]]
}
