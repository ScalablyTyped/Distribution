package typings.jsData

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsData.mod.Mapper
import typings.jsData.mod.Record
import typings.jsData.mod.SchemaValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllOf extends StObject {
    
    def allOf(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def anyOf(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def dependencies(value: Any, schema: Any, opts: Any): Unit
    
    def `enum`(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def items(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def maxItems(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def maxLength(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def maxProperties(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def maximum(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def minItems(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def minLength(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def minProperties(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def minimum(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def multipleOf(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def not(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def oneOf(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def pattern(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def properties(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def required(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def `type`(value: Any, schema: Any, opts: Any): SchemaValidationError
    
    def uniqueItems(value: Any, schema: Any, opts: Any): SchemaValidationError
  }
  object AllOf {
    
    inline def apply(
      allOf: (Any, Any, Any) => js.Array[SchemaValidationError],
      anyOf: (Any, Any, Any) => js.Array[SchemaValidationError],
      dependencies: (Any, Any, Any) => Unit,
      `enum`: (Any, Any, Any) => SchemaValidationError,
      items: (Any, Any, Any) => js.Array[SchemaValidationError],
      maxItems: (Any, Any, Any) => SchemaValidationError,
      maxLength: (Any, Any, Any) => SchemaValidationError,
      maxProperties: (Any, Any, Any) => SchemaValidationError,
      maximum: (Any, Any, Any) => SchemaValidationError,
      minItems: (Any, Any, Any) => SchemaValidationError,
      minLength: (Any, Any, Any) => SchemaValidationError,
      minProperties: (Any, Any, Any) => SchemaValidationError,
      minimum: (Any, Any, Any) => SchemaValidationError,
      multipleOf: (Any, Any, Any) => SchemaValidationError,
      not: (Any, Any, Any) => SchemaValidationError,
      oneOf: (Any, Any, Any) => js.Array[SchemaValidationError],
      pattern: (Any, Any, Any) => SchemaValidationError,
      properties: (Any, Any, Any) => js.Array[SchemaValidationError],
      required: (Any, Any, Any) => js.Array[SchemaValidationError],
      `type`: (Any, Any, Any) => SchemaValidationError,
      uniqueItems: (Any, Any, Any) => SchemaValidationError
    ): AllOf = {
      val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
      __obj.updateDynamic("enum")(js.Any.fromFunction3(`enum`))
      __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
      __obj.asInstanceOf[AllOf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllOf] (val x: Self) extends AnyVal {
      
      inline def setAllOf(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "allOf", js.Any.fromFunction3(value))
      
      inline def setAnyOf(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "anyOf", js.Any.fromFunction3(value))
      
      inline def setDependencies(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "dependencies", js.Any.fromFunction3(value))
      
      inline def setEnum(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "enum", js.Any.fromFunction3(value))
      
      inline def setItems(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "items", js.Any.fromFunction3(value))
      
      inline def setMaxItems(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "maxItems", js.Any.fromFunction3(value))
      
      inline def setMaxLength(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "maxLength", js.Any.fromFunction3(value))
      
      inline def setMaxProperties(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "maxProperties", js.Any.fromFunction3(value))
      
      inline def setMaximum(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "maximum", js.Any.fromFunction3(value))
      
      inline def setMinItems(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "minItems", js.Any.fromFunction3(value))
      
      inline def setMinLength(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "minLength", js.Any.fromFunction3(value))
      
      inline def setMinProperties(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "minProperties", js.Any.fromFunction3(value))
      
      inline def setMinimum(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "minimum", js.Any.fromFunction3(value))
      
      inline def setMultipleOf(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "multipleOf", js.Any.fromFunction3(value))
      
      inline def setNot(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "not", js.Any.fromFunction3(value))
      
      inline def setOneOf(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "oneOf", js.Any.fromFunction3(value))
      
      inline def setPattern(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "pattern", js.Any.fromFunction3(value))
      
      inline def setProperties(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "properties", js.Any.fromFunction3(value))
      
      inline def setRequired(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "required", js.Any.fromFunction3(value))
      
      inline def setType(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
      
      inline def setUniqueItems(value: (Any, Any, Any) => SchemaValidationError): Self = StObject.set(x, "uniqueItems", js.Any.fromFunction3(value))
    }
  }
  
  trait Array extends StObject {
    
    def array(value: Any): Boolean
    
    def boolean(value: Any): Boolean
    
    def integer(value: Any): Boolean
    
    def `null`(value: Any): Boolean
    
    def number(value: Any): Boolean
    
    def `object`(value: Any): Boolean
    
    def string(value: Any): Boolean
  }
  object Array {
    
    inline def apply(
      array: Any => Boolean,
      boolean: Any => Boolean,
      integer: Any => Boolean,
      `null`: Any => Boolean,
      number: Any => Boolean,
      `object`: Any => Boolean,
      string: Any => Boolean
    ): Array = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
      __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      inline def setArray(value: Any => Boolean): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setBoolean(value: Any => Boolean): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setInteger(value: Any => Boolean): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      inline def setNull(value: Any => Boolean): Self = StObject.set(x, "null", js.Any.fromFunction1(value))
      
      inline def setNumber(value: Any => Boolean): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setObject(value: Any => Boolean): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      inline def setString(value: Any => Boolean): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
    }
  }
  
  trait Integer extends StObject {
    
    def array(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def integer(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def number(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def numeric(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def `object`(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
    
    def string(value: Any, schema: Any, opts: Any): js.Array[SchemaValidationError]
  }
  object Integer {
    
    inline def apply(
      array: (Any, Any, Any) => js.Array[SchemaValidationError],
      integer: (Any, Any, Any) => js.Array[SchemaValidationError],
      number: (Any, Any, Any) => js.Array[SchemaValidationError],
      numeric: (Any, Any, Any) => js.Array[SchemaValidationError],
      `object`: (Any, Any, Any) => js.Array[SchemaValidationError],
      string: (Any, Any, Any) => js.Array[SchemaValidationError]
    ): Integer = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
      __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
      __obj.asInstanceOf[Integer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Integer] (val x: Self) extends AnyVal {
      
      inline def setArray(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "array", js.Any.fromFunction3(value))
      
      inline def setInteger(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "integer", js.Any.fromFunction3(value))
      
      inline def setNumber(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "number", js.Any.fromFunction3(value))
      
      inline def setNumeric(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "numeric", js.Any.fromFunction3(value))
      
      inline def setObject(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "object", js.Any.fromFunction3(value))
      
      inline def setString(value: (Any, Any, Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "string", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait TypeofRecord
    extends StObject
       with Instantiable0[Record]
       with Instantiable1[/* props */ Any, Record]
       with Instantiable2[(/* props */ Any) | (/* props */ Unit), /* opts */ Any, Record] {
    
    var mapper: Mapper = js.native
  }
  
  trait _empty extends StObject {
    
    @JSName("==")
    def EqualssignEqualssign(value: Any, predicate: Any): Boolean
    
    @JSName("===")
    def EqualssignEqualssignEqualssign(value: Any, predicate: Any): Boolean
    
    @JSName("!=")
    def ExclamationmarkEqualssign(value: Any, predicate: Any): Boolean
    
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(value: Any, predicate: Any): Boolean
    
    @JSName(">")
    def Greaterthansign(value: Any, predicate: Any): Boolean
    
    @JSName(">=")
    def GreaterthansignEqualssign(value: Any, predicate: Any): Boolean
    
    @JSName("<")
    def Lessthansign(value: Any, predicate: Any): Boolean
    
    @JSName("<=")
    def LessthansignEqualssign(value: Any, predicate: Any): Boolean
    
    def contains(value: Any, predicate: Any): Boolean
    
    def in(value: Any, predicate: Any): Boolean
    
    def isectEmpty(value: Any, predicate: Any): Boolean
    
    def isectNotEmpty(value: Any, predicate: Any): Double
    
    def notContains(value: Any, predicate: Any): Boolean
    
    def notIn(value: Any, predicate: Any): Boolean
  }
  object _empty {
    
    inline def apply(
      EqualssignEqualssign: (Any, Any) => Boolean,
      EqualssignEqualssignEqualssign: (Any, Any) => Boolean,
      ExclamationmarkEqualssign: (Any, Any) => Boolean,
      ExclamationmarkEqualssignEqualssign: (Any, Any) => Boolean,
      Greaterthansign: (Any, Any) => Boolean,
      GreaterthansignEqualssign: (Any, Any) => Boolean,
      Lessthansign: (Any, Any) => Boolean,
      LessthansignEqualssign: (Any, Any) => Boolean,
      contains: (Any, Any) => Boolean,
      in: (Any, Any) => Boolean,
      isectEmpty: (Any, Any) => Boolean,
      isectNotEmpty: (Any, Any) => Double,
      notContains: (Any, Any) => Boolean,
      notIn: (Any, Any) => Boolean
    ): _empty = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), in = js.Any.fromFunction2(in), isectEmpty = js.Any.fromFunction2(isectEmpty), isectNotEmpty = js.Any.fromFunction2(isectNotEmpty), notContains = js.Any.fromFunction2(notContains), notIn = js.Any.fromFunction2(notIn))
      __obj.updateDynamic("==")(js.Any.fromFunction2(EqualssignEqualssign))
      __obj.updateDynamic("===")(js.Any.fromFunction2(EqualssignEqualssignEqualssign))
      __obj.updateDynamic("!=")(js.Any.fromFunction2(ExclamationmarkEqualssign))
      __obj.updateDynamic("!==")(js.Any.fromFunction2(ExclamationmarkEqualssignEqualssign))
      __obj.updateDynamic(">")(js.Any.fromFunction2(Greaterthansign))
      __obj.updateDynamic(">=")(js.Any.fromFunction2(GreaterthansignEqualssign))
      __obj.updateDynamic("<")(js.Any.fromFunction2(Lessthansign))
      __obj.updateDynamic("<=")(js.Any.fromFunction2(LessthansignEqualssign))
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def setContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
      
      inline def setEqualssignEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, "==", js.Any.fromFunction2(value))
      
      inline def setEqualssignEqualssignEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, "===", js.Any.fromFunction2(value))
      
      inline def setExclamationmarkEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, "!=", js.Any.fromFunction2(value))
      
      inline def setExclamationmarkEqualssignEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, "!==", js.Any.fromFunction2(value))
      
      inline def setGreaterthansign(value: (Any, Any) => Boolean): Self = StObject.set(x, ">", js.Any.fromFunction2(value))
      
      inline def setGreaterthansignEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, ">=", js.Any.fromFunction2(value))
      
      inline def setIn(value: (Any, Any) => Boolean): Self = StObject.set(x, "in", js.Any.fromFunction2(value))
      
      inline def setIsectEmpty(value: (Any, Any) => Boolean): Self = StObject.set(x, "isectEmpty", js.Any.fromFunction2(value))
      
      inline def setIsectNotEmpty(value: (Any, Any) => Double): Self = StObject.set(x, "isectNotEmpty", js.Any.fromFunction2(value))
      
      inline def setLessthansign(value: (Any, Any) => Boolean): Self = StObject.set(x, "<", js.Any.fromFunction2(value))
      
      inline def setLessthansignEqualssign(value: (Any, Any) => Boolean): Self = StObject.set(x, "<=", js.Any.fromFunction2(value))
      
      inline def setNotContains(value: (Any, Any) => Boolean): Self = StObject.set(x, "notContains", js.Any.fromFunction2(value))
      
      inline def setNotIn(value: (Any, Any) => Boolean): Self = StObject.set(x, "notIn", js.Any.fromFunction2(value))
    }
  }
}
