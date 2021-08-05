package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Base
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-core-utils/dist/src/cid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cidToString(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cidToString(input: String, options: Base): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cidToString(input: typings.cids.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cidToString(input: typings.cids.mod.^, options: Base): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cidToString(input: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cidToString(input: Uint8Array, options: Base): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cidToString")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
