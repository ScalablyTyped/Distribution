package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildHookInput
  extends StObject
     with HookInput {
  
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions
  
  val name: buildColonbefore | buildColonafter
}
object BuildHookInput {
  
  inline def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHookInput]
  }
  
  extension [Self <: BuildHookInput](x: Self) {
    
    inline def setBuild(value: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setName(value: buildColonbefore | buildColonafter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
