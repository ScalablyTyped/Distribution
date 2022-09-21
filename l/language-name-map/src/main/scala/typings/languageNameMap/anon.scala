package typings.languageNameMap

import typings.languageNameMap.languageNameMapNumbers.`0`
import typings.languageNameMap.languageNameMapNumbers.`1`
import typings.languageNameMap.languageNameMapStrings.ltr
import typings.languageNameMap.languageNameMapStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dir extends StObject {
    
    var dir: ltr | rtl
    
    var name: String
    
    var native: String
  }
  object Dir {
    
    inline def apply(dir: ltr | rtl, name: String, native: String): Dir = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dir]
    }
    
    extension [Self <: Dir](x: Self) {
      
      inline def setDir(value: ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var dir: `0` | `1`
    
    var name: String
    
    var native: String
  }
  object Name {
    
    inline def apply(dir: `0` | `1`, name: String, native: String): Name = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setDir(value: `0` | `1`): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    }
  }
}
