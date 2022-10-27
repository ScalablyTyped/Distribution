package typings.guardianProsemirrorInvisibles

import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGetInsertedRangesMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/utils/get-inserted-ranges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Transaction): js.Array[Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Range]]
  
  type Range = js.Tuple2[/* from */ Double, /* to */ Double]
}
