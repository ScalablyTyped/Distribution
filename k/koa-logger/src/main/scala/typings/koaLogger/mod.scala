package typings.koaLogger

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: Transporter): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: TransporterOpts): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Transporter = js.Function2[
    /* str */ String, 
    /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]], 
    Unit
  ]
  
  trait TransporterOpts extends StObject {
    
    def transporter(
      str: String,
      args: js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]
    ): Unit
    @JSName("transporter")
    var transporter_Original: Transporter
  }
  object TransporterOpts {
    
    inline def apply(
      transporter: (/* str */ String, /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => Unit
    ): TransporterOpts = {
      val __obj = js.Dynamic.literal(transporter = js.Any.fromFunction2(transporter))
      __obj.asInstanceOf[TransporterOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransporterOpts] (val x: Self) extends AnyVal {
      
      inline def setTransporter(
        value: (/* str */ String, /* args */ js.Tuple6[String, String, String, js.UndefOr[Double], js.UndefOr[String], js.UndefOr[String]]) => Unit
      ): Self = StObject.set(x, "transporter", js.Any.fromFunction2(value))
    }
  }
}
