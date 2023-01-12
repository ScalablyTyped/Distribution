package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<ionic.ionic/definitions.HookName, string | std.Array<string> | undefined> */
trait RecordHookNamestringArray extends StObject {
  
  @JSName("build:after")
  var buildColonafter: js.UndefOr[String | js.Array[String]] = js.undefined
  
  @JSName("build:before")
  var buildColonbefore: js.UndefOr[String | js.Array[String]] = js.undefined
  
  @JSName("serve:after")
  var serveColonafter: js.UndefOr[String | js.Array[String]] = js.undefined
  
  @JSName("serve:before")
  var serveColonbefore: js.UndefOr[String | js.Array[String]] = js.undefined
}
object RecordHookNamestringArray {
  
  inline def apply(): RecordHookNamestringArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordHookNamestringArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordHookNamestringArray] (val x: Self) extends AnyVal {
    
    inline def setBuildColonafter(value: String | js.Array[String]): Self = StObject.set(x, "build:after", value.asInstanceOf[js.Any])
    
    inline def setBuildColonafterUndefined: Self = StObject.set(x, "build:after", js.undefined)
    
    inline def setBuildColonafterVarargs(value: String*): Self = StObject.set(x, "build:after", js.Array(value*))
    
    inline def setBuildColonbefore(value: String | js.Array[String]): Self = StObject.set(x, "build:before", value.asInstanceOf[js.Any])
    
    inline def setBuildColonbeforeUndefined: Self = StObject.set(x, "build:before", js.undefined)
    
    inline def setBuildColonbeforeVarargs(value: String*): Self = StObject.set(x, "build:before", js.Array(value*))
    
    inline def setServeColonafter(value: String | js.Array[String]): Self = StObject.set(x, "serve:after", value.asInstanceOf[js.Any])
    
    inline def setServeColonafterUndefined: Self = StObject.set(x, "serve:after", js.undefined)
    
    inline def setServeColonafterVarargs(value: String*): Self = StObject.set(x, "serve:after", js.Array(value*))
    
    inline def setServeColonbefore(value: String | js.Array[String]): Self = StObject.set(x, "serve:before", value.asInstanceOf[js.Any])
    
    inline def setServeColonbeforeUndefined: Self = StObject.set(x, "serve:before", js.undefined)
    
    inline def setServeColonbeforeVarargs(value: String*): Self = StObject.set(x, "serve:before", js.Array(value*))
  }
}
