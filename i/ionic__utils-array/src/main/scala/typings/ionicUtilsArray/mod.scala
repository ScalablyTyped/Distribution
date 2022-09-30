package typings.ionicUtilsArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concurrentFilter[T](array: js.Array[T], callback: js.Function1[/* currentValue */ T, js.Promise[Boolean]]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concurrentFilter")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def conform[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("conform")().asInstanceOf[js.Array[T]]
  inline def conform[T](t: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("conform")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def conform[T](t: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("conform")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def filter[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def map[T, U](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[U]
    ]
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  
  inline def move[T](array: js.Array[T], fromIndex: Double, toIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def reduce[T](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def reduce[T](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[T]
    ],
    initialValue: T
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def reduce_TR[T, R](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ R, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[R]
    ]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def reduce_TU[T, U](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      js.Promise[U]
    ],
    initialValue: U
  ): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  inline def replace[T](array: js.Array[T], index: Double, item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def splice[T](array: js.Array[T], start: Double, deleteCount: Double, items: T*): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[T]]
  inline def splice[T](array: js.Array[T], start: Double, deleteCount: Unit, items: T*): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[T]]
}
