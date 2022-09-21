package typings.icepick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("icepick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def assign[T, S1](target: T, source1: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def assign[T, S1, S2](target: T, s1: S1, s2: S2): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def assign[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def assign[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def assoc[T](collection: T, key: String, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assoc")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assoc[T](collection: T, key: Double, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assoc")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def assocIn[T](collection: T, path: js.Array[Double | String], value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assocIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def chain[T](target: T): IcepickWrapper[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(target.asInstanceOf[js.Any]).asInstanceOf[IcepickWrapper[T]]
  
  inline def dissoc[T](collection: T, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dissoc")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dissoc[T](collection: T, key: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dissoc")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def dissocIn[T](collection: T, path: js.Array[Double | String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dissocIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def extend[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def extend[T, S1](target: T, source1: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def extend[T, S1, S2](target: T, s1: S1, s2: S2): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def extend[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def extend[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], s3.asInstanceOf[js.Any], s4.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def filter[T](fn: js.Function1[/* value */ T, Boolean], array: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(fn.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def freeze[T](collection: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(collection.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getIn(collection: Any, path: js.Array[Double | String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def map[T, U](fn: js.Function1[/* value */ T, U], array: js.Array[T]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(fn.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def merge[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def pop[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def push[T](array: js.Array[T], element: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def reverse[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def set[T](collection: T, key: String, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def set[T](collection: T, key: Double, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setIn[T](collection: T, path: js.Array[Double | String], value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def shift[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def slice[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def slice[T](array: js.Array[T], begin: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def slice[T](array: js.Array[T], begin: Double, end: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def slice[T](array: js.Array[T], begin: Unit, end: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def sort[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def sort[T](array: js.Array[T], compareFunction: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compareFunction.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def splice[T](array: js.Array[T], start: Double, deleteCount: Double, items: T*): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[T]]
  
  inline def thaw[T](collection: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("thaw")(collection.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def unset[T](collection: T, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unset[T](collection: T, key: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unset")(collection.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unsetIn[T](collection: T, path: js.Array[Double | String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unshift[T](array: js.Array[T], element: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def updateIn[T](collection: T, path: js.Array[Double | String], callback: js.Function1[/* value */ Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(collection.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @js.native
  trait IcepickWrapper[T] extends StObject {
    
    def assign[S1](source1: S1): IcepickWrapper[T & S1] = js.native
    def assign[S1, S2](s1: S1, s2: S2): IcepickWrapper[T & S1 & S2] = js.native
    def assign[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T & S1 & S2 & S3] = js.native
    def assign[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T & S1 & S2 & S3 & S4] = js.native
    
    def assoc(key: String, value: Any): IcepickWrapper[T] = js.native
    def assoc(key: Double, value: Any): IcepickWrapper[T] = js.native
    
    def assocIn(path: js.Array[Double | String], value: Any): IcepickWrapper[T] = js.native
    
    def dissoc(key: String): IcepickWrapper[T] = js.native
    def dissoc(key: Double): IcepickWrapper[T] = js.native
    
    def dissocIn(path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    
    def extend[S1](source1: S1): IcepickWrapper[T & S1] = js.native
    def extend[S1, S2](s1: S1, s2: S2): IcepickWrapper[T & S1 & S2] = js.native
    def extend[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T & S1 & S2 & S3] = js.native
    def extend[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T & S1 & S2 & S3 & S4] = js.native
    
    def freeze(): IcepickWrapper[T] = js.native
    
    def getIn(path: js.Array[Double | String]): IcepickWrapper[Any] = js.native
    
    def merge[S1](source: S1): IcepickWrapper[T & S1] = js.native
    
    def set(key: String, value: Any): IcepickWrapper[T] = js.native
    def set(key: Double, value: Any): IcepickWrapper[T] = js.native
    
    def setIn(path: js.Array[Double | String], value: Any): IcepickWrapper[T] = js.native
    
    def thaw(): IcepickWrapper[T] = js.native
    
    def unset(key: String): IcepickWrapper[T] = js.native
    def unset(key: Double): IcepickWrapper[T] = js.native
    
    def unsetIn(path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    
    def updateIn(path: js.Array[Double | String], callback: js.Function1[/* value */ Any, Any]): IcepickWrapper[T] = js.native
    
    def value(): T = js.native
  }
}
