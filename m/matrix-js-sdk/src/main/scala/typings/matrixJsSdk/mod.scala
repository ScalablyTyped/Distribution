package typings.matrixJsSdk

import typings.matrixJsSdk.matrixMod.ICreateClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("matrix-js-sdk", "default.ContentHelpers")
    @js.native
    val ContentHelpers: js.Promise[js.Any] = js.native
    
    @JSImport("matrix-js-sdk", "default.createClient")
    @js.native
    def createClient(opts: String): js.Any = js.native
    @JSImport("matrix-js-sdk", "default.createClient")
    @js.native
    def createClient(opts: ICreateClientOpts): js.Any = js.native
    
    @JSImport("matrix-js-sdk", "default.getRequest")
    @js.native
    def getRequest(): js.Any = js.native
    
    @JSImport("matrix-js-sdk", "default.request")
    @js.native
    def request(r: js.Any): Unit = js.native
    
    @JSImport("matrix-js-sdk", "default.setCryptoStoreFactory")
    @js.native
    def setCryptoStoreFactory(fac: js.Any): Unit = js.native
    
    @JSImport("matrix-js-sdk", "default.wrapRequest")
    @js.native
    def wrapRequest(wrapper: js.Any): Unit = js.native
  }
  
  @JSImport("matrix-js-sdk", "ContentHelpers")
  @js.native
  val ContentHelpers: js.Promise[js.Any] = js.native
  
  @JSImport("matrix-js-sdk", "createClient")
  @js.native
  def createClient(opts: String): js.Any = js.native
  @JSImport("matrix-js-sdk", "createClient")
  @js.native
  def createClient(opts: ICreateClientOpts): js.Any = js.native
  
  @JSImport("matrix-js-sdk", "getRequest")
  @js.native
  def getRequest(): js.Any = js.native
  
  @JSImport("matrix-js-sdk", "request")
  @js.native
  def request(r: js.Any): Unit = js.native
  
  @JSImport("matrix-js-sdk", "setCryptoStoreFactory")
  @js.native
  def setCryptoStoreFactory(fac: js.Any): Unit = js.native
  
  @JSImport("matrix-js-sdk", "wrapRequest")
  @js.native
  def wrapRequest(wrapper: js.Any): Unit = js.native
}
