package typings.hippyReact.mod

import typings.hippyReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkModule extends StObject {
  
  def getCookies(url: String): js.Promise[String] = js.native
  
  def setCookie(url: String, keyValue: String): js.Promise[Unit] = js.native
  def setCookie(url: String, keyValue: String, expires: String): js.Promise[Unit] = js.native
}
object NetworkModule {
  
  inline def apply: NetworkModule = ^.asInstanceOf[js.Dynamic].selectDynamic("NetworkModule").asInstanceOf[NetworkModule]
}
