package typings.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectContaining[T]
  extends AsymmetricMatcher[T]
     with _Expected[T] {
  
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
  
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
    ]
  ] = js.native
}
object ObjectContaining {
  
  @scala.inline
  def apply[T](
    asymmetricMatch: (T, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
  
  @scala.inline
  implicit class ObjectContainingMutableBuilder[Self <: ObjectContaining[_], T] (val x: Self with ObjectContaining[T]) extends AnyVal {
    
    @scala.inline
    def setJasmineMatches(value: (js.Any, js.Array[_], js.Array[_]) => Boolean): Self = StObject.set(x, "jasmineMatches", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNew(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
    ): Self = StObject.set(x, "new", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
  }
}
