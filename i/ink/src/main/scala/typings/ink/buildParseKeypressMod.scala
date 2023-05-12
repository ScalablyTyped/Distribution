package typings.ink

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildParseKeypressMod {
  
  @JSImport("ink/build/parse-keypress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ParsedKey = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ParsedKey]
  inline def default(s: String): ParsedKey = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(s.asInstanceOf[js.Any]).asInstanceOf[ParsedKey]
  inline def default(s: Buffer): ParsedKey = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(s.asInstanceOf[js.Any]).asInstanceOf[ParsedKey]
  
  @JSImport("ink/build/parse-keypress", "nonAlphanumericKeys")
  @js.native
  val nonAlphanumericKeys: js.Array[String] = js.native
  
  trait ParsedKey extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var ctrl: Boolean
    
    var meta: Boolean
    
    var name: String
    
    var option: Boolean
    
    var raw: js.UndefOr[String] = js.undefined
    
    var sequence: String
    
    var shift: Boolean
  }
  object ParsedKey {
    
    inline def apply(ctrl: Boolean, meta: Boolean, name: String, option: Boolean, sequence: String, shift: Boolean): ParsedKey = {
      val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedKey] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
}
