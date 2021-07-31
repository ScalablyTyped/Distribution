package typings.jest.mod.jest

import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof jest.jest.jest.Expect ]: jest.jest.jest.Expect[K]} */
trait ExpectProperties extends StObject {
  
  var addSnapshotSerializer: js.Function1[/* serializer */ SnapshotSerializerPlugin, Unit]
  
  var any: js.Function1[/* classType */ js.Any, js.Any]
  
  var anything: js.Function0[js.Any]
  
  var arrayContaining: js.Function1[/* arr */ js.Array[js.Any], js.Any]
  
  var assertions: js.Function1[/* num */ Double, Unit]
  
  var extend: js.Function1[/* obj */ ExpectExtendMap, Unit]
  
  var getState: js.Function0[MatcherState & (Record[String, js.Any])]
  
  var hasAssertions: js.Function0[Unit]
  
  var not: InverseAsymmetricMatchers
  
  var objectContaining: js.Function1[/* obj */ js.Object, js.Any]
  
  var setState: js.Function1[/* state */ js.Object, Unit]
  
  var stringContaining: js.Function1[/* str */ String, js.Any]
  
  var stringMatching: js.Function1[/* str */ String | RegExp, js.Any]
}
object ExpectProperties {
  
  @scala.inline
  def apply(
    addSnapshotSerializer: /* serializer */ SnapshotSerializerPlugin => Unit,
    any: /* classType */ js.Any => js.Any,
    anything: () => js.Any,
    arrayContaining: /* arr */ js.Array[js.Any] => js.Any,
    assertions: /* num */ Double => Unit,
    extend: /* obj */ ExpectExtendMap => Unit,
    getState: () => MatcherState & (Record[String, js.Any]),
    hasAssertions: () => Unit,
    not: InverseAsymmetricMatchers,
    objectContaining: /* obj */ js.Object => js.Any,
    setState: /* state */ js.Object => Unit,
    stringContaining: /* str */ String => js.Any,
    stringMatching: /* str */ String | RegExp => js.Any
  ): ExpectProperties = {
    val __obj = js.Dynamic.literal(addSnapshotSerializer = js.Any.fromFunction1(addSnapshotSerializer), any = js.Any.fromFunction1(any), anything = js.Any.fromFunction0(anything), arrayContaining = js.Any.fromFunction1(arrayContaining), assertions = js.Any.fromFunction1(assertions), extend = js.Any.fromFunction1(extend), getState = js.Any.fromFunction0(getState), hasAssertions = js.Any.fromFunction0(hasAssertions), not = not.asInstanceOf[js.Any], objectContaining = js.Any.fromFunction1(objectContaining), setState = js.Any.fromFunction1(setState), stringContaining = js.Any.fromFunction1(stringContaining), stringMatching = js.Any.fromFunction1(stringMatching))
    __obj.asInstanceOf[ExpectProperties]
  }
  
  @scala.inline
  implicit class ExpectPropertiesMutableBuilder[Self <: ExpectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSnapshotSerializer(value: /* serializer */ SnapshotSerializerPlugin => Unit): Self = StObject.set(x, "addSnapshotSerializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAny(value: /* classType */ js.Any => js.Any): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnything(value: () => js.Any): Self = StObject.set(x, "anything", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArrayContaining(value: /* arr */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "arrayContaining", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssertions(value: /* num */ Double => Unit): Self = StObject.set(x, "assertions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: /* obj */ ExpectExtendMap => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => MatcherState & (Record[String, js.Any])): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAssertions(value: () => Unit): Self = StObject.set(x, "hasAssertions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNot(value: InverseAsymmetricMatchers): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectContaining(value: /* obj */ js.Object => js.Any): Self = StObject.set(x, "objectContaining", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetState(value: /* state */ js.Object => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringContaining(value: /* str */ String => js.Any): Self = StObject.set(x, "stringContaining", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringMatching(value: /* str */ String | RegExp => js.Any): Self = StObject.set(x, "stringMatching", js.Any.fromFunction1(value))
  }
}
