package typings.justExtend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(deep: Boolean, obj1: js.Object, objn: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(deep.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any])).`++`(objn.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  inline def default(obj1: js.Object, objn: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(obj1.asInstanceOf[js.Any]).`++`(objn.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
}
