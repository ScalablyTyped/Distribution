package typings.handlebarsHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebarsHelpers.anon.TypeofHandlebars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: js.UndefOr[scala.Nothing], options: Options): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: String): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: String, options: Options): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: js.Array[String]): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: js.Array[String], options: Options): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: Options): StringDictionary[HelperDelegate] = js.native
  @JSImport("handlebars-helpers", JSImport.Namespace)
  @js.native
  def apply(groups: Options, options: Options): StringDictionary[HelperDelegate] = js.native
  
  @JSImport("handlebars-helpers", "utils")
  @js.native
  val utils: Utils_ = js.native
  
  @js.native
  trait Options extends StObject {
    
    var handlebars: js.UndefOr[TypeofHandlebars] = js.native
    
    var hbs: js.UndefOr[TypeofHandlebars] = js.native
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
      def setHandlebars(value: TypeofHandlebars): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
      
      @scala.inline
      def setHbs(value: TypeofHandlebars): Self = StObject.set(x, "hbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHbsUndefined: Self = StObject.set(x, "hbs", js.undefined)
    }
  }
  
  @js.native
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
    def changecase(str: String, fn: js.Function1[/* str */ String, String]): String = js.native
    
    /**
      * Remove leading and trailing whitespace and non-word
      * characters from the given string.
      */
    def chop(str: String): String = js.native
    
    /**
      * Returns true if the given value contains the given
      * `object`, optionally passing a starting index.
      */
    def contains[T](`val`: js.Array[T], obj: T, start: Double): Boolean = js.native
  }
  object Utils_ {
    
    @scala.inline
    def apply(
      changecase: (String, js.Function1[/* str */ String, String]) => String,
      chop: String => String,
      contains: (js.Array[js.Any], js.Any, Double) => Boolean
    ): Utils_ = {
      val __obj = js.Dynamic.literal(changecase = js.Any.fromFunction2(changecase), chop = js.Any.fromFunction1(chop), contains = js.Any.fromFunction3(contains))
      __obj.asInstanceOf[Utils_]
    }
    
    @scala.inline
    implicit class Utils_MutableBuilder[Self <: Utils_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangecase(value: (String, js.Function1[/* str */ String, String]) => String): Self = StObject.set(x, "changecase", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChop(value: String => String): Self = StObject.set(x, "chop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContains(value: (js.Array[js.Any], js.Any, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction3(value))
    }
  }
}
