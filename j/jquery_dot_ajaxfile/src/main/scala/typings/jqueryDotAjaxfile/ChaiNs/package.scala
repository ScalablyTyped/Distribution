package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  import typings.jqueryDotAjaxfile.Object

  type AssertStatic = Assert
  type AssertionStatic = js.Function2[/* target */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type ExpectStatic = AssertionStatic
  type InstanceOf = js.Function2[/* constructor */ Object, /* message */ js.UndefOr[String], Assertion]
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], Assertion]
  type NumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], Assertion]
  type OwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], Assertion]
  type Property = js.Function3[
    /* name */ String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
}
