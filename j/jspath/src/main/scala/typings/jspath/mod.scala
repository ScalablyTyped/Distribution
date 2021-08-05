package typings.jspath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jspath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(path: String, data: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  inline def apply(path: String, data: js.Any, replacement: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
