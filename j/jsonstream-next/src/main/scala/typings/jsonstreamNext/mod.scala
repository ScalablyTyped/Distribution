package typings.jsonstreamNext

import typings.jsonstreamNext.jsonstreamNextBooleans.`false`
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonstream-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(pattern: Any): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def parse(patterns: js.Array[Any]): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(patterns.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def stringify(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Transform]
  inline def stringify(newlineOnly: NewlineOnlyIndicator): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(newlineOnly.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def stringify(open: String, sep: String, close: String): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(open.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  inline def stringifyObject(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")().asInstanceOf[Transform]
  inline def stringifyObject(newlineOnly: NewlineOnlyIndicator): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")(newlineOnly.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def stringifyObject(open: String, sep: String, close: String): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")(open.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  type NewlineOnlyIndicator = `false`
  
  trait Options extends StObject {
    
    var recurse: Boolean
  }
  object Options {
    
    inline def apply(recurse: Boolean): Options = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    }
  }
}
