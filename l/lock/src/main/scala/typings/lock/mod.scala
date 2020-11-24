package typings.lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Lock(): ILock = js.native
  
  @js.native
  trait ILock extends js.Object {
    
    def apply(key: String, exec: exec): Unit = js.native
    def apply(key: js.Array[String], exec: exec): Unit = js.native
    
    def isLocked(): Boolean = js.native
  }
  
  type exec = js.Function1[/* release */ release, Unit]
  
  type release = js.Function1[/* releaseCallback */ js.UndefOr[js.Function0[Unit]], js.Function0[Unit]]
}
