package typings.ktxParse

import typings.ktxParse.containerMod.KTX2Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readMod {
  
  @JSImport("ktx-parse/dist/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(data: js.typedarray.Uint8Array): KTX2Container = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[KTX2Container]
}
