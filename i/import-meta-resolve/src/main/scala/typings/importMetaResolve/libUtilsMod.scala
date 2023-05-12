package typings.importMetaResolve

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("import-meta-resolve/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConditionsSet(): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConditionsSet")().asInstanceOf[Set[String]]
  inline def getConditionsSet(conditions: js.Array[String]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConditionsSet")(conditions.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
}
