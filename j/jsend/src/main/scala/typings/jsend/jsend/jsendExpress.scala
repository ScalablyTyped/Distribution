package typings.jsend.jsend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsendExpress extends jsendCore {
  
  def apply(err: String): Unit = js.native
  def apply(err: String, json: js.Object): Unit = js.native
  def apply(err: js.Object): Unit = js.native
  def apply(err: js.Object, json: js.Object): Unit = js.native
}
