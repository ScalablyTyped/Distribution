package typings.looksSame.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same", "createDiff")
@js.native
object createDiff extends js.Object {
  
  def apply(
    options: CreateDiffAsBufferOptions,
    callback: js.Function2[/* error */ Error | Null, /* buffer */ Buffer, _]
  ): Unit = js.native
  def apply(options: CreateDiffOptions, callback: js.Function1[/* error */ Error | Null, _]): Unit = js.native
}
