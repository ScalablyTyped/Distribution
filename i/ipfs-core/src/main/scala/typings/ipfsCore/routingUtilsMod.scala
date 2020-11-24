package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/ipns/routing/utils", JSImport.Namespace)
@js.native
object routingUtilsMod extends js.Object {
  
  def encodeBase32(buf: js.Any): js.Any = js.native
  
  def selector(_k: js.Any, records: js.Any): js.Any = js.native
  
  @js.native
  object validator extends js.Object {
    
    def func(key: js.Any, record: js.Any, cb: js.Any): js.Any = js.native
  }
}
