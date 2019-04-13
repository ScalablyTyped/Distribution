package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scaffold extends js.Object {
  /**
    * Get a Scaffold
    */
  def get(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def get(
    name: java.lang.String,
    fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): js.Promise[java.lang.String] = js.native
  /**
    * Remove a Scaffold
    */
  def remove(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def remove(name: java.lang.String, fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Set a Scaffold
    */
  def set(name: java.lang.String, content: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(name: java.lang.String, content: java.lang.String, fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
}

