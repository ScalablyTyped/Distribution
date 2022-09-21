package typings.jsonMergePatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-merge-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(target: Any, patch: Null): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def apply[U](target: Any, patch: U): U = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def apply_T_T[T](target: T, patch: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def generate(before: Any, after: Null): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def generate[T](before: T, after: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def generate_U[U](before: Any, after: U): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  inline def merge(patch1: Any, patch2: Null): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(patch1.asInstanceOf[js.Any], patch2.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def merge[T](patch1: T, patch2: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(patch1.asInstanceOf[js.Any], patch2.asInstanceOf[js.Any])).asInstanceOf[T]
}
