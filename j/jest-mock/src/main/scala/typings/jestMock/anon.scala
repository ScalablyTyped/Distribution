package typings.jestMock

import typings.jestMock.jestMockBooleans.`false`
import typings.jestMock.jestMockBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var shallow: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(shallow = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setShallow(value: `true`): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shallow extends StObject {
    
    var shallow: `false`
  }
  object Shallow {
    
    inline def apply(): Shallow = {
      val __obj = js.Dynamic.literal(shallow = false)
      __obj.asInstanceOf[Shallow]
    }
    
    extension [Self <: Shallow](x: Self) {
      
      inline def setShallow(value: `false`): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
}
