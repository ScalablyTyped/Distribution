package typings.justMerge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TObj1 /* <: js.Object */, TObjs /* <: js.Object */](obj1: TObj1, objs: TObjs*): TObj1 & TObjs = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(obj1.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TObj1 & TObjs]
}
