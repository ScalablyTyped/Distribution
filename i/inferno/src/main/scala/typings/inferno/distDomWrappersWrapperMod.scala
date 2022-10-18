package typings.inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomWrappersWrapperMod {
  
  @JSImport("inferno/dist/DOM/wrappers/wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWrappedFunction(methodName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrappedFunction")(methodName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def createWrappedFunction(methodName: String, applyValue: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrappedFunction")(methodName.asInstanceOf[js.Any], applyValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def createWrappedFunction(methodName: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrappedFunction")(methodName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def createWrappedFunction(methodName: js.Array[String], applyValue: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrappedFunction")(methodName.asInstanceOf[js.Any], applyValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
