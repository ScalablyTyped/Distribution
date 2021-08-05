package typings.handlebarsHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebarsHelpers.anon.TypeofHandlebars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): StringDictionary[HelperDelegate] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: String): StringDictionary[HelperDelegate] = ^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: String, options: Options): StringDictionary[HelperDelegate] = (^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: js.Array[String]): StringDictionary[HelperDelegate] = ^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: js.Array[String], options: Options): StringDictionary[HelperDelegate] = (^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: Unit, options: Options): StringDictionary[HelperDelegate] = (^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: Options): StringDictionary[HelperDelegate] = ^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[HelperDelegate]]
  inline def apply(groups: Options, options: Options): StringDictionary[HelperDelegate] = (^.asInstanceOf[js.Dynamic].apply(groups.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[HelperDelegate]]
  
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handlebars-helpers", "utils")
  @js.native
  val utils: Utils_ = js.native
  
  trait Options extends StObject {
    
    var handlebars: js.UndefOr[TypeofHandlebars] = js.undefined
    
    var hbs: js.UndefOr[TypeofHandlebars] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHandlebars(value: TypeofHandlebars): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
      
      inline def setHbs(value: TypeofHandlebars): Self = StObject.set(x, "hbs", value.asInstanceOf[js.Any])
      
      inline def setHbsUndefined: Self = StObject.set(x, "hbs", js.undefined)
    }
  }
  
  trait Utils_ extends StObject {
    
    /**
      * Change casing on the given `string`, optionally
      * passing a delimiter to use between words in the
      * returned string.
      *
      * ```handlebars
      * utils.changecase('fooBarBaz');
      * //=> 'foo bar baz'
      *
      * utils.changecase('fooBarBaz' '-');
      * //=> 'foo-bar-baz'
      * ```
      */
    def changecase(str: String, fn: js.Function1[/* str */ String, String]): String
    
    /**
      * Remove leading and trailing whitespace and non-word
      * characters from the given string.
      */
    def chop(str: String): String
    
    /**
      * Returns true if the given value contains the given
      * `object`, optionally passing a starting index.
      */
    def contains[T](`val`: js.Array[T], obj: T, start: Double): Boolean
  }
  object Utils_ {
    
    inline def apply(
      changecase: (String, js.Function1[/* str */ String, String]) => String,
      chop: String => String,
      contains: (js.Array[js.Any], js.Any, Double) => Boolean
    ): Utils_ = {
      val __obj = js.Dynamic.literal(changecase = js.Any.fromFunction2(changecase), chop = js.Any.fromFunction1(chop), contains = js.Any.fromFunction3(contains))
      __obj.asInstanceOf[Utils_]
    }
    
    extension [Self <: Utils_](x: Self) {
      
      inline def setChangecase(value: (String, js.Function1[/* str */ String, String]) => String): Self = StObject.set(x, "changecase", js.Any.fromFunction2(value))
      
      inline def setChop(value: String => String): Self = StObject.set(x, "chop", js.Any.fromFunction1(value))
      
      inline def setContains(value: (js.Array[js.Any], js.Any, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction3(value))
    }
  }
}
