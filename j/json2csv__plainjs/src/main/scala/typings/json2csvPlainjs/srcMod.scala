package typings.json2csvPlainjs

import typings.json2csvPlainjs.srcBaseParserMod.Options
import typings.json2csvPlainjs.srcParserMod.default
import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@json2csv/plainjs/src", "Parser")
  @js.native
  open class Parser () extends default
  
  @JSImport("@json2csv/plainjs/src", "StreamParser")
  @js.native
  open class StreamParser ()
    extends typings.json2csvPlainjs.srcStreamParserMod.default {
    def this(opts: Options) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions) = this()
    def this(opts: Options, asyncOpts: AsyncOptions) = this()
  }
  
  type Field = String | (js.Function1[/* row */ js.Array[Any], String]) | FieldObject
  
  trait FieldObject extends StObject {
    
    /** Default if value is not found */
    var default: js.UndefOr[String] = js.undefined
    
    /** The label. Defaults to the value path if not provided */
    var label: js.UndefOr[String] = js.undefined
    
    /** The target path */
    var value: String | (js.Function1[/* row */ js.Array[Any], String])
  }
  object FieldObject {
    
    inline def apply(value: String | (js.Function1[/* row */ js.Array[Any], String])): FieldObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldObject] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | (js.Function1[/* row */ js.Array[Any], String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: /* row */ js.Array[Any] => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  trait Formatters extends StObject {
    
    var bigint: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    
    var boolean: js.UndefOr[js.Function1[/* value */ Boolean, Boolean]] = js.undefined
    
    var function: js.UndefOr[
        js.Function1[/* value */ js.Function1[/* repeated */ Any, Any], js.UndefOr[String]]
      ] = js.undefined
    
    var header: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var number: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    
    var `object`: js.UndefOr[js.Function1[/* value */ Any, String]] = js.undefined
    
    var string: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var symbol: js.UndefOr[js.Function1[/* value */ js.Symbol, String]] = js.undefined
    
    var undefined: js.UndefOr[js.Function1[/* value */ Unit, String]] = js.undefined
  }
  object Formatters {
    
    inline def apply(): Formatters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Formatters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formatters] (val x: Self) extends AnyVal {
      
      inline def setBigint(value: /* value */ Double => Double): Self = StObject.set(x, "bigint", js.Any.fromFunction1(value))
      
      inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      inline def setBoolean(value: /* value */ Boolean => Boolean): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setFunction(value: /* value */ js.Function1[/* repeated */ Any, Any] => js.UndefOr[String]): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setHeader(value: /* value */ String => String): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setNumber(value: /* value */ Double => Double): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setObject(value: /* value */ Any => String): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setString(value: /* value */ String => String): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setSymbol(value: /* value */ js.Symbol => String): Self = StObject.set(x, "symbol", js.Any.fromFunction1(value))
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setUndefined(value: /* value */ Unit => String): Self = StObject.set(x, "undefined", js.Any.fromFunction1(value))
      
      inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
}
