package typings.keytar

import typings.keytar.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keytar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deletePassword(service: String, account: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("deletePassword")(service.asInstanceOf[js.Any], account.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def findCredentials(service: String): js.Promise[js.Array[Account]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCredentials")(service.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Account]]]
  
  @scala.inline
  def findPassword(service: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPassword")(service.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  @scala.inline
  def getPassword(service: String, account: String): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(service.asInstanceOf[js.Any], account.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  @scala.inline
  def setPassword(service: String, account: String, password: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(service.asInstanceOf[js.Any], account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
