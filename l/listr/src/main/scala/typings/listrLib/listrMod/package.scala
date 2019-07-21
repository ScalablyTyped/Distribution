package typings
package listrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listrMod {
  type ListrContext = js.Any
  type ListrTaskResult[Ctx] = java.lang.String | js.Promise[js.Any] | Listr[Ctx] | nodeLib.streamMod.Readable | rxjsLib.rxjsMod.Observable[js.Any]
}
