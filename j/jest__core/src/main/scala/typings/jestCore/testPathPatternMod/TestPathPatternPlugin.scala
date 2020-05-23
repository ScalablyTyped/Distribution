package typings.jestCore.testPathPatternMod

import typings.jestCore.anon.Key
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait TestPathPatternPlugin extends js.Object {
  var _prompt: js.Any
  var isInternal: `true`
  def getUsageInfo(): Key
  def onKey(key: String): Unit
  def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit]
}

object TestPathPatternPlugin {
  @scala.inline
  def apply(
    _prompt: js.Any,
    getUsageInfo: () => Key,
    isInternal: `true`,
    onKey: String => Unit,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Unit]
  ): TestPathPatternPlugin = {
    val __obj = js.Dynamic.literal(_prompt = _prompt.asInstanceOf[js.Any], getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[TestPathPatternPlugin]
  }
}

