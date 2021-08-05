package typings.karmaSnapshot

import typings.karmaSnapshot.mod.SnapshotSuite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var suite: SnapshotSuite
  }
  object Name {
    
    inline def apply(name: String, suite: SnapshotSuite): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SnapshotSuite): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    }
  }
}
