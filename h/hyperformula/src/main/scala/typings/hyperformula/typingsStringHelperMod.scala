package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.std.Intl.Collator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsStringHelperMod {
  
  @JSImport("hyperformula/typings/StringHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collatorFromConfig(config: Config): Collator = ^.asInstanceOf[js.Dynamic].applyDynamic("collatorFromConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Collator]
}
