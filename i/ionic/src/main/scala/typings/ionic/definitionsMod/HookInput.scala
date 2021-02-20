package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import typings.ionic.ionicStrings.serveColonafter
import typings.ionic.ionicStrings.serveColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.BuildHookInput
  - typings.ionic.definitionsMod.ServeBeforeHookInput
  - typings.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends StObject
object HookInput {
  
  @scala.inline
  def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): typings.ionic.definitionsMod.BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.BuildHookInput]
  }
  
  @scala.inline
  def ServeAfterHookInput(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): typings.ionic.definitionsMod.ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.ServeAfterHookInput]
  }
  
  @scala.inline
  def ServeBeforeHookInput(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): typings.ionic.definitionsMod.ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.ServeBeforeHookInput]
  }
}
