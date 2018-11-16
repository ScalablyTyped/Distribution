package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssertionResult extends js.Object {
  var ancestorTitles: js.Array[java.lang.String]
  var duration: js.UndefOr[scala.Double] = js.undefined
  var failureMessages: js.Array[java.lang.String]
  var fullName: java.lang.String
  var location: js.UndefOr[Callsite] = js.undefined
  var numPassingAsserts: scala.Double
  var status: Status
  var title: java.lang.String
}

