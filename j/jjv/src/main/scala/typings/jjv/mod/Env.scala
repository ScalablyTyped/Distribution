package typings.jjv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var defaultOptions: Options = js.native
  def addCheck(name: String, check: js.Function2[/* input */ js.Any, /* comparator */ js.Any, _]): Unit = js.native
  def addFormat(name: String, parse: js.Function1[/* input */ js.Any, _]): Unit = js.native
  def addSchema(name: String, schema: js.Object): Unit = js.native
  def addType(name: String, parse: js.Function1[/* input */ js.Any, _]): Unit = js.native
  def addTypeCoercion(name: String, coerce: js.Function1[/* input */ js.Any, _]): Unit = js.native
  def validate(name: String, `object`: js.Any): Errors = js.native
  def validate(name: String, `object`: js.Any, options: Options): Errors = js.native
  def validate(schema: js.Object, `object`: js.Any): Errors = js.native
  def validate(schema: js.Object, `object`: js.Any, options: Options): Errors = js.native
}

