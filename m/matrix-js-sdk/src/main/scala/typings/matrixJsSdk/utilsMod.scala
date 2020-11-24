package typings.matrixJsSdk

import typings.matrixJsSdk.anon.Promise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def checkObjectHasKeys(obj: js.Object, keys_ : js.Array[String]): Unit = js.native
  
  def checkObjectHasNoAdditionalKeys(obj: js.Object, allowedKeys: js.Array[String]): Unit = js.native
  
  def deepCompare(x: js.Any, y: js.Any): Boolean = js.native
  
  def deepCopy[T](obj: T): T = js.native
  
  def defer(): Promise = js.native
  
  def encodeParams(params: Record[String, String]): String = js.native
  
  def encodeUri(pathTemplate: String, variables: Record[String, String]): String = js.native
  
  def ensureNoTrailingSlash(url: String): String = js.native
  
  def escapeRegExp(string: String): String = js.native
  
  def extend(restParams: js.Any*): js.Any = js.native
  
  def filter[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = js.native
  
  def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): T = js.native
  def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): T = js.native
  
  def forEach[T](array: js.Array[T], fn: js.Function2[/* t */ T, /* i */ Double, Unit]): Unit = js.native
  
  def getCrypto(): js.Object = js.native
  
  def globToRegexp(glob: String, extended: js.Any): String = js.native
  
  def inherits(ctor: js.Function, superCtor: js.Function): Unit = js.native
  
  def isArray(value: js.Any): Boolean = js.native
  
  def isFunction(value: js.Any): Boolean = js.native
  
  def isNullOrUndefined(`val`: js.Any): Boolean = js.native
  
  def isNumber(value: js.Any): Boolean = js.native
  
  def keys(obj: js.Object): js.Array[String] = js.native
  
  def map[T, S](array: js.Array[T], fn: js.Function1[/* t */ T, S]): js.Array[S] = js.native
  
  def polyfillSuper(thisArg: js.Any, SuperType: js.Any, params: js.Any*): Unit = js.native
  
  def promiseMapSeries[T](promises: js.Array[js.Promise[T]], fn: js.Function1[/* t */ T, Unit]): js.Promise[Unit] = js.native
  
  def promiseTry[T](fn: js.Function0[T]): js.Promise[T] = js.native
  
  def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Any = js.native
  def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): js.Any = js.native
  
  def removeHiddenChars(str: String): String = js.native
  
  def runPolyfills(): Unit = js.native
  
  def setCrypto(c: js.Object): Unit = js.native
  
  def sleep[T](ms: Double, value: T): js.Promise[T] = js.native
  
  def values[T](obj: Record[String, T]): js.Array[T] = js.native
}
