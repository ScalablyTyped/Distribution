package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscMod {
  
  @JSImport("locutus/php/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def uniqid(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")().asInstanceOf[js.Any]
  inline def uniqid(prefix: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def uniqid(prefix: js.Any, moreEntropy: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any], moreEntropy.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def uniqid(prefix: Unit, moreEntropy: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any], moreEntropy.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
