package typings.immutabilityHelper

import org.scalablytyped.runtime.StringDictionary
import typings.immutabilityHelper.anon.NoInferenceCustomCommandsBrand
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("immutability-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, C /* <: CustomCommands[js.Object] */](`object`: T, $spec: Spec[T, C]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], $spec.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("immutability-helper", "Context")
  @js.native
  open class Context () extends StObject {
    
    /* private */ var commands: Any = js.native
    
    def extend[T](directive: String, fn: js.Function2[/* param */ Any, /* old */ T, T]): Unit = js.native
    
    def isEquals: js.Function2[/* x */ Any, /* y */ Any, Boolean] = js.native
    def isEquals_=(value: js.Function2[/* x */ Any, /* y */ Any, Boolean]): Unit = js.native
    
    def update[T, C /* <: CustomCommands[js.Object] */](`object`: T, $spec: Spec[T, C]): T = js.native
  }
  
  inline def extend[T](directive: String, fn: js.Function2[/* param */ Any, /* old */ T, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(directive.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def invariant(condition: Boolean, message: js.Function0[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("immutability-helper", "isEquals")
  @js.native
  val isEquals: Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityHelper.anon.Push[T]
    - typings.immutabilityHelper.anon.Unshift[T]
    - typings.immutabilityHelper.anon.Splice[T]
    - org.scalablytyped.runtime.StringDictionary[typings.immutabilityHelper.mod.Spec[T, C]]
  */
  type ArraySpec[T, C /* <: CustomCommands[js.Object] */] = (_ArraySpec[T, C]) | (StringDictionary[Spec[T, C]])
  
  type CustomCommands[T] = T & NoInferenceCustomCommandsBrand
  
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityHelper.anon.Add[K, V]
    - typings.immutabilityHelper.anon.Remove[K]
    - org.scalablytyped.runtime.StringDictionary[typings.immutabilityHelper.mod.Spec[V, C]]
  */
  type MapSpec[K, V, C /* <: CustomCommands[js.Object] */] = (_MapSpec[K, V, C]) | (StringDictionary[Spec[V, C]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityHelper.anon.Toggle[T]
    - typings.immutabilityHelper.anon.Unset[T]
    - typings.immutabilityHelper.anon.Merge[T]
    - / * import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>} * / js.Any
  */
  type ObjectSpec[T, C /* <: CustomCommands[js.Object] */] = (_ObjectSpec[T, C]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>} */ js.Any)
  
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityHelper.anon.AddReadonlyArray[T]
    - typings.immutabilityHelper.anon.RemoveReadonlyArray[T]
  */
  trait SetSpec[T] extends StObject
  object SetSpec {
    
    inline def AddReadonlyArray[T]($add: js.Array[T]): typings.immutabilityHelper.anon.AddReadonlyArray[T] = {
      val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.AddReadonlyArray[T]]
    }
    
    inline def RemoveReadonlyArray[T]($remove: js.Array[T]): typings.immutabilityHelper.anon.RemoveReadonlyArray[T] = {
      val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.RemoveReadonlyArray[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - / * import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> | std.ReadonlyArray<infer U> ? immutability-helper.immutability-helper.ArraySpec<U, C> : T extends std.Map<infer K, infer V> | std.ReadonlyMap<infer K, infer V> ? immutability-helper.immutability-helper.MapSpec<K, V, C> : T extends std.Set<infer X> | std.ReadonlySet<infer X> ? immutability-helper.immutability-helper.SetSpec<X> : T extends object ? immutability-helper.immutability-helper.ObjectSpec<T, C> : never * / js.Any
    - typings.immutabilityHelper.anon.Set[T]
    - typings.immutabilityHelper.anon.Apply[T]
    - js.Function1[/ * v * / T, T]
  */
  type Spec[T, C /* <: CustomCommands[js.Object] */] = (_Spec[T, C]) | (js.Function1[/* v */ T, T]) | (/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> | std.ReadonlyArray<infer U> ? immutability-helper.immutability-helper.ArraySpec<U, C> : T extends std.Map<infer K, infer V> | std.ReadonlyMap<infer K, infer V> ? immutability-helper.immutability-helper.MapSpec<K, V, C> : T extends std.Set<infer X> | std.ReadonlySet<infer X> ? immutability-helper.immutability-helper.SetSpec<X> : T extends object ? immutability-helper.immutability-helper.ObjectSpec<T, C> : never */ js.Any)
  
  trait _ArraySpec[T, C /* <: CustomCommands[js.Object] */] extends StObject
  object _ArraySpec {
    
    inline def Push[T]($push: js.Array[T]): typings.immutabilityHelper.anon.Push[T] = {
      val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Push[T]]
    }
    
    inline def Splice[T]($splice: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]): typings.immutabilityHelper.anon.Splice[T] = {
      val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Splice[T]]
    }
    
    inline def Unshift[T]($unshift: js.Array[T]): typings.immutabilityHelper.anon.Unshift[T] = {
      val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Unshift[T]]
    }
  }
  
  trait _MapSpec[K, V, C /* <: CustomCommands[js.Object] */] extends StObject
  object _MapSpec {
    
    inline def Add[K, V]($add: js.Array[js.Tuple2[K, V]]): typings.immutabilityHelper.anon.Add[K, V] = {
      val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Add[K, V]]
    }
    
    inline def Remove[K]($remove: js.Array[K]): typings.immutabilityHelper.anon.Remove[K] = {
      val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Remove[K]]
    }
  }
  
  trait _ObjectSpec[T, C /* <: CustomCommands[js.Object] */] extends StObject
  object _ObjectSpec {
    
    inline def Merge[T]($merge: Partial[T]): typings.immutabilityHelper.anon.Merge[T] = {
      val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Merge[T]]
    }
    
    inline def Toggle[T]($toggle: js.Array[/* keyof T */ String]): typings.immutabilityHelper.anon.Toggle[T] = {
      val __obj = js.Dynamic.literal($toggle = $toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Toggle[T]]
    }
    
    inline def Unset[T]($unset: js.Array[/* keyof T */ String]): typings.immutabilityHelper.anon.Unset[T] = {
      val __obj = js.Dynamic.literal($unset = $unset.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Unset[T]]
    }
  }
  
  trait _Spec[T, C /* <: CustomCommands[js.Object] */] extends StObject
  object _Spec {
    
    inline def Apply[T]($apply: T => T): typings.immutabilityHelper.anon.Apply[T] = {
      val __obj = js.Dynamic.literal($apply = js.Any.fromFunction1($apply))
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Apply[T]]
    }
    
    inline def Set[T]($set: T): typings.immutabilityHelper.anon.Set[T] = {
      val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.immutabilityHelper.anon.Set[T]]
    }
  }
}
