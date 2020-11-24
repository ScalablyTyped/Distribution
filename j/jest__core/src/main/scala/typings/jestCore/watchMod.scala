package typings.jestCore

import typings.jestCore.typesMod.Filter
import typings.jestHasteMap.mod.^
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.mod.JestHook
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/watch", JSImport.Namespace)
@js.native
object watchMod extends js.Object {
  
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
    stdin: js.UndefOr[scala.Nothing],
    hooks: js.UndefOr[scala.Nothing],
    filter: Filter
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: js.UndefOr[scala.Nothing],
    hooks: JestHook
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: js.UndefOr[scala.Nothing],
    hooks: JestHook,
    filter: Filter
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
    hooks: js.UndefOr[scala.Nothing],
    filter: Filter
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: JestHook
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: JestHook,
    filter: Filter
  ): js.Promise[Unit] = js.native
}
