package typings.knockoutEs5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutEs5 extends StObject {
  
  def getAllObservablesForObject[T](obj: T): T = js.native
  def getAllObservablesForObject[T](obj: T, createIfNotDefined: Boolean): T = js.native
  
  def isTracked[T](obj: T, propertyName: String): Boolean = js.native
  
  def notifyWhenPresentOrFutureArrayValuesMutate[T](
    ko: KnockoutStatic,
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ js.Any
  ): Unit = js.native
}
