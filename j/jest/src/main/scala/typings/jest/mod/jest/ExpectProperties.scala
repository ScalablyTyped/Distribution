package typings.jest.mod.jest

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof jest.jest.jest.Expect ]: jest.jest.jest.Expect[K]} */
trait ExpectProperties extends js.Object {
  var addSnapshotSerializer: js.Function1[/* serializer */ SnapshotSerializerPlugin, Unit]
  var any: js.Function1[/* classType */ js.Any, _]
  var anything: js.Function0[_]
  var arrayContaining: js.Function1[/* arr */ js.Array[_], _]
  var assertions: js.Function1[/* num */ Double, Unit]
  var extend: js.Function1[/* obj */ ExpectExtendMap, Unit]
  var getState: js.Function0[MatcherState with (Record[String, _])]
  var hasAssertions: js.Function0[Unit]
  var not: InverseAsymmetricMatchers
  var objectContaining: js.Function1[/* obj */ js.Object, _]
  var setState: js.Function1[/* state */ js.Object, Unit]
  var stringContaining: js.Function1[/* str */ String, _]
  var stringMatching: js.Function1[/* str */ String | RegExp, _]
}

object ExpectProperties {
  @scala.inline
  def apply(
    addSnapshotSerializer: /* serializer */ SnapshotSerializerPlugin => Unit,
    any: /* classType */ js.Any => _,
    anything: () => _,
    arrayContaining: /* arr */ js.Array[_] => _,
    assertions: /* num */ Double => Unit,
    extend: /* obj */ ExpectExtendMap => Unit,
    getState: () => MatcherState with (Record[String, _]),
    hasAssertions: () => Unit,
    not: InverseAsymmetricMatchers,
    objectContaining: /* obj */ js.Object => _,
    setState: /* state */ js.Object => Unit,
    stringContaining: /* str */ String => _,
    stringMatching: /* str */ String | RegExp => _
  ): ExpectProperties = {
    val __obj = js.Dynamic.literal(addSnapshotSerializer = js.Any.fromFunction1(addSnapshotSerializer), any = js.Any.fromFunction1(any), anything = js.Any.fromFunction0(anything), arrayContaining = js.Any.fromFunction1(arrayContaining), assertions = js.Any.fromFunction1(assertions), extend = js.Any.fromFunction1(extend), getState = js.Any.fromFunction0(getState), hasAssertions = js.Any.fromFunction0(hasAssertions), not = not.asInstanceOf[js.Any], objectContaining = js.Any.fromFunction1(objectContaining), setState = js.Any.fromFunction1(setState), stringContaining = js.Any.fromFunction1(stringContaining), stringMatching = js.Any.fromFunction1(stringMatching))
    __obj.asInstanceOf[ExpectProperties]
  }
}

