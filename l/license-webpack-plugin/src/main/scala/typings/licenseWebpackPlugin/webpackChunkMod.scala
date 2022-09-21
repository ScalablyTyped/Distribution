package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.webpackChunkModuleMod.WebpackChunkModule
import typings.std.IterableIterator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackChunkMod {
  
  trait WebpackChunk extends StObject {
    
    var entryModule: js.UndefOr[WebpackChunkModule] = js.undefined
    
    var files: js.Array[String] | Set[String]
    
    var forEachModule: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* module */ WebpackChunkModule, Unit], Unit]
      ] = js.undefined
    
    var modules: js.UndefOr[js.Array[WebpackChunkModule]] = js.undefined
    
    var modulesIterable: js.UndefOr[IterableIterator[WebpackChunkModule]] = js.undefined
    
    var name: String
  }
  object WebpackChunk {
    
    inline def apply(files: js.Array[String] | Set[String], name: String): WebpackChunk = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackChunk]
    }
    
    extension [Self <: WebpackChunk](x: Self) {
      
      inline def setEntryModule(value: WebpackChunkModule): Self = StObject.set(x, "entryModule", value.asInstanceOf[js.Any])
      
      inline def setEntryModuleUndefined: Self = StObject.set(x, "entryModule", js.undefined)
      
      inline def setFiles(value: js.Array[String] | Set[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setForEachModule(value: /* callback */ js.Function1[/* module */ WebpackChunkModule, Unit] => Unit): Self = StObject.set(x, "forEachModule", js.Any.fromFunction1(value))
      
      inline def setForEachModuleUndefined: Self = StObject.set(x, "forEachModule", js.undefined)
      
      inline def setModules(value: js.Array[WebpackChunkModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesIterable(value: IterableIterator[WebpackChunkModule]): Self = StObject.set(x, "modulesIterable", value.asInstanceOf[js.Any])
      
      inline def setModulesIterableUndefined: Self = StObject.set(x, "modulesIterable", js.undefined)
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: WebpackChunkModule*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
