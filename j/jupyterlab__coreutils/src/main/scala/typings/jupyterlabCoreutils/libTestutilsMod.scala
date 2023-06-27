package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestutilsMod {
  
  @JSImport("@jupyterlab/coreutils/lib/testutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sleep(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[Unit]]
  inline def sleep(milliseconds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sleep[T](milliseconds: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(milliseconds.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
