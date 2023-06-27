package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  var bindings: StringDictionary[Expression_]
  
  def concat(bindings: js.Array[js.Tuple2[String, Expression_]]): Scope
  
  def get(name: String): Expression_
  
  def has(name: String): Boolean
  
  var parent: Scope
}
object Scope {
  
  inline def apply(
    bindings: StringDictionary[Expression_],
    concat: js.Array[js.Tuple2[String, Expression_]] => Scope,
    get: String => Expression_,
    has: String => Boolean,
    parent: Scope
  ): Scope = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: StringDictionary[Expression_]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setConcat(value: js.Array[js.Tuple2[String, Expression_]] => Scope): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Expression_): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setParent(value: Scope): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
