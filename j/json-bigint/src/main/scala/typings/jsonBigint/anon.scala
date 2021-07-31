package typings.jsonBigint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(text: String): js.Any = js.native
    def apply(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): js.Any = js.native
  }
  
  @js.native
  trait FnCallValueReplacerSpace extends StObject {
    
    def apply(value: js.Any): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: String
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: Double
    ): String = js.native
    def apply(value: js.Any, replacer: Null, space: String): String = js.native
    def apply(value: js.Any, replacer: Null, space: Double): String = js.native
    def apply(value: js.Any, replacer: Unit, space: String): String = js.native
    def apply(value: js.Any, replacer: Unit, space: Double): String = js.native
  }
  
  trait Parse extends StObject
  
  trait Stringify extends StObject {
    
    def parse(text: String): js.Any
    def parse(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): js.Any
    @JSName("parse")
    var parse_Original: FnCall
    
    def stringify(value: js.Any): String
    def stringify(value: js.Any, replacer: js.Array[Double | String]): String
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: String
    ): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: Double
    ): String
    def stringify(value: js.Any, replacer: Null, space: String): String
    def stringify(value: js.Any, replacer: Null, space: Double): String
    def stringify(value: js.Any, replacer: Unit, space: String): String
    def stringify(value: js.Any, replacer: Unit, space: Double): String
    @JSName("stringify")
    var stringify_Original: FnCallValueReplacerSpace
  }
  object Stringify {
    
    @scala.inline
    def apply(parse: FnCall, stringify: FnCallValueReplacerSpace): Stringify = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stringify]
    }
    
    @scala.inline
    implicit class StringifyMutableBuilder[Self <: Stringify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: FnCall): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify(value: FnCallValueReplacerSpace): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
}
