package typings.jestCore

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/lib/handleDeprecationWarnings", JSImport.Namespace)
@js.native
object handleDeprecationWarningsMod extends js.Object {
  
  def default(pipe: WriteStream): js.Promise[Unit] = js.native
  def default(pipe: WriteStream, stdin: ReadStream): js.Promise[Unit] = js.native
}
