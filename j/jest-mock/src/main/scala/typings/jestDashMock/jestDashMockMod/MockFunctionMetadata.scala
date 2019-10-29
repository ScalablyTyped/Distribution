package typings.jestDashMock.jestDashMockMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockFunctionMetadata[T, Y /* <: js.Array[_] */, Type] extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var members: js.UndefOr[Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]] = js.undefined
  var mockImpl: js.UndefOr[js.Function1[/* args */ Y, T]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Double] = js.undefined
  var refID: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object MockFunctionMetadata {
  @scala.inline
  def apply[T, Y /* <: js.Array[_] */, Type](
    length: Int | Double = null,
    members: Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]] = null,
    mockImpl: /* args */ Y => T = null,
    name: String = null,
    ref: Int | Double = null,
    refID: Int | Double = null,
    `type`: Type = null,
    value: T = null
  ): MockFunctionMetadata[T, Y, Type] = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members)
    if (mockImpl != null) __obj.updateDynamic("mockImpl")(js.Any.fromFunction1(mockImpl))
    if (name != null) __obj.updateDynamic("name")(name)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (refID != null) __obj.updateDynamic("refID")(refID.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockFunctionMetadata[T, Y, Type]]
  }
}

