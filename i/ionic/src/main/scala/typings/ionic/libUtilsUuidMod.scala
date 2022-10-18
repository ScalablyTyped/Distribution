package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUuidMod {
  
  @JSImport("ionic/lib/utils/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[String]
  
  inline def shortid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shortid")().asInstanceOf[String]
}
