package typings.lightship

import typings.lightship.typesMod.ConfigurationInput
import typings.lightship.typesMod.Lightship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lightship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLightship(): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightship")().asInstanceOf[js.Promise[Lightship]]
  inline def createLightship(userConfiguration: ConfigurationInput): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightship")(userConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Lightship]]
}
