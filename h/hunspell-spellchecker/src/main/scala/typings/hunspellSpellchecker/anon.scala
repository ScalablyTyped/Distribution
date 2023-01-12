package typings.hunspellSpellchecker

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aff extends StObject {
    
    var aff: Buffer
    
    var dic: Buffer
  }
  object Aff {
    
    inline def apply(aff: Buffer, dic: Buffer): Aff = {
      val __obj = js.Dynamic.literal(aff = aff.asInstanceOf[js.Any], dic = dic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aff]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aff] (val x: Self) extends AnyVal {
      
      inline def setAff(value: Buffer): Self = StObject.set(x, "aff", value.asInstanceOf[js.Any])
      
      inline def setDic(value: Buffer): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
    }
  }
}
