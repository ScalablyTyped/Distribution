package typings.itConcat

import typings.itConcat.itConcatStrings.buffer
import typings.itConcat.itConcatStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: buffer
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("buffer")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setType(value: buffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: string
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
