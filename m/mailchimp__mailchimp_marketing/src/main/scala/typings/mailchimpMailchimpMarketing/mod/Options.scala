package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var skipMergeValidation: Boolean
}
object Options {
  
  inline def apply(skipMergeValidation: Boolean): Options = {
    val __obj = js.Dynamic.literal(skipMergeValidation = skipMergeValidation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setSkipMergeValidation(value: Boolean): Self = StObject.set(x, "skipMergeValidation", value.asInstanceOf[js.Any])
  }
}
