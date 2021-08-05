package typings.matrixJsSdk

import typings.matrixJsSdk.anon.Promise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("matrix-js-sdk/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkObjectHasKeys(obj: js.Object, keys_ : js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkObjectHasKeys")(obj.asInstanceOf[js.Any], keys_.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkObjectHasNoAdditionalKeys(obj: js.Object, allowedKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkObjectHasNoAdditionalKeys")(obj.asInstanceOf[js.Any], allowedKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepCompare(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepCopy[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defer(): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Promise]
  
  inline def encodeParams(params: Record[String, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParams")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUri(pathTemplate: String, variables: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeUri")(pathTemplate.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ensureNoTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureNoTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeRegExp(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extend(restParams: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(restParams.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def filter[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def findElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def forEach[T](array: js.Array[T], fn: js.Function2[/* t */ T, /* i */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCrypto(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getCrypto")().asInstanceOf[js.Object]
  
  inline def globToRegexp(glob: String, extended: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("globToRegexp")(glob.asInstanceOf[js.Any], extended.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inherits(ctor: js.Function, superCtor: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(ctor.asInstanceOf[js.Any], superCtor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndefined(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(obj: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def map[T, S](array: js.Array[T], fn: js.Function1[/* t */ T, S]): js.Array[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[S]]
  
  inline def polyfillSuper(thisArg: js.Any, SuperType: js.Any, params: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("polyfillSuper")(thisArg.asInstanceOf[js.Any], SuperType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promiseMapSeries[T](promises: js.Array[js.Promise[T]], fn: js.Function1[/* t */ T, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseMapSeries")(promises.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def promiseTry[T](fn: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseTry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def removeElement[T](
    array: js.Array[T],
    fn: js.Function3[/* t */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean],
    reverse: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def removeHiddenChars(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHiddenChars")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def runPolyfills(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runPolyfills")().asInstanceOf[Unit]
  
  inline def setCrypto(c: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCrypto")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sleep[T](ms: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def values[T](obj: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
