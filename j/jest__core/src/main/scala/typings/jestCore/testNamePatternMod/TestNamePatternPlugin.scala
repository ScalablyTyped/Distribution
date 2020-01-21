package typings.jestCore.testNamePatternMod

import typings.jestCore.AnonKey
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait TestNamePatternPlugin extends js.Object {
  var _prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any
  var isInternal: `true`
  def getUsageInfo(): AnonKey
  def onKey(key: String): Unit
  def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit]
}

object TestNamePatternPlugin {
  @scala.inline
  def apply(
    _prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any,
    getUsageInfo: () => AnonKey,
    isInternal: `true`,
    onKey: String => Unit,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Unit]
  ): TestNamePatternPlugin = {
    val __obj = js.Dynamic.literal(_prompt = _prompt.asInstanceOf[js.Any], getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
  
    __obj.asInstanceOf[TestNamePatternPlugin]
  }
}

