package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsTypesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.DeepPartial<{  timeout :number}> */
trait DeepPartialtimeoutnumber extends StObject {
  
  var timeout: js.UndefOr[DeepPartial[Double]] = js.undefined
}
object DeepPartialtimeoutnumber {
  
  inline def apply(): DeepPartialtimeoutnumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialtimeoutnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepPartialtimeoutnumber] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: DeepPartial[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
