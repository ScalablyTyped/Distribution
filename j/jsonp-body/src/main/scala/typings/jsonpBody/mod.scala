package typings.jsonpBody

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: Any, callback: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, callback: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, callback: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, callback: js.Array[String], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, callback: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jsonp-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** length limit for callback function name, default to `512` */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** replacer in `JSON.stringify(obj, [replacer, [space]])` */
    var replacer: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jsonp-body.anon.FnCall>[1] */ js.Any
      ] = js.undefined
    
    /** space in `JSON.stringify(obj, [replacer, [space]])` */
    var space: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jsonp-body.anon.FnCall>[2] */ js.Any
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReplacer(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jsonp-body.anon.FnCall>[1] */ js.Any
      ): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jsonp-body.anon.FnCall>[2] */ js.Any
      ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
