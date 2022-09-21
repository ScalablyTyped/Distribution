package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.Thenable
import typings.vscode.anon.AuthenticationGetSessionO
import typings.vscode.anon.AuthenticationGetSessionOClearSessionPreference
import typings.vscode.mod.AuthenticationGetSessionOptions
import typings.vscode.mod.AuthenticationProvider
import typings.vscode.mod.AuthenticationProviderOptions
import typings.vscode.mod.AuthenticationSession
import typings.vscode.mod.AuthenticationSessionsChangeEvent
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  @JSGlobal("vscode.authentication")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSession(providerId: String, scopes: js.Array[String]): Thenable[js.UndefOr[AuthenticationSession]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[AuthenticationSession]]]
  inline def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionO): Thenable[AuthenticationSession] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[AuthenticationSession]]
  inline def getSession(
    providerId: String,
    scopes: js.Array[String],
    options: AuthenticationGetSessionOClearSessionPreference
  ): Thenable[AuthenticationSession] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[AuthenticationSession]]
  inline def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionOptions): Thenable[js.UndefOr[AuthenticationSession]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[AuthenticationSession]]]
  
  @JSGlobal("vscode.authentication.onDidChangeSessions")
  @js.native
  val onDidChangeSessions: Event[AuthenticationSessionsChangeEvent] = js.native
  
  inline def registerAuthenticationProvider(id: String, label: String, provider: AuthenticationProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerAuthenticationProvider(
    id: String,
    label: String,
    provider: AuthenticationProvider,
    options: AuthenticationProviderOptions
  ): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
}
