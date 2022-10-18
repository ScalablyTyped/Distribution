package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcDirMod.Dir
import typings.ipfsUnixfsImporter.distSrcDirMod.default
import typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Child extends StObject {
    
    var child: InProgressImportResult | default
    
    var key: String
  }
  object Child {
    
    inline def apply(child: InProgressImportResult | default, key: String): Child = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Child]
    }
    
    extension [Self <: Child](x: Self) {
      
      inline def setChild(value: InProgressImportResult | default): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var child: typings.ipfsUnixfsImporter.distSrcDirMod.InProgressImportResult | Dir
    
    var key: String
  }
  object Key {
    
    inline def apply(child: typings.ipfsUnixfsImporter.distSrcDirMod.InProgressImportResult | Dir, key: String): Key = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setChild(value: typings.ipfsUnixfsImporter.distSrcDirMod.InProgressImportResult | Dir): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
