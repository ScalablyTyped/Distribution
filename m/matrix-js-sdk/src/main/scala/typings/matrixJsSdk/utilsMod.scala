package typings.matrixJsSdk

import typings.matrixJsSdk.anon.Promise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("matrix-js-sdk/lib/utils", "checkObjectHasKeys")
  @js.native
  def checkObjectHasKeys(obj: js.Object, keys_ : js.Array[String]): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "checkObjectHasNoAdditionalKeys")
  @js.native
  def checkObjectHasNoAdditionalKeys(obj: js.Object, allowedKeys: js.Array[String]): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "deepCompare")
  @js.native
  def deepCompare(x: js.Any, y: js.Any): Boolean = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "deepCopy")
  @js.native
  def deepCopy[T](obj: T): T = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "defer")
  @js.native
  def defer(): Promise = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "encodeParams")
  @js.native
  def encodeParams(params: Record[String, String]): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "encodeUri")
  @js.native
  def encodeUri(pathTemplate: String, variables: Record[String, String]): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "ensureNoTrailingSlash")
  @js.native
  def ensureNoTrailingSlash(url: String): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "escapeRegExp")
  @js.native
  def escapeRegExp(string: String): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "extend")
  @js.native
  def extend(restParams: js.Any*): js.Any = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "filter")
  @js.native
  def filter[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "findElement")
  @js.native
  def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): T = js.native
  @JSImport("matrix-js-sdk/lib/utils", "findElement")
  @js.native
  def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): T = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "forEach")
  @js.native
  def forEach[T](array: js.Array[T], fn: js.Function2[/* t */ T, /* i */ Double, Unit]): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "getCrypto")
  @js.native
  def getCrypto(): js.Object = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "globToRegexp")
  @js.native
  def globToRegexp(glob: String, extended: js.Any): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "inherits")
  @js.native
  def inherits(ctor: js.Function, superCtor: js.Function): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "isArray")
  @js.native
  def isArray(value: js.Any): Boolean = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "isFunction")
  @js.native
  def isFunction(value: js.Any): Boolean = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(`val`: js.Any): Boolean = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "isNumber")
  @js.native
  def isNumber(value: js.Any): Boolean = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "keys")
  @js.native
  def keys(obj: js.Object): js.Array[String] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "map")
  @js.native
  def map[T, S](array: js.Array[T], fn: js.Function1[/* t */ T, S]): js.Array[S] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "polyfillSuper")
  @js.native
  def polyfillSuper(thisArg: js.Any, SuperType: js.Any, params: js.Any*): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "promiseMapSeries")
  @js.native
  def promiseMapSeries[T](promises: js.Array[js.Promise[T]], fn: js.Function1[/* t */ T, Unit]): js.Promise[Unit] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "promiseTry")
  @js.native
  def promiseTry[T](fn: js.Function0[T]): js.Promise[T] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "removeElement")
  @js.native
  def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Any = js.native
  @JSImport("matrix-js-sdk/lib/utils", "removeElement")
  @js.native
  def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): js.Any = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "removeHiddenChars")
  @js.native
  def removeHiddenChars(str: String): String = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "runPolyfills")
  @js.native
  def runPolyfills(): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "setCrypto")
  @js.native
  def setCrypto(c: js.Object): Unit = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "sleep")
  @js.native
  def sleep[T](ms: Double, value: T): js.Promise[T] = js.native
  
  @JSImport("matrix-js-sdk/lib/utils", "values")
  @js.native
  def values[T](obj: Record[String, T]): js.Array[T] = js.native
}
