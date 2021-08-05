package typings.isMyJsonValid

import typings.isMyJsonValid.mod.AnySchema
import typings.isMyJsonValid.mod.ObjectSchema
import typings.isMyJsonValid.mod.StringKeys
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */] extends StObject {
    
    var oneOf: js.Tuple3[
        ObjectSchema[Properties1, Required1], 
        ObjectSchema[Properties2, Required2], 
        ObjectSchema[Properties3, Required3]
      ]
  }
  object `0` {
    
    inline def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](
      oneOf: js.Tuple3[
          ObjectSchema[Properties1, Required1], 
          ObjectSchema[Properties2, Required2], 
          ObjectSchema[Properties3, Required3]
        ]
    ): `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3]]
    }
    
    extension [Self <: `0`[?, ?, ?, ?, ?, ?], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](x: Self & (`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3])) {
      
      inline def setOneOf(
        value: js.Tuple3[
              ObjectSchema[Properties1, Required1], 
              ObjectSchema[Properties2, Required2], 
              ObjectSchema[Properties3, Required3]
            ]
      ): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */] extends StObject {
    
    var oneOf: js.Tuple4[
        ObjectSchema[Properties1, Required1], 
        ObjectSchema[Properties2, Required2], 
        ObjectSchema[Properties3, Required3], 
        ObjectSchema[Properties4, Required4]
      ]
  }
  object `1` {
    
    inline def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](
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
    
    extension [Self <: `1`[?, ?, ?, ?, ?, ?, ?, ?], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */, Properties4 /* <: Record[String, AnySchema] */, Required4 /* <: StringKeys[Properties4] */](x: Self & (`1`[Properties1, Required1, Properties2, Required2, Properties3, Required3, Properties4, Required4])) {
      
      inline def setOneOf(
        value: js.Tuple4[
              ObjectSchema[Properties1, Required1], 
              ObjectSchema[Properties2, Required2], 
              ObjectSchema[Properties3, Required3], 
              ObjectSchema[Properties4, Required4]
            ]
      ): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple2[Schema1, Schema2]
  }
  object `2` {
    
    inline def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](oneOf: js.Tuple2[Schema1, Schema2]): `2`[Schema1, Schema2] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`[Schema1, Schema2]]
    }
    
    extension [Self <: `2`[?, ?], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](x: Self & (`2`[Schema1, Schema2])) {
      
      inline def setOneOf(value: js.Tuple2[Schema1, Schema2]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple3[Schema1, Schema2, Schema3]
  }
  object `3` {
    
    inline def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](oneOf: js.Tuple3[Schema1, Schema2, Schema3]): `3`[Schema1, Schema2, Schema3] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`[Schema1, Schema2, Schema3]]
    }
    
    extension [Self <: `3`[?, ?, ?], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](x: Self & (`3`[Schema1, Schema2, Schema3])) {
      
      inline def setOneOf(value: js.Tuple3[Schema1, Schema2, Schema3]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  trait `4`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */] extends StObject {
    
    var oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4]
  }
  object `4` {
    
    inline def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): `4`[Schema1, Schema2, Schema3, Schema4] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[`4`[Schema1, Schema2, Schema3, Schema4]]
    }
    
    extension [Self <: `4`[?, ?, ?, ?], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](x: Self & (`4`[Schema1, Schema2, Schema3, Schema4])) {
      
      inline def setOneOf(value: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
  
  trait OneOf[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */] extends StObject {
    
    var oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]
  }
  object OneOf {
    
    inline def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): OneOf[Properties1, Required1, Properties2, Required2] = {
      val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[OneOf[Properties1, Required1, Properties2, Required2]]
    }
    
    extension [Self <: OneOf[?, ?, ?, ?], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](x: Self & (OneOf[Properties1, Required1, Properties2, Required2])) {
      
      inline def setOneOf(value: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    }
  }
}
