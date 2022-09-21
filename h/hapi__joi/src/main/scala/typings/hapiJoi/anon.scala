package typings.hapiJoi

import typings.hapiJoi.hapiJoiBooleans.`false`
import typings.hapiJoi.mod.AlternativesSchema
import typings.hapiJoi.mod.AnySchema
import typings.hapiJoi.mod.ArraySchema
import typings.hapiJoi.mod.BinarySchema
import typings.hapiJoi.mod.BooleanSchema
import typings.hapiJoi.mod.CustomHelpers
import typings.hapiJoi.mod.DateSchema
import typings.hapiJoi.mod.ExtensionBoundSchema
import typings.hapiJoi.mod.FunctionSchema
import typings.hapiJoi.mod.LinkSchema
import typings.hapiJoi.mod.NumberSchema
import typings.hapiJoi.mod.ObjectSchema
import typings.hapiJoi.mod.StringSchema
import typings.hapiJoi.mod.SymbolSchema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alternatives extends StObject {
    
    var alternatives: AlternativesSchema
    
    var any: AnySchema
    
    var array: ArraySchema
    
    var binary: BinarySchema
    
    var boolean: BooleanSchema
    
    var date: DateSchema
    
    var function: FunctionSchema
    
    var link: LinkSchema
    
    var number: NumberSchema
    
    var `object`: ObjectSchema[Any]
    
    var string: StringSchema
    
    var symbol: SymbolSchema
  }
  object Alternatives {
    
    inline def apply(
      alternatives: AlternativesSchema,
      any: AnySchema,
      array: ArraySchema,
      binary: BinarySchema,
      boolean: BooleanSchema,
      date: DateSchema,
      function: FunctionSchema,
      link: LinkSchema,
      number: NumberSchema,
      `object`: ObjectSchema[Any],
      string: StringSchema,
      symbol: SymbolSchema
    ): Alternatives = {
      val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alternatives]
    }
    
    extension [Self <: Alternatives](x: Self) {
      
      inline def setAlternatives(value: AlternativesSchema): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      inline def setAny(value: AnySchema): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setArray(value: ArraySchema): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setBinary(value: BinarySchema): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: BooleanSchema): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateSchema): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: FunctionSchema): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setLink(value: LinkSchema): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: NumberSchema): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ObjectSchema[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setString(value: StringSchema): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: SymbolSchema): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Array extends StObject {
    
    /**
      * the characters used around array avlues. Defaults to `'[]'`
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
}
