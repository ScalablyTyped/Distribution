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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__type(value: jsonb): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__typeUndefined: Self = StObject.set(x, "__type", js.undefined)
    }
  }
  
  trait Aggregate extends StObject {
    
    var __aggregate: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Type extends StObject {
    
    var __type: js.UndefOr[json] = js.undefined
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__type(value: json): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__typeUndefined: Self = StObject.set(x, "__type", js.undefined)
    }
  }
}
