package typings.matrixJsSdk

import typings.matrixJsSdk.matrixMod.ICreateClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matrix-js-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("matrix-js-sdk", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-js-sdk", "default.ContentHelpers")
    @js.native
    val ContentHelpers: js.Promise[js.Any] = js.native
    
    @scala.inline
    def createClient(opts: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createClient(opts: ICreateClientOpts): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getRequest(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")().asInstanceOf[js.Any]
    
    @scala.inline
    def request(r: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setCryptoStoreFactory(fac: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCryptoStoreFactory")(fac.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def wrapRequest(wrapper: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequest")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("matrix-js-sdk", "ContentHelpers")
  @js.native
  val ContentHelpers: js.Promise[js.Any] = js.native
  
  @scala.inline
  def createClient(opts: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createClient(opts: ICreateClientOpts): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getRequest(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")().asInstanceOf[js.Any]
  
  @scala.inline
  def request(r: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setCryptoStoreFactory(fac: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCryptoStoreFactory")(fac.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def wrapRequest(wrapper: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequest")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
