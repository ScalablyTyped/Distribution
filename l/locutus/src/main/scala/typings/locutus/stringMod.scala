package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("locutus/python/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capwords(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("capwords")().asInstanceOf[js.Any]
  inline def capwords(str: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("capwords")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
