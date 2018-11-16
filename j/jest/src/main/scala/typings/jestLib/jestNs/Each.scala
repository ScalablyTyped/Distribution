package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  def apply(cases: js.Array[_]): js.Function2[
    /* name */ java.lang.String, 
    /* fn */ js.Function1[/* repeated */js.Any, _], 
    scala.Unit
  ] = js.native
  def apply(strings: stdLib.TemplateStringsArray, placeholders: js.Any*): js.Function2[/* name */ java.lang.String, /* fn */ js.Function1[/* arg */ js.Any, _], scala.Unit] = js.native
}

