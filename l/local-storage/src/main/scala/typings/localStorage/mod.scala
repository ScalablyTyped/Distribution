package typings.localStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("local-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](key: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def get[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def off[T](key: String, cb: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off[T](key: String, cb: js.Function2[/* value */ T, /* old */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off[T](key: String, cb: js.Function3[/* value */ T, /* old */ T, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on[T](key: String, cb: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on[T](key: String, cb: js.Function2[/* value */ T, /* old */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on[T](key: String, cb: js.Function3[/* value */ T, /* old */ T, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def set[T](key: String, value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
