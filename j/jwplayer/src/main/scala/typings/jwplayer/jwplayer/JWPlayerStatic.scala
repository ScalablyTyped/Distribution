package typings.jwplayer.jwplayer

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWPlayerStatic extends js.Object {
  
  def apply(): JWPlayer = js.native
  def apply(query: String): JWPlayer = js.native
  def apply(query: Double): JWPlayer = js.native
  def apply(query: Element): JWPlayer = js.native
  
  var key: String = js.native
  
  var version: String = js.native
}
