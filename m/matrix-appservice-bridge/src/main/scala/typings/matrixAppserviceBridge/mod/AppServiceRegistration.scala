package typings.matrixAppserviceBridge.mod

import typings.matrixAppservice.appServiceRegistrationMod.AppServiceOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppServiceRegistration")
@js.native
class AppServiceRegistration ()
  extends typings.matrixAppservice.mod.AppServiceRegistration {
  def this(url: String) = this()
}
/* static members */
object AppServiceRegistration {
  
  /**
    * Convert a JSON object to an AppServiceRegistration object.
    * @static
    * @param obj The registration object
    * @return The registration.
    */
  @JSImport("matrix-appservice-bridge", "AppServiceRegistration.fromObject")
  @js.native
  def fromObject(obj: AppServiceOutput): typings.matrixAppservice.appServiceRegistrationMod.AppServiceRegistration = js.native
  
  /**
    * Generate a random token.
    * @return {string} A randomly generated token.
    */
  @JSImport("matrix-appservice-bridge", "AppServiceRegistration.generateToken")
  @js.native
  def generateToken(): String = js.native
}
