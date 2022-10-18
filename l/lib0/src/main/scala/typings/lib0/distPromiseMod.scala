package typings.lib0

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPromiseMod {
  
  @JSImport("lib0/dist/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all[T](arrp: js.Array[js.Promise[T]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(arrp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def create[T](
    f: js.Function2[
      /* arg0 */ PromiseResolve[T], 
      /* arg1 */ js.Function1[/* arg0 */ js.Error, Unit], 
      Any
    ]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def createEmpty(
    f: js.Function2[
      /* arg0 */ js.Function0[Unit], 
      /* arg1 */ js.Function1[/* arg0 */ js.Error, Unit], 
      Unit
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def isPromise(p: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def reject(): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")().asInstanceOf[js.Promise[scala.Nothing]]
  inline def reject(reason: js.Error): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def resolve[T](res: T): js.Promise[Unit | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | T]]
  inline def resolve[T](res: Unit): js.Promise[Unit | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | T]]
  
  inline def resolveWith[T](res: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveWith")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def until(timeout: Double, check: js.Function0[Boolean]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(timeout.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def until(timeout: Double, check: js.Function0[Boolean], intervalResolution: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(timeout.asInstanceOf[js.Any], check.asInstanceOf[js.Any], intervalResolution.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def wait_(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type PromiseResolve[T] = js.Function1[/* result */ js.UndefOr[T | PromiseLike[T]], Any]
}
