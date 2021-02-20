package typings.jsend

import typings.jsend.anon.Code
import typings.jsend.anon.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsend {
  
  @js.native
  trait JSendObject extends StObject {
    
    var code: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var status: String = js.native
  }
  object JSendObject {
    
    @scala.inline
    def apply(status: String): JSendObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSendObject]
    }
    
    @scala.inline
    implicit class JSendObjectMutableBuilder[Self <: JSendObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait jsend extends jsendCore {
    
    def forward(json: js.Object, done: js.Function2[/* err */ js.Any, /* data */ js.Any, _]): Unit = js.native
    
    def fromArguments(err: String): JSendObject = js.native
    def fromArguments(err: String, json: js.Object): JSendObject = js.native
    def fromArguments(err: js.Object): JSendObject = js.native
    def fromArguments(err: js.Object, json: js.Object): JSendObject = js.native
    
    def isValid(json: js.Object): Boolean = js.native
    
    def middleware(req: js.Any, res: js.Any, next: js.Function): js.Any = js.native
  }
  
  @js.native
  trait jsendCore extends StObject {
    
    def error(message: String): JSendObject = js.native
    def error(message: Code): JSendObject = js.native
    
    def fail(data: js.Object): JSendObject = js.native
    
    def success(data: js.Object): JSendObject = js.native
  }
  
  @js.native
  trait jsendExport
    extends typings.jsend.jsend.jsend {
    
    def apply(): typings.jsend.jsend.jsend = js.native
    def apply(config: js.UndefOr[scala.Nothing], host: js.Object): typings.jsend.jsend.jsend = js.native
    def apply(config: Strict): typings.jsend.jsend.jsend = js.native
    def apply(config: Strict, host: js.Object): typings.jsend.jsend.jsend = js.native
  }
  
  @js.native
  trait jsendExpress extends jsendCore {
    
    def apply(err: String): Unit = js.native
    def apply(err: String, json: js.Object): Unit = js.native
    def apply(err: js.Object): Unit = js.native
    def apply(err: js.Object, json: js.Object): Unit = js.native
  }
}
