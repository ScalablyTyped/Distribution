package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<ionic.ionic/definitions.HookName, string | std.Array<string> | undefined> */
@js.native
trait RecordHookNamestringArray extends StObject {
  
  @JSName("build:after")
  var buildColonafter: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("build:before")
  var buildColonbefore: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("serve:after")
  var serveColonafter: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("serve:before")
  var serveColonbefore: js.UndefOr[String | js.Array[String]] = js.native
}
object RecordHookNamestringArray {
  
  @scala.inline
  def apply(): RecordHookNamestringArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordHookNamestringArray]
  }
  
  @scala.inline
  implicit class RecordHookNamestringArrayMutableBuilder[Self <: RecordHookNamestringArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildColonafter(value: String | js.Array[String]): Self = StObject.set(x, "build:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildColonafterUndefined: Self = StObject.set(x, "build:after", js.undefined)
    
    @scala.inline
    def setBuildColonafterVarargs(value: String*): Self = StObject.set(x, "build:after", js.Array(value :_*))
    
    @scala.inline
    def setBuildColonbefore(value: String | js.Array[String]): Self = StObject.set(x, "build:before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildColonbeforeUndefined: Self = StObject.set(x, "build:before", js.undefined)
    
    @scala.inline
    def setBuildColonbeforeVarargs(value: String*): Self = StObject.set(x, "build:before", js.Array(value :_*))
    
    @scala.inline
    def setServeColonafter(value: String | js.Array[String]): Self = StObject.set(x, "serve:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeColonafterUndefined: Self = StObject.set(x, "serve:after", js.undefined)
    
    @scala.inline
    def setServeColonafterVarargs(value: String*): Self = StObject.set(x, "serve:after", js.Array(value :_*))
    
    @scala.inline
    def setServeColonbefore(value: String | js.Array[String]): Self = StObject.set(x, "serve:before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeColonbeforeUndefined: Self = StObject.set(x, "serve:before", js.undefined)
    
    @scala.inline
    def setServeColonbeforeVarargs(value: String*): Self = StObject.set(x, "serve:before", js.Array(value :_*))
  }
}
