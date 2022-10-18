package typings.manaSyringe

import typings.manaSyringe.libCoreMod.Syringe.Named
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContributionDecoratorMod {
  
  @JSImport("mana-syringe/lib/contribution/decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contrib(token: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrib")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
}
