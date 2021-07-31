package typings.inversify

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiInjectMod {
  
  @JSImport("inversify/dts/annotation/multi_inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def multiInject(serviceIdentifier: ServiceIdentifier[js.Any]): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiInject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
}
