package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsUseResetAtomMod {
  
  @JSImport("jotai/react/utils/useResetAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResetAtom(anAtom: WritableAtom[Any, js.Array[js.Symbol], Any]): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetAtom")(anAtom.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
  inline def useResetAtom(anAtom: WritableAtom[Any, js.Array[js.Symbol], Any], options: Options): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResetAtom")(anAtom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.anon.FnCallAtomOptions>[1] */ js.Any
}
