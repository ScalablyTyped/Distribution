package typings.jsrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrp", "server")
@js.native
/** Client SRP constructor */
class server () extends js.Object {
  
  /**
    * Verifies the clients's M1 proof against the server's.
    * @param M1hex - hex representation of M1
    * @returns true if it matches the server's proof, false if it doesn't
    */
  def checkClientProof(M1hex: String): Boolean = js.native
  
  /**
    * Returns the hex representation of the server's M2 proof
    * @returns hex representation of M2
    */
  def getProof(): String = js.native
  
  /**
    * Returns the hex representation of the server's B value
    * @returns hex representation of B
    */
  def getPublicKey(): String = js.native
  
  /**
    * Returns the hex representation of the salt, as was passed into {@link init}
    * @returns hex representation of the salt
    */
  def getSalt(): String = js.native
  
  /**
    * Returns the hex representation of the shared secret key, K
    * @returns hex representation of K
    */
  def getSharedKey(): String = js.native
  
  /**
    * Initialise the server SRP and calculate needed SRP values
    * @param options - the server options including the verifier and salt
    * @param callback - called when the server instance is ready to use
    */
  def init(options: ServerOptions, callback: js.Function0[_]): Unit = js.native
  
  /**
    * Sets the client's A value on the server, and compute values to complete authentication
    * @param hexA - hex representation of A
    * @throws Will throw an error if the client provides an incorrect value
    */
  def setClientPublicKey(hexA: String): Unit = js.native
}
