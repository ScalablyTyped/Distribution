package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typings.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typings.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetManagerMod {
  
  trait AssetManager extends StObject {
    
    def writeAllLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation): Unit
    
    def writeChunkBanners(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit
    
    def writeChunkLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit
  }
  object AssetManager {
    
    inline def apply(
      writeAllLicenses: (js.Array[LicenseIdentifiedModule], WebpackCompilation) => Unit,
      writeChunkBanners: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Unit,
      writeChunkLicenses: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Unit
    ): AssetManager = {
      val __obj = js.Dynamic.literal(writeAllLicenses = js.Any.fromFunction2(writeAllLicenses), writeChunkBanners = js.Any.fromFunction3(writeChunkBanners), writeChunkLicenses = js.Any.fromFunction3(writeChunkLicenses))
      __obj.asInstanceOf[AssetManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssetManager] (val x: Self) extends AnyVal {
      
      inline def setWriteAllLicenses(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation) => Unit): Self = StObject.set(x, "writeAllLicenses", js.Any.fromFunction2(value))
      
      inline def setWriteChunkBanners(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Unit): Self = StObject.set(x, "writeChunkBanners", js.Any.fromFunction3(value))
      
      inline def setWriteChunkLicenses(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Unit): Self = StObject.set(x, "writeChunkLicenses", js.Any.fromFunction3(value))
    }
  }
}
