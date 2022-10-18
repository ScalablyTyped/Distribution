package typings.libp2pRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@libp2p/record/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseRFC3339(time: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRFC3339")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def toRFC3339(time: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRFC3339")(time.asInstanceOf[js.Any]).asInstanceOf[String]
}
