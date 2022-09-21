package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  def createFromDefaultCreator(obj: Any): Any = js.native
  def createFromDefaultCreator(obj: Any, options: Any): Any = js.native
  
  def hasCollectionSignature(obj: Any): Boolean = js.native
  
  def hasModelSignature(obj: Any): Boolean = js.native
  
  def inferCreator(value: Any, factory: Factory, path: String, owner: Any, key: String): Any = js.native
  
  def optionsPathJoin(options: Any, path: String): Any = js.native
  
  def pathJoin(path1: String, path2: String): String = js.native
  
  def valueType(
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): Any = js.native
  
  def wrappedDestroy(obj: Any): Any = js.native
  
  def wrappedEventWatcher(obj: Any): Any = js.native
  def wrappedEventWatcher(obj: Any, value: Any): Any = js.native
  
  def wrappedFactory(obj: Any): Any = js.native
  def wrappedFactory(obj: Any, value: Any): Any = js.native
  
  def wrappedModel(obj: Any): Any = js.native
  def wrappedModel(obj: Any, value: Any): Any = js.native
  
  def wrappedObject(obj: Any): Any = js.native
  def wrappedObject(obj: Any, value: Any): Any = js.native
  
  def wrappedObservable(obj: Any): Any = js.native
  def wrappedObservable(obj: Any, value: Any): Any = js.native
  
  def wrappedStore(obj: Any): Any = js.native
  def wrappedStore(obj: Any, value: Any): Any = js.native
}
