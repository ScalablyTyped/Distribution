package typings.guid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(guid: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].apply(guid.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("guid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("guid", "EMPTY")
  @js.native
  val EMPTY: String = js.native
  
  inline def create(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Object]
  
  inline def isGuid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def raw(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[String]
}
