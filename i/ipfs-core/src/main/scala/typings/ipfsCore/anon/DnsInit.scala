package typings.ipfsCore.anon

import typings.ipfsCore.dnsMod.DNSSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsInit extends js.Object {
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  
  def init(): js.Promise[Key] = js.native
  def init(options: js.Any): js.Promise[Key] = js.native
  
  def isOnline(): Boolean = js.native
}
