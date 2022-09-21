package typings.jsonSchemaFaker

import typings.jsonSchemaFaker.mod.NameOrFormatMap
import typings.jsonSchemaFaker.mod.OptionInputObject
import typings.jsonSchemaFaker.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsf {
    
    /** @deprecated calling JsonSchemaFaker() is deprecated, call either .generate() or .resolve()' */
    inline def apply(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(schema: Schema, refs: String): Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(schema: Schema, refs: js.Array[Schema]): Any = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSGlobal("jsf")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(name: String, cb: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def extend(name: String, cb: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def format(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[Any]
    inline def format(nameOrFormatMap: Unit, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def format(nameOrFormatMap: NameOrFormatMap): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def format(nameOrFormatMap: NameOrFormatMap, callback: js.Function1[/* schema */ js.UndefOr[Schema], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nameOrFormatMap.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def generate(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def generate(schema: Schema, refs: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def generate(schema: Schema, refs: js.Array[Schema]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def locate(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def option(option: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def option(option: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def option(option: OptionInputObject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def option(option: OptionInputObject, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    // jsf.random
    object random {
      
      @JSGlobal("jsf.random")
      @js.native
      val ^ : js.Any = js.native
      
      inline def date(step: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(step.asInstanceOf[js.Any]).asInstanceOf[js.Date]
      
      inline def number(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Double]
      inline def number(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def number(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Double, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Double, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Double, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Double, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Double, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def number(min: Unit, max: Unit, defMin: Unit, defMax: Unit, hasPrecision: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], defMin.asInstanceOf[js.Any], defMax.asInstanceOf[js.Any], hasPrecision.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def pick[T](collection: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(collection.asInstanceOf[js.Any]).asInstanceOf[T]
      
      inline def randexp(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
      
      inline def shuffle[T](collection: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(collection.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    }
    
    inline def reset(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def resolve(schema: Schema): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def resolve(schema: Schema, refs: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def resolve(schema: Schema, refs: String, cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def resolve(schema: Schema, refs: js.Array[Schema]): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def resolve(schema: Schema, refs: js.Array[Schema], cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def resolve(schema: Schema, refs: Unit, cwd: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    
    @JSGlobal("jsf.version")
    @js.native
    val version: String = js.native
  }
}
