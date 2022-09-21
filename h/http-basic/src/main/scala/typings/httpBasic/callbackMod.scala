package typings.httpBasic

import typings.httpResponseObject.mod.^
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  type Callback = js.Function2[
    /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
    /* response */ js.UndefOr[^[ReadableStream[Any]]], 
    Unit
  ]
}
