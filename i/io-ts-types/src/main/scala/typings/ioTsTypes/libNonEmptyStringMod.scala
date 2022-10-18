package typings.ioTsTypes

import typings.ioTs.mod.Branded
import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonEmptyStringMod {
  
  @JSImport("io-ts-types/lib/NonEmptyString", "NonEmptyString")
  @js.native
  val NonEmptyString: NonEmptyStringC = js.native
  type NonEmptyString = Branded[String, NonEmptyStringBrand]
  
  trait NonEmptyStringBrand extends StObject {
    
    val NonEmptyString: js.Symbol
  }
  object NonEmptyStringBrand {
    
    inline def apply(NonEmptyString: js.Symbol): NonEmptyStringBrand = {
      val __obj = js.Dynamic.literal(NonEmptyString = NonEmptyString.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonEmptyStringBrand]
    }
    
    extension [Self <: NonEmptyStringBrand](x: Self) {
      
      inline def setNonEmptyString(value: js.Symbol): Self = StObject.set(x, "NonEmptyString", value.asInstanceOf[js.Any])
    }
  }
  
  type NonEmptyStringC = Type_[typings.ioTsTypes.libNonEmptyStringMod.NonEmptyString, String, Any]
}
