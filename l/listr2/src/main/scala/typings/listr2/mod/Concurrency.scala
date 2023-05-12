package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "Concurrency")
@js.native
open class Concurrency protected () extends StObject {
  def this(options: typings.listr2.anon.Concurrency) = this()
  
  def add[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  
  /* private */ var concurrency: Any = js.native
  
  /* private */ var count: Any = js.native
  
  /* private */ var flush: Any = js.native
  
  /* private */ var queue: Any = js.native
  
  /* private */ var run: Any = js.native
}
