package typings.ipfsUnixfsImporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOptionsMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ImporterOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ImporterOptions]
  inline def default(options: UserImporterOptions): ImporterOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ImporterOptions]
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type UserImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.UserImporterOptions
}
