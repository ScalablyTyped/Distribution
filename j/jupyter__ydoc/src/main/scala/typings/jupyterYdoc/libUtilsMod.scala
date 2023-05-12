package typings.jupyterYdoc

import typings.jupyterYdoc.libApiMod.MapChange
import typings.yjs.mod.YMapEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@jupyter/ydoc/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertYMapEventToMapChange(event: YMapEvent[Any]): MapChange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertYMapEventToMapChange")(event.asInstanceOf[js.Any]).asInstanceOf[MapChange]
  
  inline def createMutex(): js.Function1[/* f */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMutex")().asInstanceOf[js.Function1[/* f */ js.Function0[Unit], Unit]]
}
