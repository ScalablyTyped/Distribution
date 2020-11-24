package typings.httpBasic

import typings.httpResponseObject.mod.^
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic/lib/Callback", JSImport.Namespace)
@js.native
object callbackMod extends js.Object {
  
  type Callback = js.Function2[/* err */ ErrnoException | Null, /* response */ js.UndefOr[^[ReadableStream]], Unit]
}
