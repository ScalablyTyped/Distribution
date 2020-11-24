package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hostMod {
  
  type LegacyReadFileCallback = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    js.Thenable[java.lang.String] | java.lang.String
  ]
  
  type LegacyReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    js.UndefOr[java.lang.String]
  ]
  
  type LegacyWriteFileCallback = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type LegacyWriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    scala.Unit
  ]
  
  type ReadFileCallback = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    js.UndefOr[js.Thenable[js.UndefOr[java.lang.String]] | java.lang.String]
  ]
  
  type ReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    js.UndefOr[java.lang.String]
  ]
  
  type WriteFileCallback = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type WriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    scala.Unit
  ]
}
