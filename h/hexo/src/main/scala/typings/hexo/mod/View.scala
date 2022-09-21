package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  val path: String = js.native
  
  /**
    * Remove a View
    */
  def render(): js.Promise[String] = js.native
  def render(fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[Any] = js.native
  def render(options: Any): js.Promise[String] = js.native
  def render(options: Any, fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(options: Unit, fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[String] = js.native
  
  /**
    * Remove a View synchronously.
    */
  def renderSync(): String = js.native
  def renderSync(options: Any): String = js.native
  
  val source: String = js.native
}
