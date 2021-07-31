package typings.jimpUtils

import typings.jimpUtils.jimpUtilsBooleans.`false`
import typings.jimpUtils.jimpUtilsBooleans.`true`
import typings.std.Error
import typings.std.Omit
import typings.typescript.mod.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isNodePattern(cb: js.Function): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePattern")(cb.asInstanceOf[js.Any]).asInstanceOf[`true`]
  @scala.inline
  def isNodePattern(cb: Omit[js.Any, js.Function]): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePattern")(cb.asInstanceOf[js.Any]).asInstanceOf[`false`]
  
  @scala.inline
  def scan(
    image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function4[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ /* image */ js.Any, 
      /* _x */ Double, 
      /* _y */ Double, 
      /* idx */ Double, 
      Unit
    ]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def throwError(error: String): ThrowStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[ThrowStatement]
  @scala.inline
  def throwError(error: String, cb: js.Function1[/* err */ Error, Unit]): ThrowStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ThrowStatement]
  @scala.inline
  def throwError(error: Error): ThrowStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[ThrowStatement]
  @scala.inline
  def throwError(error: Error, cb: js.Function1[/* err */ Error, Unit]): ThrowStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ThrowStatement]
}
