package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uuidMod {
  
  @JSImport("@lumino/coreutils/types/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uuid4Factory(getRandomValues: js.Function1[/* bytes */ js.typedarray.Uint8Array, Unit]): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4Factory")(getRandomValues.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
}
