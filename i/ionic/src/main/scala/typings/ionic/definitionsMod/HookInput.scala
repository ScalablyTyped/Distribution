package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.BuildHookInput
  - typings.ionic.definitionsMod.ServeBeforeHookInput
  - typings.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends StObject
object HookInput {
  
  inline def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): typings.ionic.definitionsMod.BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.BuildHookInput]
  }
  
  inline def ServeAfterHookInput(serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) & ServeDetails): typings.ionic.definitionsMod.ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:after", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.ServeAfterHookInput]
  }
  
  inline def ServeBeforeHookInput(serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): typings.ionic.definitionsMod.ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = "serve:before", serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ionic.definitionsMod.ServeBeforeHookInput]
  }
}
