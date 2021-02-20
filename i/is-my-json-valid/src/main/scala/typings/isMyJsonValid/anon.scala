package typings.isMyJsonValid

import typings.isMyJsonValid.mod.AnySchema
import typings.isMyJsonValid.mod.ObjectSchema
import typings.isMyJsonValid.mod.StringKeys
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */] extends StObject {
    
    var oneOf: js.Tuple3[
        ObjectSchema[Properties1, Required1], 
        ObjectSchema[Properties2, Required2], 
        ObjectSchema[Properties3, Required3]
      ] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](
      oneOf: js.Tuple3[
          ObjectSchema[Properties1, Required1], 
          ObjectSchema[Properties2, Required2], 
          ObjectSchema[Properties3, Required3]
        ]
    ): `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_, _, _, _, _, _], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */] (val x: Self with (`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3])) extends AnyVal {
      
      @scala.inline
      def setOneOf(
        value: js.Tuple3[
              ObjectSchema[Properties1, Required1], 
              ObjectSchema[Properties2, Required2], 
              ObjectSchema[Properties3, Required3]
            ]
      ): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1`[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */] extends StObject {
    
    var oneOf: js.Tuple4[
        ObjectSchema[Properties1, Required1], 
        ObjectSchema[Properties2, Required2], 
        ObjectSchema[Properties3, Required3], 
        ObjectSchema[Properties4, Required4]
      ] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
      oneOf: js.Tuple4[
          ObjectSchema[Properties1, Required1], 
          ObjectSchema[Properties2, Required2], 
          ObjectSchema[Properties3, Required3], 
          ObjectSchema[Properties4, Required4]
        ]
    ): `1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[_, _, _, _, _, _, _, _], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */] (val x: Self with (`1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4])) extends AnyVal {
      
      @scala.inline
      def setOneOf(
        value: js.Tuple4[
              ObjectSchema[Properties1, Required1], 
              ObjectSchema[Properties2, Required2], 
              ObjectSchema[Properties3, Required3], 
              ObjectSchema[Properties4, Required4]
            ]
      ): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple2[Schema1, Schema2] = js.native
  }
  object `2` {
    
    @scala.inline
    def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](oneOf: js.Tuple2[Schema1, Schema2]): `2`[Schema1, Schema2] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`[Schema1, Schema2]]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`[_, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */] (val x: Self with (`2`[Schema1, Schema2])) extends AnyVal {
      
      @scala.inline
      def setOneOf(value: js.Tuple2[Schema1, Schema2]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `3`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple3[Schema1, Schema2, Schema3] = js.native
  }
  object `3` {
    
    @scala.inline
    def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](oneOf: js.Tuple3[Schema1, Schema2, Schema3]): `3`[Schema1, Schema2, Schema3] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`[Schema1, Schema2, Schema3]]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`[_, _, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */] (val x: Self with (`3`[Schema1, Schema2, Schema3])) extends AnyVal {
      
      @scala.inline
      def setOneOf(value: js.Tuple3[Schema1, Schema2, Schema3]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `4`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4] = js.native
  }
  object `4` {
    
    @scala.inline
    def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): `4`[Schema1, Schema2, Schema3, Schema4] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`4`[Schema1, Schema2, Schema3, Schema4]]
    }
    
    @scala.inline
    implicit class `4MutableBuilder`[Self <: `4`[_, _, _, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */] (val x: Self with (`4`[Schema1, Schema2, Schema3, Schema4])) extends AnyVal {
      
      @scala.inline
      def setOneOf(value: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OneOf[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */] extends StObject {
    
    var oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]] = js.native
  }
  object OneOf {
    
    @scala.inline
    def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): OneOf[Properties1, Required1, Properties2, Required2] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[OneOf[Properties1, Required1, Properties2, Required2]]
    }
    
    @scala.inline
    implicit class OneOfMutableBuilder[Self <: OneOf[_, _, _, _], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */] (val x: Self with (OneOf[Properties1, Required1, Properties2, Required2])) extends AnyVal {
      
      @scala.inline
      def setOneOf(value: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
}
