package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDbMethodsCore extends js.Object {
  def clear(): stdLib.Promise[scala.Unit] = js.native
  def clear(callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  def getItem[T](key: java.lang.String): stdLib.Promise[T] = js.native
  def getItem[T](key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* value */ T, scala.Unit]): stdLib.Promise[T] = js.native
  def iterate[T, U](
    iteratee: js.Function3[/* value */ T, /* key */ java.lang.String, /* iterationNumber */ scala.Double, U]
  ): stdLib.Promise[U] = js.native
  def iterate[T, U](
    iteratee: js.Function3[/* value */ T, /* key */ java.lang.String, /* iterationNumber */ scala.Double, U],
    callback: js.Function2[/* err */ js.Any, /* result */ U, scala.Unit]
  ): stdLib.Promise[U] = js.native
  def key(keyIndex: scala.Double): stdLib.Promise[java.lang.String] = js.native
  def key(
    keyIndex: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* key */ java.lang.String, scala.Unit]
  ): stdLib.Promise[java.lang.String] = js.native
  def keys(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def keys(callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[java.lang.String], scala.Unit]): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def length(): stdLib.Promise[scala.Double] = js.native
  def length(callback: js.Function2[/* err */ js.Any, /* numberOfKeys */ scala.Double, scala.Unit]): stdLib.Promise[scala.Double] = js.native
  def removeItem(key: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def removeItem(key: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  def setItem[T](key: java.lang.String, value: T): stdLib.Promise[T] = js.native
  def setItem[T](
    key: java.lang.String,
    value: T,
    callback: js.Function2[/* err */ js.Any, /* value */ T, scala.Unit]
  ): stdLib.Promise[T] = js.native
}

