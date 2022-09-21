package typings.groupArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(arr: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def apply(
    arr: js.Array[js.Object],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param props because its type Array<string> | Array<Array<string>> is not an array type */ props: js.Array[js.Array[String] | String]
  ): js.Object = (^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("group-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
