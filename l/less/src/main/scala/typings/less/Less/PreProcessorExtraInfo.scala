package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreProcessorExtraInfo extends StObject {
  
  var context: typings.less.anon.PluginManager
  
  var fileInfo: RootFileInfo
  
  var imports: StringDictionary[Any]
}
object PreProcessorExtraInfo {
  
  inline def apply(context: typings.less.anon.PluginManager, fileInfo: RootFileInfo, imports: StringDictionary[Any]): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
  
  extension [Self <: PreProcessorExtraInfo](x: Self) {
    
    inline def setContext(value: typings.less.anon.PluginManager): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFileInfo(value: RootFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    inline def setImports(value: StringDictionary[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
  }
}
