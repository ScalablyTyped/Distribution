package typings.keytar

import typings.keytar.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keytar", "deletePassword")
  @js.native
  def deletePassword(service: String, account: String): js.Promise[Boolean] = js.native
  
  @JSImport("keytar", "findCredentials")
  @js.native
  def findCredentials(service: String): js.Promise[js.Array[Account]] = js.native
  
  @JSImport("keytar", "findPassword")
  @js.native
  def findPassword(service: String): js.Promise[String | Null] = js.native
  
  @JSImport("keytar", "getPassword")
  @js.native
  def getPassword(service: String, account: String): js.Promise[String | Null] = js.native
  
  @JSImport("keytar", "setPassword")
  @js.native
  def setPassword(service: String, account: String, password: String): js.Promise[Unit] = js.native
}
