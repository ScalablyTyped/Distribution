package typings.maliOnerror

import typings.mali.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    fn: js.Function2[
      /* err */ js.Error, 
      /* ctx */ Context[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for R */ Any
      ], 
      Any
    ]
  ): js.Function2[
    /* ctx */ Context[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for R */ Any
    ], 
    /* next */ js.UndefOr[js.Function0[js.Promise[Any]]], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* ctx */ Context[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for R */ Any
    ], 
    /* next */ js.UndefOr[js.Function0[js.Promise[Any]]], 
    js.Promise[Unit]
  ]]
  
  @JSImport("mali-onerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
