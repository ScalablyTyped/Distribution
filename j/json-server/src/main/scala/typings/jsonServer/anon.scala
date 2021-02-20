package typings.jsonServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ForeignKeySuffix extends StObject {
    
    var foreignKeySuffix: String = js.native
  }
  object ForeignKeySuffix {
    
    @scala.inline
    def apply(foreignKeySuffix: String): ForeignKeySuffix = {
      val __obj = js.Dynamic.literal(foreignKeySuffix = foreignKeySuffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeySuffix]
    }
    
    @scala.inline
    implicit class ForeignKeySuffixMutableBuilder[Self <: ForeignKeySuffix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForeignKeySuffix(value: String): Self = StObject.set(x, "foreignKeySuffix", value.asInstanceOf[js.Any])
    }
  }
}
