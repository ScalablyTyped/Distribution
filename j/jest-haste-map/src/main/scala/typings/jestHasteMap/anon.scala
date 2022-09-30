package typings.jestHasteMap

import typings.gracefulFs.mod.Stats
import typings.jestHasteMap.mod.IHasteFS
import typings.jestHasteMap.mod.IModuleMap
import typings.jestHasteMap.mod.SerializableModuleMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilePath extends StObject {
    
    var filePath: String
    
    var stat: js.UndefOr[Stats] = js.undefined
    
    var `type`: String
  }
  object FilePath {
    
    inline def apply(filePath: String, `type`: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    extension [Self <: FilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasteFS extends StObject {
    
    var hasteFS: IHasteFS
    
    var moduleMap: IModuleMap[SerializableModuleMap]
  }
  object HasteFS {
    
    inline def apply(hasteFS: IHasteFS, moduleMap: IModuleMap[SerializableModuleMap]): HasteFS = {
      val __obj = js.Dynamic.literal(hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasteFS]
    }
    
    extension [Self <: HasteFS](x: Self) {
      
      inline def setHasteFS(value: IHasteFS): Self = StObject.set(x, "hasteFS", value.asInstanceOf[js.Any])
      
      inline def setModuleMap(value: IModuleMap[SerializableModuleMap]): Self = StObject.set(x, "moduleMap", value.asInstanceOf[js.Any])
    }
  }
}
