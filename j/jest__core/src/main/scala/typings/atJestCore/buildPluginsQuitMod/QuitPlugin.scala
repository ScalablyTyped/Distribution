package typings.atJestCore.buildPluginsQuitMod

import typings.atJestCore.Anon_Key
import typings.atJestCore.atJestCoreNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait QuitPlugin extends js.Object {
  var isInternal: `true`
  def getUsageInfo(): Anon_Key
  def run(): js.Promise[Unit]
}

object QuitPlugin {
  @scala.inline
  def apply(getUsageInfo: () => Anon_Key, isInternal: `true`, run: () => js.Promise[Unit]): QuitPlugin = {
    val __obj = js.Dynamic.literal(getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[QuitPlugin]
  }
}

