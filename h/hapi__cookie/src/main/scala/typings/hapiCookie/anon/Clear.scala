package typings.hapiCookie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends js.Object {
  
  def clear(): Unit = js.native
  def clear(key: String): Unit = js.native
  
  def set(key: String, value: String): Unit = js.native
  def set(key: String, value: js.Object): Unit = js.native
  def set(session: js.Object): Unit = js.native
  
  def ttl(milliseconds: Double): Unit = js.native
}
