package typings.maliOnerror

import typings.mali.mod.Context
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mali-onerror", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function2[/* err */ Error, /* ctx */ Context, _]): js.Function2[
    /* ctx */ Context, 
    /* next */ js.UndefOr[js.Function0[js.Promise[_]]], 
    js.Promise[Unit]
  ] = js.native
}
