package typings.matrixJsSdk

import typings.matrixJsSdk.matrixMod.ICreateClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ContentHelpers: js.Promise[js.Any] = js.native
  
  def createClient(opts: String): js.Any = js.native
  def createClient(opts: ICreateClientOpts): js.Any = js.native
  
  def getRequest(): js.Any = js.native
  
  def request(r: js.Any): Unit = js.native
  
  def setCryptoStoreFactory(fac: js.Any): Unit = js.native
  
  def wrapRequest(wrapper: js.Any): Unit = js.native
  
  @js.native
  object default extends js.Object {
    
    val ContentHelpers: js.Promise[js.Any] = js.native
    
    def createClient(opts: String): js.Any = js.native
    def createClient(opts: ICreateClientOpts): js.Any = js.native
    
    def getRequest(): js.Any = js.native
    
    def request(r: js.Any): Unit = js.native
    
    def setCryptoStoreFactory(fac: js.Any): Unit = js.native
    
    def wrapRequest(wrapper: js.Any): Unit = js.native
  }
}
