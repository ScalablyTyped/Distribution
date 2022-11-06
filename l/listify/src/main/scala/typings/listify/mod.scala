package typings.listify

import typings.listify.listifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Turn an array into a list of comma-separated values, appropriate for use in an English sentence.
    *
    * @example
    * import listify = require('listify');
    * import * as assert from 'node:assert';
    *
    * assert(listify([1, 2]) === '1 and 2');
    * assert(listify([1, 2, 3]) === '1, 2, and 3');
    * assert(listify([1, 2, 3, 4]) === '1, 2, 3, and 4');
    * assert(listify([1, 2, 3], { separator: '… ' }) === '1… 2… and 3');
    * assert(listify([1, 2, 3], { finalWord: false }) === '1, 2, 3');
    * assert(listify([1, 2, 3], { separator: '… ', finalWord: 'or' }) === '1… 2… or 3');
    */
  inline def apply(list: js.Array[String | Double]): String = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(list: js.Array[String | Double], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("listify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * @default 'and'
      */
    var finalWord: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * @default ', '
      */
    var separator: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFinalWord(value: String | `false`): Self = StObject.set(x, "finalWord", value.asInstanceOf[js.Any])
      
      inline def setFinalWordUndefined: Self = StObject.set(x, "finalWord", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
