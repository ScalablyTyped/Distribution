package typings.jsforce

import typings.jsforce.streamingMod.Streaming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/channel", JSImport.Namespace)
@js.native
object channelMod extends js.Object {
  
  @js.native
  class Channel protected () extends js.Object {
    def this(streaming: Streaming, name: String) = this()
  }
}
