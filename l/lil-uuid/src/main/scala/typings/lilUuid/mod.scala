package typings.lilUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lil-uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isUUID(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
}
