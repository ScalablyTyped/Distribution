package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scaffold extends StObject {
  
  /**
    * Get a Scaffold
    */
  def get(name: String): js.Promise[String] = js.native
  def get(name: String, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  
  /**
    * Remove a Scaffold
    */
  def remove(name: String): js.Promise[Unit] = js.native
  def remove(name: String, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Set a Scaffold
    */
  def set(name: String, content: String): js.Promise[Unit] = js.native
  def set(name: String, content: String, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
}
