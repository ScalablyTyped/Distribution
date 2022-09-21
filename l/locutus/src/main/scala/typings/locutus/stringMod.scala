package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("locutus/python/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capwords(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("capwords")().asInstanceOf[Any]
  inline def capwords(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("capwords")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
}
