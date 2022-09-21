package typings.ignoreWalk

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dir extends StObject {
    
    var dir: Boolean
    
    var entry: String
    
    var file: Boolean
    
    var isSymbolicLink: Boolean
    
    var st: Stats
  }
  object Dir {
    
    inline def apply(dir: Boolean, entry: String, file: Boolean, isSymbolicLink: Boolean, st: Stats): Dir = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dir]
    }
    
    extension [Self <: Dir](x: Self) {
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setIsSymbolicLink(value: Boolean): Self = StObject.set(x, "isSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setSt(value: Stats): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entry extends StObject {
    
    var dir: Boolean
    
    var entry: String
    
    var file: Boolean
  }
  object Entry {
    
    inline def apply(dir: Boolean, entry: String, file: Boolean): Entry = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
