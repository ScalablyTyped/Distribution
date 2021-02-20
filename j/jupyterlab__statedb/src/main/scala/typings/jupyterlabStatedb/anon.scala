package typings.jupyterlabStatedb

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ids[V, T] extends StObject {
    
    var ids: js.Array[V] = js.native
    
    var values: js.Array[T] = js.native
  }
  object Ids {
    
    @scala.inline
    def apply[V, T](ids: js.Array[V], values: js.Array[T]): Ids[V, T] = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids[V, T]]
    }
    
    @scala.inline
    implicit class IdsMutableBuilder[Self <: Ids[_, _], V, T] (val x: Self with (Ids[V, T])) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[V]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: V*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IdsValues extends StObject {
    
    var ids: js.Array[String] = js.native
    
    var values: js.Array[String] = js.native
  }
  object IdsValues {
    
    @scala.inline
    def apply(ids: js.Array[String], values: js.Array[String]): IdsValues = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdsValues]
    }
    
    @scala.inline
    implicit class IdsValuesMutableBuilder[Self <: IdsValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Values[T /* <: ReadonlyPartialJSONValue */] extends StObject {
    
    var ids: js.Array[String] = js.native
    
    var values: js.Array[T] = js.native
  }
  object Values {
    
    @scala.inline
    def apply[T /* <: ReadonlyPartialJSONValue */](ids: js.Array[String], values: js.Array[T]): Values[T] = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values[T]]
    }
    
    @scala.inline
    implicit class ValuesMutableBuilder[Self <: Values[_], T /* <: ReadonlyPartialJSONValue */] (val x: Self with Values[T]) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
