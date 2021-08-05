package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setcookieMod {
  
  inline def apply(
    name: js.UndefOr[js.Any],
    value: js.UndefOr[js.Any],
    expires: js.UndefOr[js.Any],
    path: js.UndefOr[js.Any],
    domain: js.UndefOr[js.Any],
    secure: js.UndefOr[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any], path.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], secure.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("locutus/php/network/setcookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
