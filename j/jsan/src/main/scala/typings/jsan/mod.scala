package typings.jsan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsan", "parse")
  @js.native
  def parse: js.Function2[
    /* text */ String, 
    /* reviver */ js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]], 
    js.Any
  ] = js.native
  inline def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def parse_=(
    x: js.Function2[
      /* text */ String, 
      /* reviver */ js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]], 
      js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  @JSImport("jsan", "stringify")
  @js.native
  def stringify: js.Function4[
    /* value */ js.Any, 
    /* replacer */ js.UndefOr[
      js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null]
    ], 
    /* space */ js.UndefOr[String | Double], 
    /* _options */ js.UndefOr[Options | Boolean], 
    String
  ] = js.native
  inline def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: String,
    _options: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: String,
    _options: Options
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Options
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: Unit,
    _options: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null],
    space: Unit,
    _options: Options
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: String, _options: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: String, _options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Double, _options: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Double, _options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Unit, _options: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Unit, _options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify_=(
    x: js.Function4[
      /* value */ js.Any, 
      /* replacer */ js.UndefOr[
        js.Function2[/* key */ String, /* value */ js.Any, js.Any | (js.Array[Double | String]) | Null]
      ], 
      /* space */ js.UndefOr[String | Double], 
      /* _options */ js.UndefOr[Options | Boolean], 
      String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var date: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var function: js.UndefOr[Boolean] = js.undefined
    
    var infinity: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Boolean] = js.undefined
    
    var nan: js.UndefOr[Boolean] = js.undefined
    
    var refs: js.UndefOr[Boolean] = js.undefined
    
    var regex: js.UndefOr[Boolean] = js.undefined
    
    var set: js.UndefOr[Boolean] = js.undefined
    
    var symbol: js.UndefOr[Boolean] = js.undefined
    
    var undefined: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFunction(value: Boolean): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setInfinity(value: Boolean): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
      
      inline def setInfinityUndefined: Self = StObject.set(x, "infinity", js.undefined)
      
      inline def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setNan(value: Boolean): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      inline def setNanUndefined: Self = StObject.set(x, "nan", js.undefined)
      
      inline def setRefs(value: Boolean): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setUndefined(value: Boolean): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
}
