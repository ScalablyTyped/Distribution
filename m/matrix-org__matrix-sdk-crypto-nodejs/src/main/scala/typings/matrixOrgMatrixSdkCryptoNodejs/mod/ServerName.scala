package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "ServerName")
@js.native
open class ServerName protected () extends StObject {
  /** Parse/validate and create a new `ServerName`. */
  def this(name: String) = this()
  
  /**
    * Returns the host of the server name.
    *
    * That is: Return the part of the server before `:<port>` or the
    * full server name if there is no port.
    */
  def host: String = js.native
  
  /**
    * Returns true if and only if the server name is an IPv4 or IPv6
    * address.
    */
  def isIpLiteral(): Boolean = js.native
  
  /** Returns the port of the server name if any. */
  def port: Double | Null = js.native
}
