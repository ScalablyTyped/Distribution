package typings.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectContaining[T]
  extends StObject
     with AsymmetricMatcher[T]
     with _Expected[T] {
  
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[js.Any], mismatchValues: js.Array[js.Any]): Boolean
  
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[js.Any]
    ]
  ] = js.undefined
}
object ObjectContaining {
  
  @scala.inline
  def apply[T](
    asymmetricMatch: (T, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[js.Any], js.Array[js.Any]) => Boolean
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
  
  @scala.inline
  implicit class ObjectContainingMutableBuilder[Self <: ObjectContaining[?], T] (val x: Self & ObjectContaining[T]) extends AnyVal {
    
    @scala.inline
    def setJasmineMatches(value: (js.Any, js.Array[js.Any], js.Array[js.Any]) => Boolean): Self = StObject.set(x, "jasmineMatches", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNew(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[js.Any]
    ): Self = StObject.set(x, "new", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
  }
}
