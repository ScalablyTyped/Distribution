package typings.jestCore.quitMod

import typings.jestCore.anon.Key
import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/quit", JSImport.Default)
@js.native
class default protected () extends QuitPlugin {
  def this(options: Stdin) = this()
  /* CompleteClass */
  override var isInternal: `true` = js.native
  /* CompleteClass */
  override def getUsageInfo(): Key = js.native
  /* CompleteClass */
  override def run(): js.Promise[Unit] = js.native
}

