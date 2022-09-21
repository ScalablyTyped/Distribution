package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod {
  
  @JSImport("locutus/php/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def i18nLocGetDefault(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("i18n_loc_get_default")().asInstanceOf[Any]
  
  inline def i18nLocSetDefault(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("i18n_loc_set_default")().asInstanceOf[Any]
  inline def i18nLocSetDefault(name: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("i18n_loc_set_default")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
}
