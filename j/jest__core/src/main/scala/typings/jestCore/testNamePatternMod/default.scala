package typings.jestCore.testNamePatternMod

import typings.jestCore.anon.Key
import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/test_name_pattern", JSImport.Default)
@js.native
class default protected () extends TestNamePatternPlugin {
  def this(options: Stdin) = this()
  /* CompleteClass */
  override var _prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any = js.native
  /* CompleteClass */
  override var isInternal: `true` = js.native
  /* CompleteClass */
  override def getUsageInfo(): Key = js.native
  /* CompleteClass */
  override def onKey(key: String): Unit = js.native
  /* CompleteClass */
  override def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit] = js.native
}

