package typings.jupyterlabStatedb

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ids[V, T] extends StObject {
    
    var ids: js.Array[V]
    
    var values: js.Array[T]
  }
  object Ids {
    
    inline def apply[V, T](ids: js.Array[V], values: js.Array[T]): Ids[V, T] = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids[V, T]]
    }
    
    extension [Self <: Ids[?, ?], V, T](x: Self & (Ids[V, T])) {
      
      inline def setIds(value: js.Array[V]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: V*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait IdsValues extends StObject {
    
    var ids: js.Array[String]
    
    var values: js.Array[String]
  }
  object IdsValues {
    
    inline def apply(ids: js.Array[String], values: js.Array[String]): IdsValues = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdsValues]
    }
    
    extension [Self <: IdsValues](x: Self) {
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait Values[T /* <: ReadonlyPartialJSONValue */] extends StObject {
    
    var ids: js.Array[String]
    
    var values: js.Array[T]
  }
  object Values {
    
    inline def apply[T /* <: ReadonlyPartialJSONValue */](ids: js.Array[String], values: js.Array[T]): Values[T] = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values[T]]
    }
    
    extension [Self <: Values[?], T /* <: ReadonlyPartialJSONValue */](x: Self & Values[T]) {
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
