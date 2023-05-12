package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcLayoutBalancedMod.BalancedOptions
import typings.ipfsUnixfsImporter.distSrcLayoutTrickleMod.TrickleOptions
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLayoutMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def balanced(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")().asInstanceOf[FileLayout]
  inline def balanced(options: BalancedOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
  
  inline def flat(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[FileLayout]
  
  inline def trickle(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")().asInstanceOf[FileLayout]
  inline def trickle(options: TrickleOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
  
  type FileLayout = js.Function2[
    /* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], 
    /* reducer */ Reducer, 
    js.Promise[InProgressImportResult]
  ]
  
  type Reducer = js.Function1[/* leaves */ js.Array[InProgressImportResult], js.Promise[InProgressImportResult]]
}
