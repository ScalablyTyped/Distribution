package typings.jimpUtils

import typings.jimpUtils.jimpUtilsBooleans.`false`
import typings.jimpUtils.jimpUtilsBooleans.`true`
import typings.std.Omit
import typings.typescript.mod.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNodePattern(cb: js.Function): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePattern")(cb.asInstanceOf[js.Any]).asInstanceOf[`true`]
  inline def isNodePattern(cb: Omit[Any, js.Function]): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePattern")(cb.asInstanceOf[js.Any]).asInstanceOf[`false`]
  
  inline def scan(
    image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ Any,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function4[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ /* image */ Any, 
      /* _x */ Double, 
      /* _y */ Double, 
      /* idx */ Double, 
      Unit
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def throwError(error: String): ThrowStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[ThrowStatement]
  inline def throwError(error: String, cb: js.Function1[/* err */ js.Error, Unit]): ThrowStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ThrowStatement]
  inline def throwError(error: js.Error): ThrowStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[ThrowStatement]
  inline def throwError(error: js.Error, cb: js.Function1[/* err */ js.Error, Unit]): ThrowStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ThrowStatement]
}
