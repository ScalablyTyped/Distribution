package typings.hasura

import typings.hasura.hasuraStrings.json
import typings.hasura.hasuraStrings.jsonb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var __type: js.UndefOr[jsonb] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set__type(value: jsonb): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
      
      inline def set__typeUndefined: Self = StObject.set(x, "__type", js.undefined)
    }
  }
  
  trait Aggregate extends StObject {
    
    var __aggregate: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Type extends StObject {
    
    var __type: js.UndefOr[json] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def set__type(value: json): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
      
      inline def set__typeUndefined: Self = StObject.set(x, "__type", js.undefined)
    }
  }
}
