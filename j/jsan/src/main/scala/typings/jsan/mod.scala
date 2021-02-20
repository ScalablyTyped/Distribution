package typings.jsan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("jsan", "parse")
  @js.native
  def parse(text: String): js.Any = js.native
  @JSImport("jsan", "parse")
  @js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  @scala.inline
  def parse_=(
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
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    space: js.UndefOr[scala.Nothing],
    _options: Boolean
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    space: js.UndefOr[scala.Nothing],
    _options: Options
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String, _options: Boolean): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String, _options: Options): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double, _options: Boolean): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double, _options: Options): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null]
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: js.UndefOr[scala.Nothing],
    _options: Boolean
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: js.UndefOr[scala.Nothing],
    _options: Options
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String,
    _options: Boolean
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: String,
    _options: Options
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Boolean
  ): String = js.native
  @JSImport("jsan", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _ | (js.Array[Double | String]) | Null],
    space: Double,
    _options: Options
  ): String = js.native
  @scala.inline
  def stringify_=(
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
  
  @js.native
  trait Options extends StObject {
    
    var date: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var function: js.UndefOr[Boolean] = js.native
    
    var infinity: js.UndefOr[Boolean] = js.native
    
    var map: js.UndefOr[Boolean] = js.native
    
    var nan: js.UndefOr[Boolean] = js.native
    
    var refs: js.UndefOr[Boolean] = js.native
    
    var regex: js.UndefOr[Boolean] = js.native
    
    var set: js.UndefOr[Boolean] = js.native
    
    var symbol: js.UndefOr[Boolean] = js.native
    
    var undefined: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFunction(value: Boolean): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setInfinity(value: Boolean): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfinityUndefined: Self = StObject.set(x, "infinity", js.undefined)
      
      @scala.inline
      def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setNan(value: Boolean): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanUndefined: Self = StObject.set(x, "nan", js.undefined)
      
      @scala.inline
      def setRefs(value: Boolean): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setUndefined(value: Boolean): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
}
