package typings.matrixAppserviceBridge.mod

import typings.matrixAppservice.appServiceRegistrationMod.AppServiceOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppServiceRegistration")
@js.native
class AppServiceRegistration ()
  extends typings.matrixAppservice.mod.AppServiceRegistration {
  def this(url: String) = this()
}
/* static members */
object AppServiceRegistration {
  
  @JSImport("matrix-appservice-bridge", "AppServiceRegistration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert a JSON object to an AppServiceRegistration object.
    * @static
    * @param obj The registration object
    * @return The registration.
    */
  @scala.inline
  def fromObject(obj: AppServiceOutput): typings.matrixAppservice.appServiceRegistrationMod.AppServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppservice.appServiceRegistrationMod.AppServiceRegistration]
  
  /**
    * Generate a random token.
    * @return {string} A randomly generated token.
    */
  @scala.inline
  def generateToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateToken")().asInstanceOf[String]
}
