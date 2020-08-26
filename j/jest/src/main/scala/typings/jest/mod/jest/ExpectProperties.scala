package typings.jest.mod.jest

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof jest.jest.jest.Expect ]: jest.jest.jest.Expect[K]} */
@js.native
trait ExpectProperties extends js.Object {
  var addSnapshotSerializer: js.Function1[/* serializer */ SnapshotSerializerPlugin, Unit] = js.native
  var any: js.Function1[/* classType */ js.Any, _] = js.native
  var anything: js.Function0[_] = js.native
  var arrayContaining: js.Function1[/* arr */ js.Array[_], _] = js.native
  var assertions: js.Function1[/* num */ Double, Unit] = js.native
  var extend: js.Function1[/* obj */ ExpectExtendMap, Unit] = js.native
  var getState: js.Function0[MatcherState with (Record[String, _])] = js.native
  var hasAssertions: js.Function0[Unit] = js.native
  var not: InverseAsymmetricMatchers = js.native
  var objectContaining: js.Function1[/* obj */ js.Object, _] = js.native
  var setState: js.Function1[/* state */ js.Object, Unit] = js.native
  var stringContaining: js.Function1[/* str */ String, _] = js.native
  var stringMatching: js.Function1[/* str */ String | RegExp, _] = js.native
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
  @scala.inline
  implicit class ExpectPropertiesOps[Self <: ExpectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSnapshotSerializer(value: /* serializer */ SnapshotSerializerPlugin => Unit): Self = this.set("addSnapshotSerializer", js.Any.fromFunction1(value))
    @scala.inline
    def setAny(value: /* classType */ js.Any => _): Self = this.set("any", js.Any.fromFunction1(value))
    @scala.inline
    def setAnything(value: () => _): Self = this.set("anything", js.Any.fromFunction0(value))
    @scala.inline
    def setArrayContaining(value: /* arr */ js.Array[_] => _): Self = this.set("arrayContaining", js.Any.fromFunction1(value))
    @scala.inline
    def setAssertions(value: /* num */ Double => Unit): Self = this.set("assertions", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: /* obj */ ExpectExtendMap => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setGetState(value: () => MatcherState with (Record[String, _])): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setHasAssertions(value: () => Unit): Self = this.set("hasAssertions", js.Any.fromFunction0(value))
    @scala.inline
    def setNot(value: InverseAsymmetricMatchers): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectContaining(value: /* obj */ js.Object => _): Self = this.set("objectContaining", js.Any.fromFunction1(value))
    @scala.inline
    def setSetState(value: /* state */ js.Object => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def setStringContaining(value: /* str */ String => _): Self = this.set("stringContaining", js.Any.fromFunction1(value))
    @scala.inline
    def setStringMatching(value: /* str */ String | RegExp => _): Self = this.set("stringMatching", js.Any.fromFunction1(value))
  }
  
}

