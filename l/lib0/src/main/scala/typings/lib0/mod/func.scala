package typings.lib0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object func {
  
  @JSImport("lib0", "func")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply[T](f: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(f.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def callAll(fs: js.Array[js.Function], args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callAll")(fs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def callAll(fs: js.Array[js.Function], args: js.Array[Any], i: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callAll")(fs.asInstanceOf[js.Any], args.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equalityDeep(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityDeep")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equalityFlat[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalityFlat[T](a: js.Array[T], b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalityFlat[T](a: js.Object, b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalityFlat[T](a: js.Object, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equalityStrict[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalityStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def id[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(a.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def nop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nop")().asInstanceOf[Unit]
}
