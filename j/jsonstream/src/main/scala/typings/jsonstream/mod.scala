package typings.jsonstream

import typings.jsonstream.jsonstreamBooleans.`false`
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonstream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(pattern: Any): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def parse(patterns: js.Array[Any]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(patterns.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  inline def stringify(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[ReadWriteStream]
  inline def stringify(newlineOnly: NewlineOnlyIndicator): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(newlineOnly.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def stringify(open: String, sep: String, close: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(open.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  inline def stringifyObject(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")().asInstanceOf[ReadWriteStream]
  inline def stringifyObject(open: String, sep: String, close: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")(open.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  type NewlineOnlyIndicator = `false`
  
  trait Options extends StObject {
    
    var recurse: Boolean
  }
  object Options {
    
    inline def apply(recurse: Boolean): Options = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    }
  }
}
