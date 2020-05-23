package typings.jestCore

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/watch_plugins_helpers", JSImport.Namespace)
@js.native
object watchPluginsHelpersMod extends js.Object {
  def filterInteractivePlugins(
    watchPlugins: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchPlugin */ _
    ],
    globalConfig: GlobalConfig
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchPlugin */ _
  ] = js.native
  def getSortedUsageRows(
    watchPlugins: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchPlugin */ _
    ],
    globalConfig: GlobalConfig
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageData */ _
  ] = js.native
}

