package typings
package jjvLib.jjvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var defaultOptions: Options = js.native
  def addCheck(name: java.lang.String, check: js.Function2[/* input */ js.Any, /* comparator */ js.Any, _]): scala.Unit = js.native
  def addFormat(name: java.lang.String, parse: js.Function1[/* input */ js.Any, _]): scala.Unit = js.native
  def addSchema(name: java.lang.String, schema: js.Object): scala.Unit = js.native
  def addType(name: java.lang.String, parse: js.Function1[/* input */ js.Any, _]): scala.Unit = js.native
  def addTypeCoercion(name: java.lang.String, coerce: js.Function1[/* input */ js.Any, _]): scala.Unit = js.native
  def validate(name: java.lang.String, `object`: js.Any): Errors = js.native
  def validate(name: java.lang.String, `object`: js.Any, options: Options): Errors = js.native
  def validate(schema: js.Object, `object`: js.Any): Errors = js.native
  def validate(schema: js.Object, `object`: js.Any, options: Options): Errors = js.native
}

