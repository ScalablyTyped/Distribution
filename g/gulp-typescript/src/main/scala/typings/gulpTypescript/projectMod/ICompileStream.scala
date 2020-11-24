package typings.gulpTypescript.projectMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompileStream
  extends ReadableStream
     with WritableStream {
  
  var dts: Readable = js.native
  
  @JSName("js")
  var js_ : Readable = js.native
}
