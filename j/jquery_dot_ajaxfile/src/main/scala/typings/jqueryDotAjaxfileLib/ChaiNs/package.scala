package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type AssertStatic = Assert
  type AssertionStatic = js.Function2[/* target */ js.Any, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String], Assertion]
  type ExpectStatic = AssertionStatic
  type InstanceOf = js.Function2[/* constructor */ js.Object, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[java.lang.String], Assertion]
  type NumberComparer = js.Function2[/* value */ scala.Double, /* message */ js.UndefOr[java.lang.String], Assertion]
  type OwnProperty = js.Function2[/* name */ java.lang.String, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Property = js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    Assertion
  ]
}
