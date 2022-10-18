package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpMiscMod {
  
  @JSImport("locutus/php/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def uniqid(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")().asInstanceOf[Any]
  inline def uniqid(prefix: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def uniqid(prefix: Any, moreEntropy: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any], moreEntropy.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def uniqid(prefix: Unit, moreEntropy: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqid")(prefix.asInstanceOf[js.Any], moreEntropy.asInstanceOf[js.Any])).asInstanceOf[Any]
}
