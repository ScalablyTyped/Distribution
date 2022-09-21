package typings.jsreportCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentStore extends StObject {
  
  def collection(name: String): Collection
  
  def init(): js.Promise[Any]
  
  def internalCollection(name: String): Any
  
  def registerEntitySet(name: String, options: StringDictionary[Any]): Unit
  
  def registerEntityType(name: String, options: StringDictionary[Any]): Unit
}
object DocumentStore {
  
  inline def apply(
    collection: String => Collection,
    init: () => js.Promise[Any],
    internalCollection: String => Any,
    registerEntitySet: (String, StringDictionary[Any]) => Unit,
    registerEntityType: (String, StringDictionary[Any]) => Unit
  ): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), init = js.Any.fromFunction0(init), internalCollection = js.Any.fromFunction1(internalCollection), registerEntitySet = js.Any.fromFunction2(registerEntitySet), registerEntityType = js.Any.fromFunction2(registerEntityType))
    __obj.asInstanceOf[DocumentStore]
  }
  
  extension [Self <: DocumentStore](x: Self) {
    
    inline def setCollection(value: String => Collection): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setInit(value: () => js.Promise[Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInternalCollection(value: String => Any): Self = StObject.set(x, "internalCollection", js.Any.fromFunction1(value))
    
    inline def setRegisterEntitySet(value: (String, StringDictionary[Any]) => Unit): Self = StObject.set(x, "registerEntitySet", js.Any.fromFunction2(value))
    
    inline def setRegisterEntityType(value: (String, StringDictionary[Any]) => Unit): Self = StObject.set(x, "registerEntityType", js.Any.fromFunction2(value))
  }
}
