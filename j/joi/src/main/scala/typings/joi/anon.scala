package typings.joi

import typings.joi.joiBooleans.`false`
import typings.joi.mod.AlternativesSchema
import typings.joi.mod.AnySchema
import typings.joi.mod.ArraySchema
import typings.joi.mod.BinarySchema
import typings.joi.mod.BooleanSchema
import typings.joi.mod.CustomHelpers
import typings.joi.mod.DateSchema
import typings.joi.mod.ExtensionBoundSchema
import typings.joi.mod.FunctionSchema
import typings.joi.mod.LinkSchema
import typings.joi.mod.NumberSchema
import typings.joi.mod.ObjectSchema
import typings.joi.mod.StringSchema
import typings.joi.mod.SymbolSchema
import typings.joi.mod.ValidationError
import typings.joi.mod.ValidationResult
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alternatives extends StObject {
    
    var alternatives: AlternativesSchema[Any]
    
    var any: AnySchema[Any]
    
    var array: ArraySchema[js.Array[Any]]
    
    var binary: BinarySchema[Buffer]
    
    var boolean: BooleanSchema[Boolean]
    
    var date: DateSchema[js.Date]
    
    var function: FunctionSchema[js.Function]
    
    var link: LinkSchema[Any]
    
    var number: NumberSchema[Double]
    
    var `object`: ObjectSchema[Any]
    
    var string: StringSchema[String]
    
    var symbol: SymbolSchema[js.Symbol]
  }
  object Alternatives {
    
    inline def apply(
      alternatives: AlternativesSchema[Any],
      any: AnySchema[Any],
      array: ArraySchema[js.Array[Any]],
      binary: BinarySchema[Buffer],
      boolean: BooleanSchema[Boolean],
      date: DateSchema[js.Date],
      function: FunctionSchema[js.Function],
      link: LinkSchema[Any],
      number: NumberSchema[Double],
      `object`: ObjectSchema[Any],
      string: StringSchema[String],
      symbol: SymbolSchema[js.Symbol]
    ): Alternatives = {
      val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alternatives]
    }
    
    extension [Self <: Alternatives](x: Self) {
      
      inline def setAlternatives(value: AlternativesSchema[Any]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      inline def setAny(value: AnySchema[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setArray(value: ArraySchema[js.Array[Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setBinary(value: BinarySchema[Buffer]): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: BooleanSchema[Boolean]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateSchema[js.Date]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: FunctionSchema[js.Function]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setLink(value: LinkSchema[Any]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: NumberSchema[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ObjectSchema[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setString(value: StringSchema[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: SymbolSchema[js.Symbol]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Array extends StObject {
    
    /**
      * the characters used around array values. Defaults to `'[]'`
      *
      * @default '[]'
      */
    var array: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * the characters used around `{#label}` references. Defaults to `'"'`.
      *
      * @default '"'
      */
    var label: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * the characters used around array string values. Defaults to no wrapping.
      *
      * @default false
      */
    var string: js.UndefOr[String | `false`] = js.undefined
  }
  object Array {
    
    inline def apply(): Array = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Array]
    }
    
    extension [Self <: Array](x: Self) {
      
      inline def setArray(value: String | `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setLabel(value: String | `false`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setString(value: String | `false`): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait Arrays extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.undefined
    
    var objects: js.UndefOr[Boolean] = js.undefined
  }
  object Arrays {
    
    inline def apply(): Arrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arrays]
    }
    
    extension [Self <: Arrays](x: Self) {
      
      inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    }
  }
  
  trait Build extends StObject {
    
    var build: js.UndefOr[
        js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, Any], Any]
      ] = js.undefined
  }
  object Build {
    
    inline def apply(): Build = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Build]
    }
    
    extension [Self <: Build](x: Self) {
      
      inline def setBuild(value: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, Any]) => Any): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    }
  }
  
  trait Error[TSchema]
    extends StObject
       with ValidationResult[TSchema] {
    
    var error: Unit
    
    var value: TSchema
    
    var warning: js.UndefOr[ValidationError] = js.undefined
  }
  object Error {
    
    inline def apply[TSchema](error: Unit, value: TSchema): Error[TSchema] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[TSchema]]
    }
    
    extension [Self <: Error[?], TSchema](x: Self & Error[TSchema]) {
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TSchema): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: ValidationError): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var to: String
  }
  object From {
    
    inline def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global extends StObject {
    
    /**
      * references to the globally provided context preference.
      *
      * @default '$'
      */
    var global: js.UndefOr[String] = js.undefined
    
    /**
      * references to error-specific or rule specific context.
      *
      * @default '#'
      */
    var local: js.UndefOr[String] = js.undefined
    
    /**
      * references to the root value being validated.
      *
      * @default '/'
      */
    var root: js.UndefOr[String] = js.undefined
  }
  object Global {
    
    inline def apply(): Global = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait Override extends StObject {
    
    var `override`: Boolean
  }
  object Override {
    
    inline def apply(`override`: Boolean): Override = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Override]
    }
    
    extension [Self <: Override](x: Self) {
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  trait To extends StObject {
    
    def from(value: Any): Any
    
    def to(value: Any, helpers: CustomHelpers[Any]): Any
  }
  object To {
    
    inline def apply(from: Any => Any, to: (Any, CustomHelpers[Any]) => Any): To = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setFrom(value: Any => Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setTo(value: (Any, CustomHelpers[Any]) => Any): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    }
  }
  
  trait Value
    extends StObject
       with ValidationResult[Any] {
    
    var error: ValidationError
    
    var value: Unit
    
    var warning: js.UndefOr[ValidationError] = js.undefined
  }
  object Value {
    
    inline def apply(error: ValidationError, value: Unit): Value = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: ValidationError): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
}
