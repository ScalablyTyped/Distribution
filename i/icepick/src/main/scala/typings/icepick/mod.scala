package typings.icepick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("icepick", "assign")
  @js.native
  def assign[T](target: T): T = js.native
  @JSImport("icepick", "assign")
  @js.native
  def assign[T, S1](target: T, source1: S1): T with S1 = js.native
  @JSImport("icepick", "assign")
  @js.native
  def assign[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  @JSImport("icepick", "assign")
  @js.native
  def assign[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  @JSImport("icepick", "assign")
  @js.native
  def assign[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  
  @JSImport("icepick", "assoc")
  @js.native
  def assoc[T](collection: T, key: String, value: js.Any): T = js.native
  @JSImport("icepick", "assoc")
  @js.native
  def assoc[T](collection: T, key: Double, value: js.Any): T = js.native
  
  @JSImport("icepick", "assocIn")
  @js.native
  def assocIn[T](collection: T, path: js.Array[Double | String], value: js.Any): T = js.native
  
  @JSImport("icepick", "chain")
  @js.native
  def chain[T](target: T): IcepickWrapper[T] = js.native
  
  @JSImport("icepick", "dissoc")
  @js.native
  def dissoc[T](collection: T, key: String): T = js.native
  @JSImport("icepick", "dissoc")
  @js.native
  def dissoc[T](collection: T, key: Double): T = js.native
  
  @JSImport("icepick", "dissocIn")
  @js.native
  def dissocIn[T](collection: T, path: js.Array[Double | String]): T = js.native
  
  @JSImport("icepick", "extend")
  @js.native
  def extend[T](target: T): T = js.native
  @JSImport("icepick", "extend")
  @js.native
  def extend[T, S1](target: T, source1: S1): T with S1 = js.native
  @JSImport("icepick", "extend")
  @js.native
  def extend[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  @JSImport("icepick", "extend")
  @js.native
  def extend[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  @JSImport("icepick", "extend")
  @js.native
  def extend[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  
  @JSImport("icepick", "filter")
  @js.native
  def filter[T](fn: js.Function1[/* value */ T, Boolean], array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("icepick", "freeze")
  @js.native
  def freeze[T](collection: T): T = js.native
  
  @JSImport("icepick", "getIn")
  @js.native
  def getIn(collection: js.Any, path: js.Array[Double | String]): js.Any = js.native
  
  @JSImport("icepick", "map")
  @js.native
  def map[T, U](fn: js.Function1[/* value */ T, U], array: js.Array[T]): js.Array[U] = js.native
  
  @JSImport("icepick", "merge")
  @js.native
  def merge[T, S1](target: T, source: S1): T with S1 = js.native
  
  @JSImport("icepick", "pop")
  @js.native
  def pop[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("icepick", "push")
  @js.native
  def push[T](array: js.Array[T], element: T): js.Array[T] = js.native
  
  @JSImport("icepick", "reverse")
  @js.native
  def reverse[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("icepick", "set")
  @js.native
  def set[T](collection: T, key: String, value: js.Any): T = js.native
  @JSImport("icepick", "set")
  @js.native
  def set[T](collection: T, key: Double, value: js.Any): T = js.native
  
  @JSImport("icepick", "setIn")
  @js.native
  def setIn[T](collection: T, path: js.Array[Double | String], value: js.Any): T = js.native
  
  @JSImport("icepick", "shift")
  @js.native
  def shift[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("icepick", "slice")
  @js.native
  def slice[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("icepick", "slice")
  @js.native
  def slice[T](array: js.Array[T], begin: js.UndefOr[scala.Nothing], end: Double): js.Array[T] = js.native
  @JSImport("icepick", "slice")
  @js.native
  def slice[T](array: js.Array[T], begin: Double): js.Array[T] = js.native
  @JSImport("icepick", "slice")
  @js.native
  def slice[T](array: js.Array[T], begin: Double, end: Double): js.Array[T] = js.native
  
  @JSImport("icepick", "sort")
  @js.native
  def sort[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("icepick", "sort")
  @js.native
  def sort[T](array: js.Array[T], compareFunction: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  @JSImport("icepick", "splice")
  @js.native
  def splice[T](array: js.Array[T], start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  
  @JSImport("icepick", "thaw")
  @js.native
  def thaw[T](collection: T): T = js.native
  
  @JSImport("icepick", "unset")
  @js.native
  def unset[T](collection: T, key: String): T = js.native
  @JSImport("icepick", "unset")
  @js.native
  def unset[T](collection: T, key: Double): T = js.native
  
  @JSImport("icepick", "unsetIn")
  @js.native
  def unsetIn[T](collection: T, path: js.Array[Double | String]): T = js.native
  
  @JSImport("icepick", "unshift")
  @js.native
  def unshift[T](array: js.Array[T], element: T): js.Array[T] = js.native
  
  @JSImport("icepick", "updateIn")
  @js.native
  def updateIn[T](collection: T, path: js.Array[Double | String], callback: js.Function1[/* value */ js.Any, _]): T = js.native
  
  @js.native
  trait IcepickWrapper[T] extends StObject {
    
    def assign[S1](source1: S1): IcepickWrapper[T with S1] = js.native
    def assign[S1, S2](s1: S1, s2: S2): IcepickWrapper[T with S1 with S2] = js.native
    def assign[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T with S1 with S2 with S3] = js.native
    def assign[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T with S1 with S2 with S3 with S4] = js.native
    
    def assoc(key: String, value: js.Any): IcepickWrapper[T] = js.native
    def assoc(key: Double, value: js.Any): IcepickWrapper[T] = js.native
    
    def assocIn(path: js.Array[Double | String], value: js.Any): IcepickWrapper[T] = js.native
    
    def dissoc(key: String): IcepickWrapper[T] = js.native
    def dissoc(key: Double): IcepickWrapper[T] = js.native
    
    def dissocIn(path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    
    def extend[S1](source1: S1): IcepickWrapper[T with S1] = js.native
    def extend[S1, S2](s1: S1, s2: S2): IcepickWrapper[T with S1 with S2] = js.native
    def extend[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T with S1 with S2 with S3] = js.native
    def extend[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T with S1 with S2 with S3 with S4] = js.native
    
    def freeze(): IcepickWrapper[T] = js.native
    
    def getIn(path: js.Array[Double | String]): IcepickWrapper[_] = js.native
    
    def merge[S1](source: S1): IcepickWrapper[T with S1] = js.native
    
    def set(key: String, value: js.Any): IcepickWrapper[T] = js.native
    def set(key: Double, value: js.Any): IcepickWrapper[T] = js.native
    
    def setIn(path: js.Array[Double | String], value: js.Any): IcepickWrapper[T] = js.native
    
    def thaw(): IcepickWrapper[T] = js.native
    
    def unset(key: String): IcepickWrapper[T] = js.native
    def unset(key: Double): IcepickWrapper[T] = js.native
    
    def unsetIn(path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    
    def updateIn(path: js.Array[Double | String], callback: js.Function1[/* value */ js.Any, _]): IcepickWrapper[T] = js.native
    
    def value(): T = js.native
  }
}
