package typings.lgtv2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecializedSocket extends js.Object {
  
  def close(): Unit = js.native
  
  def send(`type`: String): Unit = js.native
  def send(`type`: String, payload: js.Any): Unit = js.native
}
