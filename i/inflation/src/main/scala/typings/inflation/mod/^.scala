package typings.inflation.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inflation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Automatically unzip an HTTP stream.
    *
    * @returns a stream that emits inflated data from the given stream.
    */
  def apply(req: Readable): Readable = js.native
  def apply(req: Readable, options: Options): Readable = js.native
}
