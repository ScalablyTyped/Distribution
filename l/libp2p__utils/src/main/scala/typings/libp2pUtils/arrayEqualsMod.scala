package typings.libp2pUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object arrayEqualsMod {
  
  @JSImport("@libp2p/utils/array-equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayEquals(a: js.Array[Any], b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
