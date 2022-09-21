package typings.inversify

import typings.inversify.decoratorUtilsMod.DecoratorTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetNameMod {
  
  @JSImport("inversify/lib/annotation/target_name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def targetName(name: String): js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("targetName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ DecoratorTarget[Any], /* targetKey */ String, /* index */ Double, Unit]]
}
