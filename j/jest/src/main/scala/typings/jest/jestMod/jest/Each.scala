package typings.jest.jestMod.jest

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  def apply(cases: js.Array[js.Array[_]]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def apply(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* arg */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
}

