package typings.lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Lock(): ILock = ^.asInstanceOf[js.Dynamic].applyDynamic("Lock")().asInstanceOf[ILock]
  
  @js.native
  trait ILock extends StObject {
    
    def apply(key: String, exec: exec): Unit = js.native
    def apply(key: js.Array[String], exec: exec): Unit = js.native
    
    def isLocked(): Boolean = js.native
  }
  
  type exec = js.Function1[/* release */ release, Unit]
  
  type release = js.Function1[/* releaseCallback */ js.UndefOr[js.Function0[Unit]], js.Function0[Unit]]
}
