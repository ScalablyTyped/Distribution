package typings.maliOnerror

import typings.mali.mod.Context
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function2[/* err */ Error, /* ctx */ Context, js.Any]): js.Function2[
    /* ctx */ Context, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* ctx */ Context, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[Unit]
  ]]
  
  @JSImport("mali-onerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
