package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMod {
  
  @JSImport("inversify/lib/utils/js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFirstArrayDuplicate[T](array: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstArrayDuplicate")(array.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
