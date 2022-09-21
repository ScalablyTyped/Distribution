package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.Thenable
import typings.vscode.mod.Clipboard
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  @JSGlobal("vscode.env")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("vscode.env.appHost")
  @js.native
  val appHost: String = js.native
  
  @JSGlobal("vscode.env.appName")
  @js.native
  val appName: String = js.native
  
  @JSGlobal("vscode.env.appRoot")
  @js.native
  val appRoot: String = js.native
  
  inline def asExternalUri(target: typings.vscode.mod.Uri): Thenable[typings.vscode.mod.Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("asExternalUri")(target.asInstanceOf[js.Any]).asInstanceOf[Thenable[typings.vscode.mod.Uri]]
  
  @JSGlobal("vscode.env.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSGlobal("vscode.env.isNewAppInstall")
  @js.native
  val isNewAppInstall: Boolean = js.native
  
  @JSGlobal("vscode.env.isTelemetryEnabled")
  @js.native
  val isTelemetryEnabled: Boolean = js.native
  
  @JSGlobal("vscode.env.language")
  @js.native
  val language: String = js.native
  
  @JSGlobal("vscode.env.machineId")
  @js.native
  val machineId: String = js.native
  
  @JSGlobal("vscode.env.onDidChangeTelemetryEnabled")
  @js.native
  val onDidChangeTelemetryEnabled: Event[Boolean] = js.native
  
  inline def openExternal(target: typings.vscode.mod.Uri): Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openExternal")(target.asInstanceOf[js.Any]).asInstanceOf[Thenable[Boolean]]
  
  @JSGlobal("vscode.env.remoteName")
  @js.native
  val remoteName: js.UndefOr[String] = js.native
  
  @JSGlobal("vscode.env.sessionId")
  @js.native
  val sessionId: String = js.native
  
  @JSGlobal("vscode.env.shell")
  @js.native
  val shell: String = js.native
  
  @JSGlobal("vscode.env.uiKind")
  @js.native
  val uiKind: typings.vscode.mod.UIKind = js.native
  
  @JSGlobal("vscode.env.uriScheme")
  @js.native
  val uriScheme: String = js.native
}
