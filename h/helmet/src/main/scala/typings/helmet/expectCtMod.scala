package typings.helmet

import typings.helmet.anon.ReadonlyExpectCtOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expectCtMod {
  
  @JSImport("helmet/dist/middlewares/expect-ct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  @scala.inline
  def default(options: ReadonlyExpectCtOptions): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait ExpectCtOptions extends StObject {
    
    var enforce: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var reportUri: js.UndefOr[String] = js.undefined
  }
  object ExpectCtOptions {
    
    @scala.inline
    def apply(): ExpectCtOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectCtOptions]
    }
    
    @scala.inline
    implicit class ExpectCtOptionsMutableBuilder[Self <: ExpectCtOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
    }
  }
}
