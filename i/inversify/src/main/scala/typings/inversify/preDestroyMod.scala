package typings.inversify

import typings.inversify.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preDestroyMod {
  
  @JSImport("inversify/lib/annotation/pre_destroy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def preDestroy(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preDestroy")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
}
