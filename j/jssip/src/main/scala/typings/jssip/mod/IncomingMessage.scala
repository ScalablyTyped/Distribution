package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingMessage extends js.Object {
  
  var body: js.UndefOr[String] = js.native
  
  def countHeader(name: String): Double = js.native
  
  var from: NameAddrHeader = js.native
  
  def getHeader(name: String): String = js.native
  
  def getHeaders(name: String): js.Array[String] = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  var method: String = js.native
  
  def parseHeader(name: String): js.UndefOr[scala.Nothing] = js.native
  def parseHeader(name: String, idx: Double): js.UndefOr[scala.Nothing] = js.native
  
  var to: NameAddrHeader = js.native
}
