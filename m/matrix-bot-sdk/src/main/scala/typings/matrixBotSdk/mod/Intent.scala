package typings.matrixBotSdk.mod

import typings.matrixBotSdk.appserviceMod.IAppserviceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "Intent")
@js.native
open class Intent protected ()
  extends typings.matrixBotSdk.intentMod.Intent {
  /**
    * Creates a new intent. Intended to be created by application services.
    * @param {IAppserviceOptions} options The options for the application service.
    * @param {string} impersonateUserId The user ID to impersonate.
    * @param {Appservice} appservice The application service itself.
    */
  def this(
    options: IAppserviceOptions,
    impersonateUserId: String,
    appservice: typings.matrixBotSdk.appserviceMod.Appservice
  ) = this()
}
