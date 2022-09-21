package typings.iferr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  inline def apply[T](fail: js.Function1[/* err */ js.Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = (^.asInstanceOf[js.Dynamic].apply(fail.asInstanceOf[js.Any], succ.asInstanceOf[js.Any])).asInstanceOf[nodeCallback[T]]
  
  @JSImport("iferr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Delegates to `succ` on sucecss or to `fail` on error
  // ex: Thing.load(123, iferr(cb, thing => ...))
  inline def iferr[T](fail: js.Function1[/* err */ js.Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iferr")(fail.asInstanceOf[js.Any], succ.asInstanceOf[js.Any])).asInstanceOf[nodeCallback[T]]
  
  // Prints errors when one is passed, or does nothing otherwise
  // ex: Thing.load(123, printerr)
  inline def printerr(): nodeCallback[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("printerr")().asInstanceOf[nodeCallback[Any]]
  
  // Delegate to the success function on success, throws the error otherwise
  // ex: Thing.load(123, throwerr(thing => ...))
  inline def throwerr[T](succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwerr")(succ.asInstanceOf[js.Any]).asInstanceOf[nodeCallback[T]]
  
  // Like iferr, but also catches errors thrown from `succ` and passes to `fail`
  inline def tiferr[T](fail: js.Function1[/* err */ js.Error, Unit], succ: js.Function1[/* repeated */ T, Unit]): nodeCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tiferr")(fail.asInstanceOf[js.Any], succ.asInstanceOf[js.Any])).asInstanceOf[nodeCallback[T]]
  
  @js.native
  trait nodeCallback[T] extends StObject {
    
    def apply(err: js.Error, a: T*): Any = js.native
    def apply(err: Null, a: T*): Any = js.native
  }
}
