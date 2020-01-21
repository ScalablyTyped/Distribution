package typings.jestImageSnapshot.mod._Global_

import typings.jestImageSnapshot.mod.MatchImageSnapshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  @js.native
  trait Matchers[R, T] extends js.Object {
    def toMatchImageSnapshot(): R = js.native
    def toMatchImageSnapshot(options: MatchImageSnapshotOptions): R = js.native
  }
  
}

