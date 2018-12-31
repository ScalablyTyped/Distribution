package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingProvider extends js.Object {
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ stdLib.Node, 
      /* bindingContext */ KnockoutBindingContext, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String]
    ]
  ] = js.undefined
  def getBindings(node: stdLib.Node, bindingContext: KnockoutBindingContext): js.Object
  def nodeHasBindings(node: stdLib.Node): scala.Boolean
}

