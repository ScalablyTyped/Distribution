package typings.lightship

import typings.lightship.typesMod.ConfigurationInput
import typings.lightship.typesMod.Lightship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createLightshipMod {
  
  @JSImport("lightship/dist/src/factories/createLightship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Lightship]]
  inline def default(userConfiguration: ConfigurationInput): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Lightship]]
}
