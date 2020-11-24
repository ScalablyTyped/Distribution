package typings.libp2pNoise

import typings.bl.mod.^
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class FailedIKError protected () extends Error {
    def this(initialMsg: String) = this()
    def this(initialMsg: ^) = this()
    def this(initialMsg: Buffer) = this()
    def this(initialMsg: String, message: String) = this()
    def this(initialMsg: ^, message: String) = this()
    def this(initialMsg: Buffer, message: String) = this()
    
    var initialMsg: String | ^  | Buffer = js.native
  }
}
