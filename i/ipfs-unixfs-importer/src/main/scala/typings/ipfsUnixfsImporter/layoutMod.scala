package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcLayoutBalancedMod.BalancedOptions
import typings.ipfsUnixfsImporter.distSrcLayoutMod.FileLayout
import typings.ipfsUnixfsImporter.distSrcLayoutTrickleMod.TrickleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object layoutMod {
  
  @JSImport("ipfs-unixfs-importer/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def balanced(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")().asInstanceOf[FileLayout]
  inline def balanced(options: BalancedOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("balanced")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
  
  inline def flat(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[FileLayout]
  
  inline def trickle(): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")().asInstanceOf[FileLayout]
  inline def trickle(options: TrickleOptions): FileLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("trickle")(options.asInstanceOf[js.Any]).asInstanceOf[FileLayout]
}
