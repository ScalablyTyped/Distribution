package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir extends StObject {
  
  var dir: String
  
  var srcDir: String
  
  var `type`: ProjectType
}
object Dir {
  
  inline def apply(dir: String, srcDir: String, `type`: ProjectType): Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
  
  extension [Self <: Dir](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setSrcDir(value: String): Self = StObject.set(x, "srcDir", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
