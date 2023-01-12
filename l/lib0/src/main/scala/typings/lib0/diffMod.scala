package typings.lib0

import typings.lib0.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("lib0/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simpleDiff(a: String, b: String): SimpleDiff_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[String]]
  
  inline def simpleDiffArray[T](a: js.Array[T], b: js.Array[T]): SimpleDiff_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[js.Array[T]]]
  inline def simpleDiffArray[T](a: js.Array[T], b: js.Array[T], compare: js.Function2[/* arg0 */ T, /* arg1 */ T, Boolean]): SimpleDiff_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[js.Array[T]]]
  
  inline def simpleDiffString(a: String, b: String): SimpleDiff_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[SimpleDiff_[String]]
  
  inline def simpleDiffStringWithCursor(a: String, b: String, cursor: Double): Index = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDiffStringWithCursor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Index]
  
  trait SimpleDiff_[T] extends StObject {
    
    /**
      * The index where changes were applied
      */
    var index: Double
    
    /**
      * The new text to insert at `index` after applying
      *      `delete`
      */
    var insert: T
    
    /**
      * The number of characters to delete starting
      *        at `index`.
      */
    var remove: Double
  }
  object SimpleDiff_ {
    
    inline def apply[T](index: Double, insert: T, remove: Double): SimpleDiff_[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleDiff_[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleDiff_[?], T] (val x: Self & SimpleDiff_[T]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: T): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Double): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
}
