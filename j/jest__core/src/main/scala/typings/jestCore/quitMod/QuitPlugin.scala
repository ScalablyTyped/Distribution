package typings.jestCore.quitMod

import typings.jestCore.AnonKey
import typings.jestCore.jestCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait QuitPlugin extends js.Object {
  var isInternal: `true`
  def getUsageInfo(): AnonKey
  def run(): js.Promise[Unit]
}

object QuitPlugin {
  @scala.inline
  def apply(getUsageInfo: () => AnonKey, isInternal: `true`, run: () => js.Promise[Unit]): QuitPlugin = {
    val __obj = js.Dynamic.literal(getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[QuitPlugin]
  }
}

