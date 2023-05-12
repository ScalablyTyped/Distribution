package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcDirMod.Dir
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Child extends StObject {
    
    var child: InProgressImportResult | Dir
    
    var key: String
  }
  object Child {
    
    inline def apply(child: InProgressImportResult | Dir, key: String): Child = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Child]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Child] (val x: Self) extends AnyVal {
      
      inline def setChild(value: InProgressImportResult | Dir): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
