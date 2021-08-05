package typings.istanbulLibSourceMaps

import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: js.Any, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-source-maps.istanbul-lib-source-maps.MapStoreOptions> */
  trait PartialMapStoreOptions extends StObject {
    
    var baseDir: js.UndefOr[String] = js.undefined
    
    var sourceStore: js.UndefOr[memory | file] = js.undefined
    
    var tmpdir: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PartialMapStoreOptions {
    
    inline def apply(): PartialMapStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapStoreOptions]
    }
    
    extension [Self <: PartialMapStoreOptions](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setSourceStore(value: memory | file): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      inline def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
      
      inline def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
