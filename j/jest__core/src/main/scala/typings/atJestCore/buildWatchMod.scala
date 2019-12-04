package typings.atJestCore

import typings.atJestCore.buildTypesMod.Filter
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.^
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/watch", JSImport.Namespace)
@js.native
object buildWatchMod extends js.Object {
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^]
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any,
    filter: Filter
  ): js.Promise[Unit] = js.native
}

