package typings.listr

import typings.node.streamMod.Readable
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listrMod {
  type ListrContext = js.Any
  type ListrTaskResult[Ctx] = String | js.Promise[js.Any] | Listr[Ctx] | Readable | Observable[js.Any]
}
